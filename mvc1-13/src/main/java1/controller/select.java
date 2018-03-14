package controller;

import org.apache.log4j.Logger;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.LogManager;

import service.admin_selec_int;
import service.admin_select;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.model;
import Dao.admin_select_dao;
import Dao.admin_select_dao_int;


/**
 * Servlet implementation class select
 */
public class select extends HttpServlet {
	/**
	 * Logger for this class
	 */
	private static final Logger logger = LogManager.getLogger(select.class.getName());

	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public select() {
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
		model v=new model();
		admin_selec_int admin_select=new admin_select();
		admin_select.admin_selectt(request);
		RequestDispatcher rd=request.getRequestDispatcher("table.jsp");  
	    rd.include(request, response); 
	    
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
