package Dao;

import org.apache.log4j.Logger;
import org.apache.log4j.LogManager;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import model.model;

public class contact_show_dao implements contact_show_dao_int {
	/**
	 * Logger for this class
	 */
	private static final Logger logger = LogManager.getLogger(contact_show_dao.class.getName());
	
	public List<model> contactshow(model v){
	
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
			//Class.forName("com.mysql.cj.jdbc.Driver");
			//Connection c=DriverManager.getConnection("jdbc:mysql://localhost/mvc","root","root");
			Statement st=connection.createStatement();
			ResultSet rs=st.executeQuery("select * from contact");
			while(rs.next())
			{
				model v1=new model();
				int i=rs.getInt("id");	
				String s1=rs.getString("name");
				String s2=rs.getString("emailid");
				String s3=rs.getString("message");
		
				v1.setId(i);
				v1.setName(s1);
				v1.setEmailid(s2);
				v1.setMessage(s3);
				ls.add(v1);
			}
		}
		catch(Exception e)
		{
			

			System.out.println(e);
		}

		
		return ls;
	}
	
}
