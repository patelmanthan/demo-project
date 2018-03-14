package service;

import model.model;

import org.apache.log4j.Logger;
import org.apache.log4j.LogManager;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import Dao.login_validation_dao;
import Dao.login_validation_dao_int;

public class user_select_service  implements user_select_service_int{
	/**
	 * Logger for this class
	 */
	private static final Logger logger = LogManager.getLogger(user_select_service.class.getName());

	public void login_validationn(HttpServletRequest request,HttpServletResponse response) {
	
		String login_emailid = request.getParameter("login_emailid"); 
		String login_password = request.getParameter("login_password");
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
		
		model v=new model();
		v.setLogin_emailid(login_emailid);
		v.setLogin_password(Newstr);
		login_validation_dao_int user_select=new login_validation_dao();
		java.util.List<model> ls=user_select.login_validation(v,request,response);
		HttpSession session = request.getSession();
		session.setAttribute("List",ls);
		

		
	}

}
