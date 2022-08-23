package lenseonlinestore;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class SignUpForm {

	@Test
	public void contactUs()

	{
		// launch browser
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		// maximise the browser
		driver.manage().window().maximize();

		// open url
		driver.get("https://lenseonlinestore.pk/contact-us");

		/*
		 * // fill signup form
		 * driver.findElement(By.name("first_name")).sendKeys("elon");
		 * driver.findElement(By.name("last_name")).sendKeys("mask");
		 * driver.findElement(By.name("email")).sendKeys("elonmask1@gmail.com");
		 * driver.findElement(By.name("phone")).sendKeys("+923005053534");
		 * driver.findElement(By.name("message")).sendKeys("Hello how are you");
		 * driver.findElement(By.xpath("//button[@class='btn btn-success btn-block']")).
		 * click();
		 */
		for (int i = 0; i < 10; i++) {

			// open url
			// driver.get("https://lenseonlinestore.pk/contact-us");

			// fill signup form
			driver.findElement(By.id("first_name")).sendKeys("elon");
			driver.findElement(By.name("last_name")).sendKeys("mask");
			driver.findElement(By.name("email")).sendKeys("elonmask1@gmail.com");
			driver.findElement(By.name("phone")).sendKeys("+923005053534");
			driver.findElement(By.name("message")).sendKeys("Hello how are you");
			driver.findElement(By.xpath("//button[@class='btn btn-success btn-block']")).click();

		}

	}

}
