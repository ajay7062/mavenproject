package Log4jDemo;

import org.apache.logging.log4j.*;

public class Log4j2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//code link - https://github.com/prachicodestudio/SeleniumWithJavaLog4j2
		
		Logger log = LogManager.getLogger("LoggerDemo");
		System.out.println("this is logger demo.");
		
		log.info("for info only");
		log.fatal("fatal msg");

		log.debug("for debug");
		log.error("error message");
		log.warn("warning message");
		
		
	}

}
