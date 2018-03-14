package Dao;

import org.apache.log4j.Logger;
import org.apache.log4j.LogManager;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.cj.jdbc.Blob;

public class get_image_dao implements get_image_dao_int {
	/**
	 * Logger for this class
	 */
	private static final Logger logger = LogManager.getLogger(get_image_dao.class.getName());
	
	public void imagee(HttpServletRequest request, HttpServletResponse response){
		if (logger.isDebugEnabled()) {
			logger.debug("imagee(HttpServletRequest, HttpServletResponse) - start"); //$NON-NLS-1$
		}

		String name = request.getParameter("name");
		 
		//String connectionURL = "jdbc:mysql://localhost:3306/mvc";
		//String user = "root";
		//String pass = "root";
		 
		//Connection connection = null;
		 
		try{
			InputStream inputStream = getClass().getResourceAsStream("../database.properties");
			  Properties properties = new Properties();
			  try {
				   properties.load(inputStream);
				  } catch (IOException e) {
				   // TODO Auto-generated catch block
				   e.printStackTrace();
				  }
			  String driver = properties.getProperty("jdbc.driver");
			  String url = properties.getProperty("jdbc.url");
			  String username = properties.getProperty("jdbc.username");
			  String password = properties.getProperty("jdbc.password");
			 
				   Class.forName(driver);
				   Connection connection = DriverManager.getConnection(url, username,password);

				   if (connection != null) {
				    System.out
				      .println("connection created successfully using properties file");
				   }

				   else {
				    System.out.println(" unable to create connection");
				   }
		   // Class.forName("com.mysql.cj.jdbc.Driver");
		  //  connection = DriverManager.getConnection(url, username, password);
		    
		    PreparedStatement ps = connection.prepareStatement("select * from data where name=?");
		    ps.setString(1, name);
		    ResultSet rs = ps.executeQuery();
		 
		    if(rs.next()){
		        Blob blob = (Blob) rs.getBlob("image");
		        byte byteArray[] = blob.getBytes(1, (int)blob.length());
		 
		        response.setContentType("image/gif");
		        OutputStream os = response.getOutputStream();
		        os.write(byteArray);
		        os.flush();
		        os.close();
		    }
		}
		catch(Exception e){
			logger.error("imagee(HttpServletRequest, HttpServletResponse)", e); //$NON-NLS-1$

		    e.printStackTrace();
		}   
	/*	finally{
		    if(connection != null){
		        try{
		            connection.close();
		        }
		        catch(Exception e){
					logger.error("imagee(HttpServletRequest, HttpServletResponse)", e); //$NON-NLS-1$

		            e.printStackTrace();
		        }
		    }
		}*/

		if (logger.isDebugEnabled()) {
			logger.debug("imagee(HttpServletRequest, HttpServletResponse) - end"); //$NON-NLS-1$
		}
	}

}
