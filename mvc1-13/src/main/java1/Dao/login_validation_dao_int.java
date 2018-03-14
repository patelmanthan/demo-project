package Dao;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.model;

public interface login_validation_dao_int {
	
	//public void login_validation(HttpServletRequest request,HttpServletResponse response);
	
	//public void user_update(HttpServletRequest request,HttpServletResponse response);
	
	 public List<model> login_validation(model v,HttpServletRequest request, HttpServletResponse response);

}
