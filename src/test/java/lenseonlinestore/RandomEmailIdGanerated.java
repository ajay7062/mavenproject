package lenseonlinestore;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.UUID;

public class RandomEmailIdGanerated {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// launch browser
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		// maximise the window
		driver.manage().window().maximize();

		// Open website
		driver.get("http://testsite.usetrace.com");

		// Generate a random email
		final String randomEmail = randomEmail();

		for (int i = 0; i < 10; i++) {
			// Open website
			driver.get("http://testsite.usetrace.com");

			// Find the link to registration form
			WebElement link = driver.findElement(By.cssSelector("[data-name='Register']"));

			// Click the link
			link.click();

			// for (int i = 0; i < 10; i++) {

			// Find the email form field
			WebElement email = driver.findElement(By.id("register-email"));

			// Type the random email to the form
			email.sendKeys(randomEmail);

			// Find the username form field
			WebElement username = driver.findElement(By.name("username"));

			// Type a password to the form. This needs not be unique.
			username.sendKeys("John123");

			/*
			 * try { Thread.sleep(5000); } catch (InterruptedException e) { // TODO
			 * Auto-generated catch block e.printStackTrace(); }
			 */

			// Submit the sign up form
			username.submit();

			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			// logout the user
			WebElement logut = driver.findElement(By.xpath("/html/body/article[4]/header/a"));
			logut.click();

		}
		// Check the sign up succeeded by checking that the randomized
		// email appears in the website's header bar.

		/*
		 * (new WebDriverWait(driver, 10)).until(new ExpectedCondition<Boolean>() {
		 * public Boolean apply(WebDriver d) { WebElement header =
		 * d.findElement(By.id("header-login")); return
		 * header.getText().contains(randomEmail); }
		 * 
		 * 
		 * });
		 * 
		 * System.out.println(randomEmail);
		 */

		// Close the browser
		// driver.quit();
	}

	private static String randomEmail() {
		return "johan-" + UUID.randomUUID().toString() + "@example.com";

	}

}
