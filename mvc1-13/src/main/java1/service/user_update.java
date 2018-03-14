package service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import model.model;
import Dao.admin_update_dao;
import Dao.admin_update_dao_int;
import Dao.user_update_dao;
import Dao.user_update_dao_int;

public class user_update implements user_update_int {
	
public void user_updatee(HttpServletRequest request){
		
		// TODO Auto-generated method stub
		String h1 = request.getParameter("fname");
		String h2= request.getParameter("mname");
		String h3= request.getParameter("lname");
		String h4= request.getParameter("emailid");
		String h5= request.getParameter("password");
		String h6= request.getParameter("gender");
		String h7= request.getParameter("language");
		String h8= request.getParameter("dob");
		int i1=Integer.parseInt(request.getParameter("phonenumber"));
		int i=Integer.parseInt(request.getParameter("user_id"));
		int i2=Integer.parseInt(request.getParameter("address_id"));
		String h9= request.getParameter("address");
		String h10= request.getParameter("city");
		String h11= request.getParameter("state");
		String h12= request.getParameter("country");	
		String Newstr="";  

	        try {  
	
	        for (int j=0;j<h5.length();j++)  
	        {  
	            char ch=Character.toLowerCase(h5.charAt(j));  
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
		v.setUser_id(i);
		v.setFname(h1);
		v.setMname(h2);
		v.setLname(h3);
		v.setEmailid(h4);
		v.setPassword(Newstr);
		v.setGender(h6);
		v.setLanguage(h7);
		v.setDob(h8);
		v.setPhonenumber(i1);
		v.setAddress_id(i2);
		v.setAddress(h9);
		v.setCity(h10);
		v.setState(h11);
		v.setCountry(h12);
	
		user_update_dao_int user_update= new user_update_dao();
		
		java.util.List<model> ls=user_update.update(v);
		HttpSession session = request.getSession();
		session.setAttribute("List",ls);
}

}
