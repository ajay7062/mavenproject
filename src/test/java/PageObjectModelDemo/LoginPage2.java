package PageObjectModelDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage2 {

	// using with page factory method

	WebDriver driver;

	// constructor
	LoginPage2(WebDriver d) {
		driver = d;
		
		//this method will create web elements
		PageFactory.initElements(driver, this);
	}

	// identify web element
	// identify user name
	@FindBy(id = "user-name")
	WebElement username;

	// identify password
	@FindBy(id = "password")
	WebElement password;

	// identify login button
	@FindBy(id = "login-button")
	WebElement loginBtn;

	
	public void enterUsername(String uname)

	{
		username.sendKeys(uname);
	}

	public void enterPassword(String pwd)

	{
		password.sendKeys(pwd);
	}

	public void loginBtn()

	{
		loginBtn.click();
	}
}
