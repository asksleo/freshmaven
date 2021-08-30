package log4j;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;  

public class Log4j12 {

	static final Logger logger1= Logger.getLogger(Log4j12.class);
	
	public static void main(String[] args) {
		DOMConfigurator.configure("src\\test\\java\\log4j\\log4j.xml");  
		logger1.debug("Example for debug msg ");
		logger1.info("Example for info msg ");
		logger1.warn("Example for warn msg");
		logger1.error("Example for error msg");
		logger1.fatal("Example for fatal msg");
		}
	}
