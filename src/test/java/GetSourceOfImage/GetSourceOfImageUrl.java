package GetSourceOfImage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetSourceOfImageUrl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// launch browser
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		// maximise the window
		driver.manage().window().maximize();

		// open url
		driver.get("https://www.facebook.com/");

		// find out the fb logo
		WebElement imglogo = driver.findElement(By.xpath("//img[@class='fb_logo _8ilh img']"));

		// capture "src"attribute value of image Logo
		System.out.println("scr attribute value: " + imglogo.getAttribute("src"));

		driver.quit();

	}

}
