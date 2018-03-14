package Dao;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.AddressModel;
import model.model;

public interface data_insert_dao_int {
	
	 void insert(model bean,AddressModel[] am,HttpServletResponse response) throws Exception;
	 
	 //public void image(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException;

}
