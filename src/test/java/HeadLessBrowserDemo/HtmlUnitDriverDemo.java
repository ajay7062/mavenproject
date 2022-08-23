package HeadLessBrowserDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class HtmlUnitDriverDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// launch HtmlUnitDriver Browser
		HtmlUnitDriver driver = new HtmlUnitDriver();

		// maximise the browser
		driver.manage().window().maximize();

		// open url
		driver.get("https://lenseonlinestore.pk/contact-us");

		// print title
		System.out.println("Before search " + driver.getTitle());

		// fill signup form
		driver.findElement(By.name("first_name")).sendKeys("elon");
		driver.findElement(By.name("last_name")).sendKeys("mask");
		driver.findElement(By.name("email")).sendKeys("elonmask1@gmail.com");
		driver.findElement(By.name("phone")).sendKeys("+923005053534");
		driver.findElement(By.name("message")).sendKeys("Hello how are you");
		driver.findElement(By.xpath("//button[@class='btn btn-success btn-block']")).click();

		System.out.println("After search " + driver.getTitle());

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		driver.quit();

	}

}
