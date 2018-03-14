package Dao;

import org.apache.log4j.Logger;
import org.apache.log4j.LogManager;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import model.AddressModel;
import model.model;

public class data_insert_dao  implements data_insert_dao_int{
	/**
	 * Logger for this class
	 */
	private static final Logger logger = LogManager.getLogger(data_insert_dao.class.getName());
	
	public void insert(model bean,AddressModel[] am,HttpServletResponse response) throws Exception {
		
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
		try {
            PreparedStatement pss=connection.prepareStatement("select emailid from demo where emailid='"+bean.getEmailid()+"'");
            ResultSet rss=pss.executeQuery();
            if(rss.next()){
            	System.out.println("available");
            	response.setContentType("text/html");  
                PrintWriter out = response.getWriter();    
                out.println("<script>alert('Email Id already exists!!');document.location='registration.jsp';</script>");
            }
            else{
            	System.out.println("not");
                PreparedStatement pes = connection.prepareStatement("insert into demo(fname,mname,lname,emailid,password,Gender,language,Dob,phonenumber) values(?,?,?,?,?,?,?,?,?)");
				pes.setString(1,bean.getFname());
				pes.setString(2,bean.getMname());
				pes.setString(3,bean.getLname());
				pes.setString(4,bean.getEmailid());
				pes.setString(5,bean.getPassword());
				pes.setString(6,bean.getGender());
				pes.setString(7,bean.getLanguage());
				pes.setString(8,bean.getDob());
				pes.setInt(9,bean.getPhonenumber());
	
				int p=pes.executeUpdate();
				String selectSQL = "SELECT user_id FROM demo WHERE emailid='"+bean.getEmailid()+"';";
				Statement st = connection.createStatement();
				ResultSet rs = st.executeQuery(selectSQL);
				// user_id = 0;
				while (rs.next()) {			
					int user_id = rs.getInt("user_id");
					bean.setUser_id(user_id);
				}
				Class.forName("com.mysql.jdbc.Driver");
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost/mvc","root","root");
				PreparedStatement ps1 = con.prepareStatement("insert into address(user_id,address,city,state,country) values(?,?,?,?,?)");
				System.out.println("Before query Fire");
				
				for (int i = 0; i < am.length; i++) {
					ps1.setInt(1,bean.getUser_id());				
					ps1.setString(2,am[i].getAddress());
					ps1.setString(3,am[i].getCity());
					ps1.setString(4,am[i].getState());
					ps1.setString(5,am[i].getCountry());
					ps1.addBatch();
				}
				System.out.println("After Query Fired");
				int[] rowaffected =  ps1.executeBatch();
				System.out.println("Address table inst");
				  
            }
		}
		catch(Exception e){
			e.printStackTrace();
		}
	    connection.close();
	    } catch (ClassNotFoundException e) {
	         // TODO Auto-generated catch block
	         e.printStackTrace();
	      } 
	}
		
}


