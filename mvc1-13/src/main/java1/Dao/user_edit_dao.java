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

public class user_edit_dao implements user_edit_dao_int{
	/**
	 * Logger for this class
	 */
	private static final Logger logger = LogManager.getLogger(user_edit_dao.class.getName());
	
	public List<model> editt(model v){
		if (logger.isDebugEnabled()) {
			logger.debug("editt(model) - start"); //$NON-NLS-1$
		}
		
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
		//	Connection c=DriverManager.getConnection("jdbc:mysql://localhost/mvc","root","root");
			Statement st=connection.createStatement();
			ResultSet rs=st.executeQuery("SELECT demo.*,address.* FROM demo INNER JOIN address  ON demo.user_id=address.user_id WHERE demo.user_id like '"+v.getUser_id()+"%' and address.address_id like '"+v.getAddress_id()+"%'  ");
					//+ "select * from demo where user_id="+v.getUser_id()+"
			
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
				int s9=rs.getInt("phonenumber");
				int i10=rs.getInt("address_id");
				System.out.println("ad is"+i10);
				String s11=rs.getString("address");
				//System.out.println("ad is"+s10);
				String s12=rs.getString("city");
				String s13=rs.getString("state");
				String s14=rs.getString("country");
				String str2=s5;
				String Newstr1=""; 
				
				try {  
					   
				     for (int j=0;j<str2.length();j++)  
				     {  
				         char ch=Character.toLowerCase(str2.charAt(j));  
				         switch (ch)  
				         {  
				             case '{':  
				                 Newstr1=Newstr1+"A";  
				                 break;  
				             case '}':  
				                 Newstr1=Newstr1+"B";  
				                 break;  
				             case '#':  
				                 Newstr1=Newstr1+"C";  
				                 break;  
				             case '~':  
				                 Newstr1=Newstr1+"D";  
				                 break;  
				             case '+':  
				                 Newstr1=Newstr1+"E";  
				                 break;  
				             case '-':  
				                 Newstr1=Newstr1+"F";  
				                 break;  
				             case '*':  
				                 Newstr1=Newstr1+"G";  
				                 break;  
				             case '@':  
				                 Newstr1=Newstr1+"H";  
				                 break;  
				             case '/':  
				                 Newstr1=Newstr1+"I";  
				                 break;  
				             case '\\':  
				                 Newstr1=Newstr1+"J";  
				                 break;  
				             case '?':  
				                 Newstr1=Newstr1+"K";  
				                 break;  
				             case '$':  
				                 Newstr1=Newstr1+"L";  
				                 break;  
				             case '!':  
				                 Newstr1=Newstr1+"M";  
				                 break;  
				             case '^':  
				                 Newstr1=Newstr1+"N";  
				                 break;  
				             case '(':  
				                 Newstr1=Newstr1+"O";  
				                 break;  
				             case ')':  
				                 Newstr1=Newstr1+"P";  
				                 break;  
				             case '<':  
				                 Newstr1=Newstr1+"Q";  
				                 break;  
				             case '>':  
				                 Newstr1=Newstr1+"R";  
				                 break;  
				             case '=' :  
				                 Newstr1=Newstr1+"S";  
				                 break;  
				             case ';':  
				                 Newstr1=Newstr1+"T";  
				                 break;  
				             case ',':  
				                 Newstr1=Newstr1+"U";  
				                 break;  
				             case '_' :  
				                 Newstr1=Newstr1+"V";  
				                 break;  
				             case '[':  
				                 Newstr1=Newstr1+"W";  
				                 break;  
				             case ']' :  
				                 Newstr1=Newstr1+"X";  
				                 break;  
				             case ':':  
				                 Newstr1=Newstr1+"Y";  
				                 break;  
				             case '\"' :  
				                 Newstr1=Newstr1+"Z";  
				                 break;       
				             case '1':  
				                 Newstr1=Newstr1+"r";  
				                 break;  
				             case '2':  
				                 Newstr1=Newstr1+"k";  
				                 break;  
				             case '3':  
				                 Newstr1=Newstr1+"b";  
				                 break;  
				             case '4':  
				                 Newstr1 = Newstr1+"e";  
				                 break;  
				             case '5':  
				                 Newstr1 = Newstr1+"q";  
				                 break;  
				             case '6':  
				                 Newstr1 = Newstr1+"h";  
				                 break;  
				             case '7':  
				                 Newstr1 = Newstr1+"u";  
				                 break;  
				             case '8' :  
				                 Newstr1= Newstr1+"y";  
				                 break;  
				             case '9':  
				                 Newstr1 = Newstr1+"w";  
				                 break;  
				             case '0':  
				                 Newstr1 = Newstr1+"z";  
				                 break;  
				              default:  
				                 Newstr1=Newstr1+"0";  
				                 break;  
				         }  
				     }  
				     }  
				     catch(Exception ioe)  
				     {
					logger.error("editt(model)", ioe); //$NON-NLS-1$
  
				         ioe.printStackTrace();  
				     }  
				     System.out.println("The decrypted string is: " +Newstr1); 
				
				v1.setUser_id(i);
				v1.setFname(s1);
				v1.setMname(s2);
				v1.setLname(s3);
				v1.setEmailid(s4);
				v1.setPassword(Newstr1);
				v1.setGender(s6);
				v1.setLanguage(s7);
				v1.setDob(s8);
				v1.setPhonenumber(s9);
				v1.setAddress_id(i10);
				v1.setAddress(s11);
				v1.setCity(s12);
				v1.setState(s13);
				v1.setCountry(s14);
			
				ls.add(v1);
			}
			
		}	
		catch(Exception e)
		{
			logger.error("editt(model)", e); //$NON-NLS-1$
			

			System.out.println(e);
		}

		
		if (logger.isDebugEnabled()) {
			logger.debug("editt(model) - end"); //$NON-NLS-1$
		}
		return ls;
		
	}

}
