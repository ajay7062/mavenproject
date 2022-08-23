package demo.mavenproject;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginForm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// launch chrome browser
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
//
//				// open url
		driver.get("https://www.saucedemo.com/");
//				
//				//enter user name
//				driver.findElement(By.id("user-name")).sendKeys("standard_user");
//				
//				//enter password
//				driver.findElement(By.id("password")).sendKeys("secret_sauce");
//				
//				//click on submit 
//				driver.findElement(By.id("login-button")).click();
//				
//				driver.quit();

		Actions actions = new Actions(driver);
		org.openqa.selenium.interactions.Action seriesOfActions = actions
				.moveToElement(driver.findElement(By.id("user-name"))).click().sendKeys("standard_user", Keys.TAB)
				.sendKeys("secret_sauce", Keys.ENTER).build();
		seriesOfActions.perform();

	}

}
