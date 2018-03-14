package controller;

import org.apache.log4j.Logger;
import org.apache.log4j.LogManager;

import org.apache.log4j.Logger;
import org.apache.log4j.LogManager;

import org.apache.log4j.Logger;
import org.apache.log4j.LogManager;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class logout1
 */
public class logout1 extends HttpServlet {
	/**
	 * Logger for this class
	 */
	private static final Logger logger = LogManager.getLogger(logout1.class.getName());

	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public logout1() {
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
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<script>alert('thanq you!!, Logout successfully!!');document.location='login.jsp';</script>");
		HttpSession session = request.getSession(false);
		session.removeAttribute("userr");
		session.getMaxInactiveInterval();

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
