package lenseonlinestore;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlphonicEnquiryForm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// launch browser
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		// maximise the window
		driver.manage().window().maximize();

		// open url
		driver.get("https://www.alphonic.in/");

		// click the enquiry form
		WebElement username = driver.findElement(By.linkText("ENQUIRY"));
		username.click();

		// fill the name
		WebElement name = driver.findElement(By.id("name"));
		name.sendKeys("ram");

		// fill the email
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("ram@gmail.com");
		/*
		 * // fill the phone WebElement phone =
		 * driver.findElement(By.name("phonenumber")); phone.sendKeys("7062157865");
		 * 
		 * // fill the skypeid WebElement skypeid =
		 * driver.findElement(By.name("skype_im")); skypeid.sendKeys("7062157865");
		 */

		// fill message
		WebElement message = driver.findElement(By.name("message"));
		message.sendKeys("helle test");

	}

}
