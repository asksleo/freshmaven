package workingonexcel;

import java.lang.System.Logger;

import org.apache.log4j.BasicConfigurator;
import org.testng.annotations.Test;

public class Log4j1 {

	
	static final Logger logger1=Logger.getLogger(Log4j1.class);

	public static void main(String[] args) {
	BasicConfigurator.configure();
	logger1.debug("Example for debug msg");
	logger1.info("Example for info msg");
	logger1.warn("Example for warn msg");
	logger1.error("Example for error msg");
	logger1.fatal("Example for fatal msg");
	}

	}