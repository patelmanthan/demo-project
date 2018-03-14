package Dao;

import org.apache.log4j.Logger;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.LogManager;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Properties;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.model;

public class contact_insert_dao implements contact_insert_dao_int {
	/**
	 * Logger for this class
	 */
	private static final Logger logger = LogManager.getLogger(contact_insert_dao.class.getName());
	
	public void contactinsert(model bean) throws Exception {
		if (logger.isDebugEnabled()) {
			logger.debug("contactinsert(model) - start"); //$NON-NLS-1$
		}
	

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
			//Class.forName("com.mysql.cj.jdbc.Driver");
			//Connection c=DriverManager.getConnection("jdbc:mysql://localhost/mvc","root","root");
			PreparedStatement pes = connection.prepareStatement("insert into contact(name,emailid,message) values(?,?,?)");
			pes.setString(1,bean.getName());
			pes.setString(2,bean.getEmailid());
			pes.setString(3,bean.getMessage());
			pes.executeUpdate();
		}
		catch(Exception e)
		{
			logger.error("contactinsert(model)", e); //$NON-NLS-1$
		
			e.printStackTrace();
		}

		
		if (logger.isDebugEnabled()) {
			logger.debug("contactinsert(model) - end"); //$NON-NLS-1$
		}
	}
	
	
	

}
