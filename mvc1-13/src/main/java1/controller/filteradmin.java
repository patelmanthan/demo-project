package controller;

import model.model;

import org.apache.log4j.Logger;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.LogManager;
import org.apache.log4j.PropertyConfigurator;

import com.mysql.cj.api.jdbc.Statement;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet Filter implementation class filteradmin
 */
public class filteradmin implements Filter {
	/**
	 * Logger for this class
	 */
	private static final Logger logger = LogManager.getLogger(filteradmin.class.getName());

    /**
     * Default constructor. 
     */
    public filteradmin() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws IOException, ServletException {
		if (logger.isDebugEnabled()) {
			logger.debug("doFilter(ServletRequest, ServletResponse, FilterChain) - start"); //$NON-NLS-1$
			
		}

		// TODO Auto-generated method stub
		
		PrintWriter out=resp.getWriter();  
	    String password=req.getParameter("login_password");  
	    if(password.equals("adminonly")){  
	    chain.doFilter(req, resp);//sends request to next resource  
	    }   
	    else{
	    	/* RequestDispatcher rd=req.getRequestDispatcher("user_select");  
	    	    rd.include(req, resp); */ 
	    
	    	String login_emailid = req.getParameter("login_emailid");
	    	String login_password = req.getParameter("login_password");
			System.out.println("email id is" +login_emailid);
			System.out.println("password is" +login_password);
			
			 String Newstr="";  
		        try {  
		  
		        for (int i=0;i<login_password.length();i++)  
		        {  
		            char ch=Character.toLowerCase(login_password.charAt(i));  
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
			
			try{
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/mvc","root","root");
				Statement st=(Statement) c.createStatement();
				ResultSet rs=st.executeQuery("select * from demo where password='"+Newstr+"'");
				System.out.println("session login data  "+Newstr);
				if(rs.next())
				{
					
					RequestDispatcher rd1=req.getRequestDispatcher("user_select");  
				    rd1.include(req, resp); 
					System.out.println("welcome " + login_emailid);
				}
				
				else{
					System.out.println("Invalid password");
					RequestDispatcher rd1=req.getRequestDispatcher("invalid_pass.jsp");  
				    rd1.include(req, resp); 		
				}
			}
			catch(Exception e)
			{
			

				System.out.println(e);
			}
	    }
			
		if (logger.isDebugEnabled()) {
			logger.debug("doFilter(ServletRequest, ServletResponse, FilterChain) - end"); //$NON-NLS-1$
		}
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
