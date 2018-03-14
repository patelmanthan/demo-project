package service;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.LogManager;





import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.AddressModel;
import model.model;
import Dao.data_insert_dao;
import Dao.data_insert_dao_int;

public class datainsert implements datainsertint {
	/**
	 * Logger for this class
	 */
	private static final Logger logger = LogManager.getLogger(datainsert.class.getName());

	public void insert(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException {
		model bean=new model();
		String fname=request.getParameter("fname");
		String mname=request.getParameter("mname");
		String lname=request.getParameter("lname");
		String emailid=request.getParameter("emailid");
		String password=request.getParameter("password");
		String gender=request.getParameter("gender");
		String language=request.getParameter("language");
		String dob=request.getParameter("dob");
		int phonenumber=Integer.parseInt(request.getParameter("phonenumber"));
		String[] address=request.getParameterValues("address");
		String[] city=request.getParameterValues("city");
		String[] state=request.getParameterValues("state");
		String[] country=request.getParameterValues("country");
		  String Newstr="";
		int no = city.length-1;
		
       // String uname=request.getParameter("txtUsername");
        
    

		 try {  
			  
		    
		        for (int i=0;i<password.length();i++)  
		        {  
		            char ch=Character.toLowerCase(password.charAt(i));  
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
		bean.setFname(fname);
		bean.setMname(mname);
		bean.setLname(lname);
		bean.setEmailid(emailid);
		bean.setPassword(Newstr);
		bean.setGender(gender);
		bean.setLanguage(language);
		bean.setDob(dob);
		bean.setPhonenumber(phonenumber);
		// TODO Auto-generated method stub
		AddressModel am[] = new AddressModel[no];
		for(int i=0;i<no;i++){
			am[i] = new AddressModel();
			am[i].setAddress(address[i]);
			am[i].setCity(city[i]);
			am[i].setState(state[i]);
			am[i].setCountry(country[i]);
		}
		data_insert_dao_int datainsert = new data_insert_dao();

		try {
			datainsert.insert(bean,am,response);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
