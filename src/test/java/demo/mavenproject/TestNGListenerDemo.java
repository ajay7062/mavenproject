package demo.mavenproject;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.SkipException;
import org.testng.annotations.*;
import org.testng.annotations.Listeners;	

import io.github.bonigarcia.wdm.WebDriverManager;



//@Listeners(demo.mavenproject.ListernerClass.class)
public class TestNGListenerDemo {

	@Test
	public void login()

	{
		// launch browser
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		// Maximize browser
		driver.manage().window().maximize();

		// open url
		driver.get("https://opensource-demo.orangehrmlive.com/");

		// find user name
		driver.findElement(By.id("txtUsername")).sendKeys("admin");

		// find password
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");

		// find login button
		driver.findElement(By.id("btnLogin")).submit();

		//varify title
		AssertJUnit.assertEquals(driver.getTitle(), "OrangeHRM");

	}

	//fail test case
	@Test
	public void testfail() {
		System.out.println("failed test case");
		AssertJUnit.assertTrue(false);
	}

	//skip test case
	@Test
	public void testskipped() {
		System.out.println("skipped test case");
		
		throw new SkipException("skip exception thrown...");
	}
}
