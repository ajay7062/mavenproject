package demo.mavenproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProviderDemo {

//	// data provider function
//
//	// India Qutub minar
//	// Agra Taj Mahal
//	// Hyderabad chaminar
//
//	@DataProvider(name = "searchDataSet")
//	public Object[][] searchData() {
//		Object[][] searchKeyWord = new Object[3][2];
//
//		searchKeyWord[0][0] = "India";
//		searchKeyWord[0][1] = "Qutub Minar";
//
//		searchKeyWord[1][0] = "Agra";
//		searchKeyWord[1][1] = "Taj Mahal";
//
//		searchKeyWord[2][0] = "Hyderabad";
//		searchKeyWord[2][1] = "chaminar";
//
//		return searchKeyWord;
//	}
                                             //data provider call diffrent class
	@Test(dataProvider = "searchDataSet", dataProviderClass = DataProviderMethod.class)
	public void TestCaseSesrch(String country, String monument)

	{
		// launch browser
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		

		// Maximize browser
		driver.manage().window().maximize();


		// open url
		driver.get("https://www.google.co.in/");
		
		WebElement searchbox = driver.findElement(By.name("q"));

		// enter value in search box
		searchbox.sendKeys(country + " " + monument);

		driver.findElement(By.name("btnk")).submit();
	}
}
