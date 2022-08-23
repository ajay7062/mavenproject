package PageObjectModelDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// launch browser
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		// Maximize browser
		driver.manage().window().maximize();

		// create object of login page
		LoginPage2 Loginpg = new LoginPage2(driver);

		// open url
		driver.get("https://www.saucedemo.com/");
		Loginpg.enterUsername("standard_user");
		Loginpg.enterPassword("secret_sauce");
		Loginpg.loginBtn();
	}

}
