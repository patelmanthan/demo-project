package controller;

import org.apache.log4j.Logger;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.LogManager;

import service.admin_delete;
import service.admin_delete_int;
import service.admin_selec_int;
import service.admin_select;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.model;
import Dao.admin_delete_dao;
import Dao.admin_delete_dao_int;


/**
 * Servlet implementation class delete
 */
public class delete extends HttpServlet {
	/**
	 * Logger for this class
	 */
	private static final Logger logger = LogManager.getLogger(delete.class.getName());

	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public delete() {
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
			//response.getWriter().append("Served at: ").append(request.getContextPath());
			admin_delete_int delete=new admin_delete();
			delete.admin_deletee(request);
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			out.println("<script>alert('thanq you!!, delete successfully!!');document.location='select';</script>");
			
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
