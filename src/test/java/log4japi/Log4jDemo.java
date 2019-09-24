package log4japi;

import org.apache.logging.log4j.*;

public class Log4jDemo {

	private static Logger log = LogManager.getLogger(Log4jDemo.class.getName());

	public static void main(String[] args) {
		log.debug("I've clicked on button");
		log.info("Button is displayed");
		log.error("Button is not displayed");
		log.fatal("Button is missing");

	}
}