package service;

import org.apache.log4j.Logger;
import org.apache.log4j.LogManager;

import org.apache.log4j.Logger;
import org.apache.log4j.LogManager;

import org.apache.log4j.Logger;
import org.apache.log4j.LogManager;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.AddressModel;
import model.model;


public class service implements serviceint {
	/**
	 * Logger for this class
	 */
	private static final Logger logger = LogManager.getLogger(service.class.getName());

	/*public void insert(HttpServletRequest request) {
		model bean=new model();
		String fname=request.getParameter("fname");
		String mname=request.getParameter("mname");
		String lname=request.getParameter("lname");
		String emailid=request.getParameter("emailid");
		String password=request.getParameter("password");
		String gender=request.getParameter("gender");
		String language=request.getParameter("language");
		String dob=request.getParameter("dob");
		int phonenumber=Integer.parseInt(request.getParameter("phonenumber"));
		String[] address=request.getParameterValues("address");
		String[] city=request.getParameterValues("city");
		String[] state=request.getParameterValues("state");
		String[] country=request.getParameterValues("country");
		
		int no = city.length-1;
		
		//System.out.println(address[1]+no);
		
		bean.setFname(fname);
		bean.setMname(mname);
		bean.setLname(lname);
		bean.setEmailid(emailid);
		bean.setPassword(password);
		bean.setGender(gender);
		bean.setLanguage(language);
		bean.setDob(dob);
		bean.setPhonenumber(phonenumber);
//		bean.setAddress(address);
//		bean.setCity(city);
//		bean.setState(state);
//		bean.setCountry(country);
		// TODO Auto-generated method stub
		AddressModel am[] = new AddressModel[no];
		for(int i=0;i<no;i++){
			am[i] = new AddressModel();
			am[i].setAddress(address[i]);
			am[i].setCity(city[i]);
			am[i].setState(state[i]);
			am[i].setCountry(country[i]);
		}
		dao dao1 = new dao();

		try {
			dao1.insert(bean,am);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}*/
	
	/*public void contactinsert(HttpServletRequest request){
		if (logger.isDebugEnabled()) {
			logger.debug("contactinsert(HttpServletRequest) - start"); //$NON-NLS-1$
		}
		
			model bean=new model();
			String name=request.getParameter("name");
			String emailid=request.getParameter("emailid");
			String message=request.getParameter("message");
			System.out.println(name);
			
			bean.setName(name);
			bean.setEmailid(emailid);
			bean.setMessage(message);
			// TODO Auto-generated method stub
			
			dao dao1 = new dao();
			try {
				dao1.contactinsert(bean);
			} catch (Exception e) {
			logger.error("contactinsert(HttpServletRequest)", e); //$NON-NLS-1$

				// TODO Auto-generated catch block
				e.printStackTrace();
			}	

		if (logger.isDebugEnabled()) {
			logger.debug("contactinsert(HttpServletRequest) - end"); //$NON-NLS-1$
		}
	}*/
	
	/*public void fetch(HttpServletRequest request,HttpServletResponse response) {
		if (logger.isDebugEnabled()) {
			logger.debug("fetch(HttpServletRequest, HttpServletResponse) - start"); //$NON-NLS-1$
		}

		dao d1=new dao();
		d1.fetch(request,response);
		//d1.admin(request, response);

		if (logger.isDebugEnabled()) {
			logger.debug("fetch(HttpServletRequest, HttpServletResponse) - end"); //$NON-NLS-1$
		}
	}*/
	
	/*public void resetpass(HttpServletRequest request,HttpServletResponse response) {
		if (logger.isDebugEnabled()) {
			logger.debug("resetpass(HttpServletRequest, HttpServletResponse) - start"); //$NON-NLS-1$
		}

		dao d1=new dao();
		d1.resetpass(request,response);
		
		if (logger.isDebugEnabled()) {
			logger.debug("resetpass(HttpServletRequest, HttpServletResponse) - end"); //$NON-NLS-1$
		}
	}*/
	
	/*public void forgotpass(HttpServletRequest request,HttpServletResponse response) {
		if (logger.isDebugEnabled()) {
			logger.debug("forgotpass(HttpServletRequest, HttpServletResponse) - start"); //$NON-NLS-1$
		}

		dao d1=new dao();
		d1.forgotpass(request,response);

		if (logger.isDebugEnabled()) {
			logger.debug("forgotpass(HttpServletRequest, HttpServletResponse) - end"); //$NON-NLS-1$
		}
	}*/
	
	/*public void userupdate(HttpServletRequest request,HttpServletResponse response) {
		if (logger.isDebugEnabled()) {
			logger.debug("userupdate(HttpServletRequest, HttpServletResponse) - start"); //$NON-NLS-1$
		}

		dao d1=new dao();
		d1.userupdate(request,response);
		
		if (logger.isDebugEnabled()) {
			logger.debug("userupdate(HttpServletRequest, HttpServletResponse) - end"); //$NON-NLS-1$
		}
	}
	
	public void userupdate1(HttpServletRequest request,HttpServletResponse response) {
		if (logger.isDebugEnabled()) {
			logger.debug("userupdate1(HttpServletRequest, HttpServletResponse) - start"); //$NON-NLS-1$
		}

		dao d1=new dao();
		d1.userupdate1(request,response);
		
		if (logger.isDebugEnabled()) {
			logger.debug("userupdate1(HttpServletRequest, HttpServletResponse) - end"); //$NON-NLS-1$
		}
	}*/
	
/*	public void update(HttpServletRequest request){
		model m=new model();
		String emailid=request.getParameter("emailid");
		String password=request.getParameter("password");
		System.out.println("emailid is"+emailid);
		m.setEmailid(emailid);
		m.setPassword(password);
		dao d=new dao();
		 List ls=d.update(m);
		HttpSession session = request.getSession();
		
		dao d1=new dao();
		d1.update(request);
		

	}*/
}
