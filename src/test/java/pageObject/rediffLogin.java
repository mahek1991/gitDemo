package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class rediffLogin {

	WebDriver driver;

	public rediffLogin(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@id='login1']")
	WebElement username;

	@FindBy(xpath = "//input[@id='password']")
	WebElement password;

	@FindBy(css = ".signinbtn")
	WebElement signInButton;

	public WebElement Username() {
		return username;
	}

	public WebElement Password() {
		return password;
	}

	public WebElement SignIn() {
		return signInButton;
	}

}
