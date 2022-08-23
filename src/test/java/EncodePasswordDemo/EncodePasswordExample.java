package EncodePasswordDemo;

import org.apache.commons.codec.binary.Base64;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.AssertJUnit;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EncodePasswordExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		// encode password
//		String password = "admin123";
//
//		byte[] encodeedPassword = Base64.encodeBase64(password.getBytes());
//
//		System.out.println(new String(encodeedPassword));

		// launch chrome browser
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		// open url
		driver.get("https://opensource-demo.orangehrmlive.com/");

		// find user name
		driver.findElement(By.id("txtUsername")).sendKeys("admin");

		// decode password
		byte[] decodedPassword = Base64.decodeBase64("YWRtaW4xMjM=");
		driver.findElement(By.id("txtPassword")).sendKeys(new String(decodedPassword));

		// find login button
		driver.findElement(By.id("btnLogin")).submit();

		// varify title
		//Assert.assertEquals(driver.getTitle(), "OrangeHRM");

		driver.quit();
	}

}
