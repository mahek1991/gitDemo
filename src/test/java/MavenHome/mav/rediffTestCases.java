package MavenHome.mav;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pageObject.rediffLogin;

public class rediffTestCases {

	@Test
	void Login()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Jars\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		rediffLogin rl=new rediffLogin(driver);
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		rl.Username().sendKeys("hello");
		rl.Password().sendKeys("hello");
		rl.SignIn().click();
		
	}
}
