package controller;

import model.model;

import org.apache.log4j.Logger;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.LogManager;


import org.apache.log4j.PropertyConfigurator;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.datainsert;
import service.datainsertint;
import service.service;
import service.serviceint;

/**
 * Servlet implementation class controller1
 */
public class controller1 extends HttpServlet {
	/**
	 * Logger for this class
	 */
	private static final Logger logger = LogManager.getLogger(controller1.class.getName());

	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public controller1() {
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
		datainsertint datainsert=new datainsert();
		try {
			datainsert.insert(request,response);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		response.setContentType("text/html");  
        PrintWriter out = response.getWriter();    
        out.println("<script>alert('Registration successfully!!');document.location='login.jsp';</script>");

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
