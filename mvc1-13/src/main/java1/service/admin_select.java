package service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import model.model;
import Dao.admin_select_dao;
import Dao.admin_select_dao_int;

public class admin_select implements admin_selec_int{
	
	public void admin_selectt(HttpServletRequest request){
		model v=new model();
		admin_select_dao_int admin_select=new admin_select_dao();
		java.util.List<model> ls=admin_select.select(v);
		HttpSession session = request.getSession();
		session.setAttribute("List",ls);		
	}

}
