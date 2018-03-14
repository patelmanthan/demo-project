package service;

import org.apache.log4j.Logger;
import org.apache.log4j.LogManager;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import Dao.reset_pass_dao;
import Dao.reset_pass_dao_int;

public class reset_pass implements reset_pass_int {
	/**
	 * Logger for this class
	 */
	private static final Logger logger = LogManager.getLogger(reset_pass.class.getName());
	
	public void resetpassword(HttpServletRequest request,HttpServletResponse response) {
		
		reset_pass_dao_int reset_pass=new reset_pass_dao();
		reset_pass.resetpass(request,response);	
	}

}
