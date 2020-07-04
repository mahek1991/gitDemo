package MavenHome.mav;


import org.apache.logging.log4j.*;;

public class log4j {

	private static Logger log=org.apache.logging.log4j.LogManager.getLogger(log4j.class.getName());
	public static void main(String[] args) {
		
		log.info("This is info Log"); //It is used when something successfully happens or operated
		log.debug("This is a debugger"); //When each Selenium action is performed like click, SendKeys, getText()
		
		log.error("This is error"); //to log when elements are not displayed in the page or if any validations fail

		log.fatal("This is fatal"); //to log when some fatal error occur 
	}
}
