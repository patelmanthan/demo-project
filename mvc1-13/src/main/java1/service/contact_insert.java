package service;

import javax.servlet.http.HttpServletRequest;

import model.model;
import Dao.contact_insert_dao;
import Dao.contact_insert_dao_int;


public class contact_insert implements contact_insert_int{
	
	public void contactinsert(HttpServletRequest request){
		
			model bean=new model();
			String name=request.getParameter("name");
			String emailid=request.getParameter("emailid");
			String message=request.getParameter("message");
			System.out.println(name);
			
			bean.setName(name);
			bean.setEmailid(emailid);
			bean.setMessage(message);
			// TODO Auto-generated method stub
			
			contact_insert_dao_int contact_insert = new contact_insert_dao();
			try {
				contact_insert.contactinsert(bean);
			} catch (Exception e) {
			

				// TODO Auto-generated catch block
				e.printStackTrace();
			}	

	}
	
	

}
