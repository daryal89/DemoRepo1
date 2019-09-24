package log4japi;

import org.apache.logging.log4j.*;

public class Log4jDemo2 {

	private static Logger log = LogManager.getLogger(Log4jDemo2.class.getName());

	public static void main(String[] args) {
		log.debug("I'm debugging");
		log.info("object is present");
		log.error("object is not present");
		log.fatal("This is fatal");

	}
}