package TestNGReportDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNGReportExample {

	@Test
	public void contactForm() {

		// launch browser
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		// report log karna
		Reporter.log("Chrome browser opened.");

		// maximise the browser
		driver.manage().window().maximize();

		// open url
		driver.get("https://lenseonlinestore.pk/contact-us");
		// report log karna
		Reporter.log("website opened.");

		// fill signup form
		driver.findElement(By.name("first_name")).sendKeys("elon");
		driver.findElement(By.name("last_name")).sendKeys("mask");
		driver.findElement(By.name("email")).sendKeys("elonmask1@gmail.com");
		driver.findElement(By.name("phone")).sendKeys("+923005053534");
		driver.findElement(By.name("message")).sendKeys("Hello how are you");
		driver.findElement(By.xpath("//button[@class='btn btn-success btn-block']")).click();

		// report log karna
		Reporter.log("form fill complete.");

	}

}
