package Dao;

import org.apache.log4j.Logger;
import org.apache.log4j.LogManager;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import model.model;

public class admin_select_dao implements admin_select_dao_int{
	/**
	 * Logger for this class
	 */
	private static final Logger logger = LogManager.getLogger(admin_select_dao.class.getName());

	public List<model> select(model v){
	

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
			ResultSet rs=st.executeQuery("SELECT demo.*,address.* FROM demo INNER JOIN address  ON demo.user_id=address.user_id");
			
			while(rs.next())
			{
				model v1=new model();
				int i=rs.getInt("user_id");	
				String s1=rs.getString("fname");
				String s2=rs.getString("mname");
				String s3=rs.getString("lname");
				String s4=rs.getString("emailid");
				String s5=rs.getString("password");
				String s6=rs.getString("gender");
				String s7=rs.getString("language");
				String s8=rs.getString("dob");
				Integer s9=rs.getInt("phonenumber");
				String s10=rs.getString("address");
				String s11=rs.getString("city");
				String s12=rs.getString("state");
				String s13=rs.getString("country");
				int i1=rs.getInt("address_id");
		
				v1.setUser_id(i);
				v1.setFname(s1);
				v1.setMname(s2);
				v1.setLname(s3);
				v1.setEmailid(s4);
				v1.setPassword(s5);
				v1.setGender(s6);
				v1.setLanguage(s7);
				v1.setDob(s8);
				v1.setPhonenumber(s9);
				v1.setAddress(s10);
				v1.setCity(s11);
				v1.setState(s12);
				v1.setCountry(s13);
				v1.setAddress_id(i1);
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
