package service;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface img_int {
	
	void imagee(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException;
	
	void get_imagee(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException;

}
