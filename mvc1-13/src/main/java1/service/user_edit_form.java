package service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import model.model;
import Dao.admin_edit_dao;
import Dao.admin_edit_dao_int;
import Dao.user_edit_dao;
import Dao.user_edit_dao_int;

public class user_edit_form implements user_edit_int{
	
public void user_editt(HttpServletRequest request){
		
		String h = request.getParameter("user_id");
		System.out.println("user id is"+h);
		String h1 = request.getParameter("address_id");
		System.out.println("user id is"+h1);
		
		int i=Integer.parseInt(h);
		int i1=Integer.parseInt(h1);
		
		model v=new model();
		v.setUser_id(i);
		v.setAddress_id(i1);
		user_edit_dao_int user_edit= new user_edit_dao();
		java.util.List<model> ls=user_edit.editt(v);
		HttpSession session = request.getSession();
		session.setAttribute("List",ls);
		
		
	}

}
