package Dao;

import org.apache.log4j.Logger;
import org.apache.log4j.LogManager;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import model.model;

import com.mysql.cj.jdbc.Blob;

public class image_dao implements image_dao_int{
	/**
	 * Logger for this class
	 */
	private static final Logger logger = LogManager.getLogger(image_dao.class.getName());

	public void imagee(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
		if (logger.isDebugEnabled()) {
			logger.debug("imagee(HttpServletRequest, HttpServletResponse) - start"); //$NON-NLS-1$
		}
		
		//String connectionURL = "jdbc:mysql://localhost:3306/mvc";
		//String user = "root";
		//String pass = "root";
		model m=new model();
		int result = 0;
		//Connection con = null;
		String name= request.getParameter("name");
		Part part = request.getPart("image");
		
		m.setName(name);
 
		if(part != null){
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
					   Connection connection = DriverManager.getConnection(url, username,
					     password);

					   if (connection != null) {
					    System.out
					      .println("connection created successfully using properties file");
					   }

					   else {
					    System.out.println(" unable to create connection");
					   }
			//	Class.forName("com.mysql.cj.jdbc.Driver");
			   // con = DriverManager.getConnection(connectionURL, user, pass);
			    
			    PreparedStatement ps = connection.prepareStatement("insert into data(name,image) values(?,?)");
			
			    InputStream is = part.getInputStream();
			    
			    ps.setString(1,m.getName());
			    ps.setBlob(2, is);
			    result = ps.executeUpdate();
			}
			catch(Exception e){
				logger.error("imagee(HttpServletRequest, HttpServletResponse)", e); //$NON-NLS-1$
				

				e.printStackTrace();
			}	
			/*finally{
				if(con != null){
					try{
						con.close();
					}
					catch(Exception e){
						logger.error("imagee(HttpServletRequest, HttpServletResponse)", e); //$NON-NLS-1$
						

						e.printStackTrace();
					}
				}
			}*/
		}
		
		if(result > 0){
	    	//resp.sendRedirect("result.jsp?message=Image+Uploaded");
	    	response.setContentType("text/html");  
	        PrintWriter out = response.getWriter();    
	        out.println("<script>alert('Image upload successfully!!');document.location='view.jsp';</script>");
	    }
		else{
			//response.sendRedirect("result.jsp?message=Some+Error+Occurred");
			response.setContentType("text/html");  
	        PrintWriter out = response.getWriter();    
	        out.println("<script>alert('Image not upload successfully!!')");
		}
		
		if (logger.isDebugEnabled()) {
			logger.debug("imagee(HttpServletRequest, HttpServletResponse) - end"); //$NON-NLS-1$
		}
	}
	
	public void get_imagee(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
		if (logger.isDebugEnabled()) {
			logger.debug("get_imagee(HttpServletRequest, HttpServletResponse) - start"); //$NON-NLS-1$
		}
	
	
		
		String id = request.getParameter("id");
		 
		String connectionURL = "jdbc:mysql://localhost:3306/mvc";
		String user = "root";
		String pass = "root";
		 
		Connection con = null;
		 
		try{
		    Class.forName("com.mysql.cj.jdbc.Driver");
		    con = DriverManager.getConnection(connectionURL, user, pass);
		    
		    PreparedStatement ps = con.prepareStatement("select * from data where id=?");
		    ps.setString(1, id);
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
			logger.error("get_imagee(HttpServletRequest, HttpServletResponse)", e); //$NON-NLS-1$

		    e.printStackTrace();
		}   
		finally{
		    if(con != null){
		        try{
		            con.close();
		        }
		        catch(Exception e){
					logger.error("get_imagee(HttpServletRequest, HttpServletResponse)", e); //$NON-NLS-1$

		            e.printStackTrace();
		        }
		    }
		}
		
		if (logger.isDebugEnabled()) {
			logger.debug("get_imagee(HttpServletRequest, HttpServletResponse) - end"); //$NON-NLS-1$
		}
	}
}
