package Dao;

import org.apache.log4j.Logger;
import org.apache.log4j.LogManager;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import model.model;

public class admin_update_dao implements admin_update_dao_int{
	/**
	 * Logger for this class
	 */
	private static final Logger logger = LogManager.getLogger(admin_update_dao.class.getName());
	
	public List<model> update(model v)
	{

		List<model> ls=new ArrayList<model>();
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
			//Class.forName("com.mysql.jdbc.Driver");
			//Connection c=DriverManager.getConnection("jdbc:mysql://localhost/mvc","root","root");
			Statement st=connection.createStatement();
			st.executeUpdate("update demo set fname='"+v.getFname()+"',mname='"+v.getMname()+"',lname='"+v.getLname()+"',emailid='"+v.getEmailid()+"',password='"+v.getPassword()+"',gender='"+v.getGender()+"',language='"+v.getLanguage()+"',dob='"+v.getDob()+"',phonenumber='"+v.getPhonenumber()+"' where user_id='"+v.getUser_id()+"'");
			Statement st1=connection.createStatement();
			st1.executeUpdate("update address set address='"+v.getAddress()+"',city='"+v.getCity()+"',state='"+v.getState()+"',country='"+v.getCountry()+"' where address_id='"+v.getAddress_id()+"'");
		}		
		catch(Exception e)
			{

			System.out.println(e);
			}

		
			return ls;
		}

}
