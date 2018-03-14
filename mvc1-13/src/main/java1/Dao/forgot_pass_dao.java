package Dao;

import org.apache.log4j.Logger;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.LogManager;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class forgot_pass_dao implements forgot_pass_dao_int{
	/**
	 * Logger for this class
	 */
	private static final Logger logger = LogManager.getLogger(forgot_pass_dao.class.getName());
	
	public void forgotpass(HttpServletRequest request,HttpServletResponse response)
	{
		if (logger.isDebugEnabled()) {
			logger.debug("forgotpass(HttpServletRequest, HttpServletResponse) - start"); //$NON-NLS-1$
		}

		String emailid=request.getParameter("emailid");
		String newpass=request.getParameter("newpass");
		String renewpass=request.getParameter("renewpass");
		
		System.out.println("Email id is"+emailid);
		System.out.println("New Password is"+newpass);
		System.out.println("confirm password is"+renewpass);		
		 String Newstr="";  

	        try {  
	  
	        for (int i=0;i<newpass.length();i++)  
	        {  
	            char ch=Character.toLowerCase(newpass.charAt(i));  
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
			logger.error("forgotpass(HttpServletRequest, HttpServletResponse)", ioe); //$NON-NLS-1$
  
	            ioe.printStackTrace();  
	        }  
	        System.out.println("The encrypted string is: \n" +Newstr);
		
		/*String connectionURL = "jdbc:mysql://localhost:3306/mvc";
		Connection con=null;*/
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
			 
				   try {
					Class.forName(driver);
				} catch (ClassNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				   Connection connection = null;
				try {
					connection = DriverManager.getConnection(url, username,password);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

				   if (connection != null) {
				    System.out
				      .println("connection created successfully using properties file");
				   }

				   else {
				    System.out.println(" unable to create connection");
				   }
		String email="";
		int user_id=0;
		try{
			//Class.forName("com.mysql.cj.jdbc.Driver");
			//connection = DriverManager.getConnection(url, "root", "root");
			Statement st=connection.createStatement();
			ResultSet rs=st.executeQuery("select * from demo where emailid='" + emailid + "'");
			while(rs.next()){
				user_id=rs.getInt(1);
				email=rs.getString(5);
			}
			System.out.println(user_id+email);
			if(email.equals(emailid)){
				Statement st1=connection.createStatement();
				int i=st1.executeUpdate("update demo set password='"+Newstr+"' where user_id='"+user_id+"'");
				response.setContentType("text/html");  
		        PrintWriter out = response.getWriter();    
		        out.println("<script>alert('thanq you!!, password change successfully!!');document.location='login.jsp';</script>");
		        out.close(); 
				System.out.println("Password changed successfully");
				st1.close();
				connection.close();
			}
			else{
				response.setContentType("text/html");  
		        PrintWriter out = response.getWriter();    
		        out.print("Invalid Emailid");
		        out.println("<script>alert('password  not change successfully!!');document.location='forgotpass.jsp';</script>");
		        out.close(); 
		        System.out.println("Invalid Current Password");
			}
		}
		catch(Exception e){
			logger.error("forgotpass(HttpServletRequest, HttpServletResponse)", e); //$NON-NLS-1$
			

			System.out.println(e);
		}	

		if (logger.isDebugEnabled()) {
			logger.debug("forgotpass(HttpServletRequest, HttpServletResponse) - end"); //$NON-NLS-1$
		}
	}

}
