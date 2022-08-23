package PageObjectModelDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.AssertJUnit;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginWithoutPOM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		// launch browser
				WebDriverManager.chromedriver().setup();
				WebDriver driver = new ChromeDriver();

				// Maximize browser
				driver.manage().window().maximize();

				// open url
				driver.get("https://www.saucedemo.com/");
				
				// find & enter user name
				driver.findElement(By.id("user-name")).sendKeys("standard_user");

				// find & enter password
				driver.findElement(By.id("password")).sendKeys("secret_sauce");

				// find login button
				driver.findElement(By.id("login-button")).submit();

				//varify title
				//AssertJUnit.assertEquals(driver.getTitle(), "OrangeHRM");
		
	}

}
