package Dao;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface image_dao_int {
	public void imagee(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException;
	
	public void get_imagee(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException;
}
