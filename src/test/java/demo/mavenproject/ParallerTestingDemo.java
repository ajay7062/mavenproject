package demo.mavenproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class ParallerTestingDemo {

	WebDriver driver;

	@Test
	public void veryfyTitle()

	{
		// launch browser
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		// Maximize browser
		driver.manage().window().maximize();

		// open url
		driver.get("https://www.saucedemo.com/");

		Assert.assertEquals(driver.getTitle(), "Swag Labs");
		

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

		driver.quit();
		

	}

	@Test
	public void veryfyLogo()

	{
		// launch browser
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		// Maximize browser
		driver.manage().window().maximize();

		// open url
		driver.get("https://www.saucedemo.com/");

		WebElement logo = driver.findElement(By.xpath("//div[@class='login_logo']"));
		
		Assert.assertTrue(logo.isDisplayed());
		
		System.out.println(logo);
		

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	
		
		driver.quit();

	}

}
