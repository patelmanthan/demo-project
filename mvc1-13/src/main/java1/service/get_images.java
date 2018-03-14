package service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.get_image_dao;
import Dao.get_image_dao_int;
import Dao.image_dao;
import Dao.image_dao_int;

public class get_images implements get_image_int {
	
	public void imagee(HttpServletRequest request, HttpServletResponse response){
		
		get_image_dao_int get_image=new get_image_dao();
		get_image.imagee(request,response);
	}

}
