package mvc1;

import java.util.logging.Logger;

import org.apache.log4j.PropertyConfigurator;

public class database {
	static Logger log = Logger.getLogger(database.class.getName());
	 public static void main(String[] args){
		
		 PropertyConfigurator.configure("log4j.properties");
		  //log.trace("Trace Message!");
	     // log.debug("Debug Message!");
	      log.info("Info Message!");
	     // log.warn("Warn Message!");
	     // log.error("Error Message!");
	      //log.fatal("Fatal Message!");
	   }
}
