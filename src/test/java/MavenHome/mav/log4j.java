package MavenHome.mav;


import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.*;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class log4j {

	private static Logger log=org.apache.logging.log4j.LogManager.getLogger(log4j.class.getName());
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Jars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		log.debug("Google website is hitting");
		driver.get("http://www.google.com");
		log.info("Successfully opened google.com"); 
		
		try {
		driver.findElement(By.xpath("//a[text()='Gmail1']")).click();
		
		log.info("Successfully clicked gmail"); 
		}
		catch(NoSuchElementException e){
			log.error("Gmail did not click");
		}
		
		
		
	}
}
