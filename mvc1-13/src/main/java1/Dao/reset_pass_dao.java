package Dao;

import org.apache.log4j.Logger;
import org.apache.log4j.LogManager;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.model;

public class reset_pass_dao implements reset_pass_dao_int {
	/**
	 * Logger for this class
	 */
	private static final Logger logger = LogManager.getLogger(reset_pass_dao.class.getName());
	
	public void resetpass(HttpServletRequest request,HttpServletResponse response)
	{
		model m=new model();
		String oldpass=request.getParameter("oldpass");
		String newpass=request.getParameter("newpass");
		String renewpass=request.getParameter("renewpass");
		System.out.println(oldpass);
		System.out.println(newpass);
		System.out.println(renewpass);
		
		 String Newstr1="";  
	       
	        try {  

	        for (int i=0;i<newpass.length();i++)  
	        {  
	            char ch=Character.toLowerCase(newpass.charAt(i));  
	            switch (ch)  
	            {  
	                case 'a':  
	                    Newstr1=Newstr1+"{";  
	                    break;  
	                case 'b':  
	                    Newstr1=Newstr1+"}";  
	                    break;  
	                case 'c':  
	                    Newstr1=Newstr1+"#";  
	                    break;  
	                case 'd':  
	                    Newstr1=Newstr1+"~";  
	                    break;  
	                case 'e':  
	                    Newstr1=Newstr1+"+";  
	                    break;  
	                case 'f':  
	                    Newstr1=Newstr1+"-";  
	                    break;  
	                case 'g':  
	                    Newstr1=Newstr1+"*";  
	                    break;  
	                case 'h':  
	                    Newstr1=Newstr1+"@";  
	                    break;  
	                case 'i':  
	                    Newstr1=Newstr1+"/";  
	                    break;  
	                case 'j':  
	                    Newstr1=Newstr1+"\\";  
	                    break;  
	                case 'k':  
	                    Newstr1=Newstr1+"?";  
	                    break;  
	                case 'l':  
	                    Newstr1=Newstr1+"$";  
	                    break;  
	                case 'm':  
	                    Newstr1=Newstr1+"!";  
	                    break;  
	                case 'n':  
	                    Newstr1=Newstr1+"^";  
	                    break;  
	                case 'o':  
	                    Newstr1=Newstr1+"(";  
	                    break;  
	                case 'p':  
	                    Newstr1=Newstr1+")";  
	                    break;  
	                case 'q':  
	                    Newstr1=Newstr1+"<";  
	                    break;  
	                case 'r':  
	                    Newstr1=Newstr1+">";  
	                    break;  
	                case 's' :  
	                    Newstr1=Newstr1+"=";  
	                    break;  
	                case 't':  
	                    Newstr1=Newstr1+";";  
	                    break;  
	                case 'u':  
	                    Newstr1=Newstr1+",";  
	                    break;  
	                case 'v' :  
	                    Newstr1=Newstr1+"_";  
	                    break;  
	                case 'w':  
	                    Newstr1=Newstr1+"[";  
	                    break;  
	                case 'x' :  
	                    Newstr1=Newstr1+"]";  
	                    break;  
	                case 'y':  
	                    Newstr1=Newstr1+":";  
	                    break;  
	                case 'z' :  
	                    Newstr1=Newstr1+"\"";  
	                    break;  
	                case ' ' :  
	                    Newstr1=Newstr1+" ";  
	                    break;  
	                case '.':  
	                    Newstr1=Newstr1+'3';  
	                    break;  
	                case ',':  
	                    Newstr1=Newstr1+"1";  
	                    break;  
	                case '(':  
	                    Newstr1=Newstr1+'4';  
	                    break;  
	                case '\"':  
	                    Newstr1=Newstr1+'5';  
	                    break;  
	                case ')' :  
	                    Newstr1=Newstr1+"7";  
	                    break;  
	                case '?' :  
	                    Newstr1= Newstr1+"2";  
	                    break;  
	                case '!':  
	                    Newstr1= Newstr1+"8";  
	                    break;  
	                case '-' :  
	                    Newstr1= Newstr1+"6";  
	                    break;  
	                case '%' :  
	                    Newstr1 = Newstr1+"9";  
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
	            ioe.printStackTrace();  
	        }  
	        System.out.println("The encrypted string is: \n" +Newstr1);        
			String Newstr="";  
		       
		        try {  

		        for (int i=0;i<oldpass.length();i++)  
		        {  
		            char ch=Character.toLowerCase(oldpass.charAt(i));  
		            switch (ch)  
		            {  
		                case 'a':  
		                    Newstr=Newstr+"{";  
		                    break;  
		                case 'b':  
		                    Newstr=Newstr+"}";  
		                    break;  
		                case 'c':  
		                    Newstr=Newstr+"#";  
		                    break;  
		                case 'd':  
		                    Newstr=Newstr+"~";  
		                    break;  
		                case 'e':  
		                    Newstr=Newstr+"+";  
		                    break;  
		                case 'f':  
		                    Newstr=Newstr+"-";  
		                    break;  
		                case 'g':  
		                    Newstr=Newstr+"*";  
		                    break;  
		                case 'h':  
		                    Newstr=Newstr+"@";  
		                    break;  
		                case 'i':  
		                    Newstr=Newstr+"/";  
		                    break;  
		                case 'j':  
		                    Newstr=Newstr+"\\";  
		                    break;  
		                case 'k':  
		                    Newstr=Newstr+"?";  
		                    break;  
		                case 'l':  
		                    Newstr=Newstr+"$";  
		                    break;  
		                case 'm':  
		                    Newstr=Newstr+"!";  
		                    break;  
		                case 'n':  
		                    Newstr=Newstr+"^";  
		                    break;  
		                case 'o':  
		                    Newstr=Newstr+"(";  
		                    break;  
		                case 'p':  
		                    Newstr=Newstr+")";  
		                    break;  
		                case 'q':  
		                    Newstr=Newstr+"<";  
		                    break;  
		                case 'r':  
		                    Newstr=Newstr+">";  
		                    break;  
		                case 's' :  
		                    Newstr=Newstr+"=";  
		                    break;  
		                case 't':  
		                    Newstr=Newstr+";";  
		                    break;  
		                case 'u':  
		                    Newstr=Newstr+",";  
		                    break;  
		                case 'v' :  
		                    Newstr=Newstr+"_";  
		                    break;  
		                case 'w':  
		                    Newstr=Newstr+"[";  
		                    break;  
		                case 'x' :  
		                    Newstr=Newstr+"]";  
		                    break;  
		                case 'y':  
		                    Newstr=Newstr+":";  
		                    break;  
		                case 'z' :  
		                    Newstr=Newstr+"\"";  
		                    break;  
		                case ' ' :  
		                    Newstr=Newstr+" ";  
		                    break;  
		                case '.':  
		                    Newstr=Newstr+'3';  
		                    break;  
		                case ',':  
		                    Newstr=Newstr+"1";  
		                    break;  
		                case '(':  
		                    Newstr=Newstr+'4';  
		                    break;  
		                case '\"':  
		                    Newstr=Newstr+'5';  
		                    break;  
		                case ')' :  
		                    Newstr=Newstr+"7";  
		                    break;  
		                case '?' :  
		                    Newstr= Newstr+"2";  
		                    break;  
		                case '!':  
		                    Newstr= Newstr+"8";  
		                    break;  
		                case '-' :  
		                    Newstr= Newstr+"6";  
		                    break;  
		                case '%' :  
		                    Newstr = Newstr+"9";  
		                    break;  
		                case '1':  
		                    Newstr=Newstr+"r";  
		                    break;  
		                case '2':  
		                    Newstr=Newstr+"k";  
		                    break;  
		                case '3':  
		                    Newstr=Newstr+"b";  
		                    break;  
		                case '4':  
		                    Newstr = Newstr+"e";  
		                    break;  
		                case '5':  
		                    Newstr = Newstr+"q";  
		                    break;  
		                case '6':  
		                    Newstr = Newstr+"h";  
		                    break;  
		                case '7':  
		                    Newstr = Newstr+"u";  
		                    break;  
		                case '8' :  
		                    Newstr= Newstr+"y";  
		                    break;  
		                case '9':  
		                    Newstr = Newstr+"w";  
		                    break;  
		                case '0':  
		                    Newstr = Newstr+"z";  
		                    break;  
		                 default:  
		                    Newstr=Newstr+"0";  
		                    break;  
		            }  
		        }  
		        }  
		        catch(Exception ioe)  
		        {  
		            ioe.printStackTrace();  
		        }  
		        System.out.println("The encrypted string is: \n" +Newstr);
			
	        
		
		//String connectionURL = "jdbc:mysql://localhost:3306/mvc";
		//Connection con=null;
		//String pass="";
		int user_id=0;
		String pass="";
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
		//con = DriverManager.getConnection(connectionURL, "root", "root");
		Statement st=connection.createStatement();
		ResultSet rs=st.executeQuery("select * from demo where password='" + Newstr + "'");
		while(rs.next()){
		user_id=rs.getInt(1);
		 pass=rs.getString(6);
		System.out.println("p is"+pass);
		
		}
		System.out.println(user_id+ "userid "+pass);
		if(pass.equals(Newstr)){
		Statement st1=connection.createStatement();
		int i=st1.executeUpdate("update demo set password='"+Newstr1+"' where user_id='"+user_id+"'");
		System.out.println("Password changed successfully");
		response.setContentType("text/html");  
        PrintWriter out = response.getWriter();
        out.println("<script>alert('thanq you!!, password change successfully!!');document.location='login.jsp';</script>");
		st1.close();
		connection.close();
		}
		else{
		System.out.println("Invalid Current Password");
		response.setContentType("text/html");  
        PrintWriter out = response.getWriter(); 
        out.println("<script>alert('password not change successfully!!');document.location='resetpass.jsp';</script>");
	    out.print("Retrun to Reset password page");
		}
		}
		catch(Exception e){
			

		System.out.println(e);
		}

	}

}
