package controller;

import org.apache.log4j.Logger;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.LogManager;

import service.admin_selec_int;
import service.admin_select;
import service.admin_update;
import service.admin_update_int;

import java.awt.List;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.model;
import Dao.admin_update_dao;
import Dao.admin_update_dao_int;


/**
 * Servlet implementation class update
 */
public class update extends HttpServlet {
	/**
	 * Logger for this class
	 */
	private static final Logger logger = LogManager.getLogger(update.class.getName());

	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public update() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if (logger.isDebugEnabled()) {
			logger.debug("doGet(HttpServletRequest, HttpServletResponse) - start"); //$NON-NLS-1$
		}

	// TODO Auto-generated method stub
		admin_update_int admin_update=new admin_update();
		admin_update.admin_updatee(request);
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<script>alert('thanq you!!, update successfully!!');document.location='select';</script>");
		
		if (logger.isDebugEnabled()) {
			logger.debug("doGet(HttpServletRequest, HttpServletResponse) - end"); //$NON-NLS-1$
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
