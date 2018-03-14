package service;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.image_dao;
import Dao.image_dao_int;

public class image implements img_int{
	
	public void imagee(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
		image_dao_int upload_image=new image_dao();
		upload_image.imagee(request,response);
	}
	
	public void get_imagee(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
		image_dao_int upload_image1=new image_dao();
		upload_image1.get_imagee(request,response);
	}

}
