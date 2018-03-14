package controller;

import org.apache.log4j.Logger;
import org.apache.log4j.LogManager;

import org.apache.log4j.Logger;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.LogManager;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.model;
import Dao.contact_show_dao;
import Dao.contact_show_dao_int;

/**
 * Servlet implementation class contactshow
 */
public class contactshow extends HttpServlet {
	/**
	 * Logger for this class
	 */
	private static final Logger logger = LogManager.getLogger(contactshow.class.getName());

	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public contactshow() {
        super();
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
		contact_show_dao_int contact_show=new contact_show_dao();
		java.util.List<model> ls=contact_show.contactshow(v);
		HttpSession session = request.getSession();
		session.setAttribute("List",ls);
		response.sendRedirect("contactshow.jsp");

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
