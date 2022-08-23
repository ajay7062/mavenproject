package demo.mavenproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssertionDemo {

	@Test
	public void testMethod() {

		// launch browser
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		// Maximize browser
		driver.manage().window().maximize();

		SoftAssert softVerify = new SoftAssert();

		// open url
		driver.get("https://testautomationpractice.blogspot.com/");

		System.out.println("verifying title.......");

		String expectedTitle = "Automation Testing Practice1";
		String actualTitle = driver.getTitle();

		// Assert.assertEquals(expectedTitle, actualTitle, "Title Verify");

		softVerify.assertEquals(expectedTitle, actualTitle, "Title Verify");

		System.out.println("Verify presence of wikipedia icon");
		WebElement icon = driver.findElement(By.className("wikipedia-icon"));

		// Assert.assertTrue(icon.isDisplayed());

		softVerify.assertTrue(icon.isDisplayed());

		// show search box
		System.out.println("Verify presence of wikipedia icon");
		WebElement searchBtn = driver.findElement(By.className("wikipedia-icon"));

		// Assert.assertTrue(searchBtn.isDisplayed());

		softVerify.assertTrue(searchBtn.isDisplayed());

		driver.close();

		// report all failure message
		softVerify.assertAll();

	}
}
