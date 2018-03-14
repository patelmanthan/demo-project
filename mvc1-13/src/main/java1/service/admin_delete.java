package service;

import javax.servlet.http.HttpServletRequest;

import model.model;
import Dao.admin_delete_dao;
import Dao.admin_delete_dao_int;

public class admin_delete implements admin_delete_int{
	
	public void admin_deletee(HttpServletRequest request){
		
		String h = request.getParameter("user_id");
		int i=Integer.parseInt(h);
		System.out.println("id is"+i);
		model v=new model();
		v.setUser_id(i);
		admin_delete_dao_int delete= new admin_delete_dao();
		try {
			delete.delete(v);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		
		
	

}
