package demo.mavenproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class TestNGDemo {

	// @Test(enabled=false)
	@Test
	public void varifyPageTitle() {
		// launch chrome browser
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		// open url
		driver.get("http://www.google.com");
		String expectedTitle = "Google";
		String actualTitle = driver.getTitle();

		Assert.assertEquals(actualTitle, expectedTitle);

	}

	// @Test(enabled=true)
	@Test
	public void test1() {
		System.out.println("test case1");

	}

	@Test
	public void test2() {
		System.out.println("test case1");
	}

}
