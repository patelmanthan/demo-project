package service;

import org.apache.log4j.Logger;
import org.apache.log4j.LogManager;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.forgot_pass_dao;
import Dao.forgot_pass_dao_int;

public class forgot_pass implements forgot_pass_int {
	/**
	 * Logger for this class
	 */
	private static final Logger logger = LogManager.getLogger(forgot_pass.class.getName());
	
	public void forgotpass(HttpServletRequest request,HttpServletResponse response) {

		forgot_pass_dao_int forgot_pass=new forgot_pass_dao();
		forgot_pass.forgotpass(request,response);

	
	}

}
