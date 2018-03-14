package Dao;

import org.apache.log4j.Logger;
import org.apache.log4j.LogManager;



import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Properties;

import model.model;

public class admin_delete_dao implements admin_delete_dao_int{
	/**
	 * Logger for this class
	 */
	private static final Logger logger = LogManager.getLogger(admin_delete_dao.class.getName());
	
	public void delete(model bean) throws Exception {
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
		//Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mvc","root","root");
		Statement st=connection.createStatement();
		st.executeUpdate("delete from demo where user_id="+bean.getUser_id()+"");
		System.out.println("done");

	}
	
}
