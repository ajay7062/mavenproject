package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNGExcelDemo {

	
	WebDriver driver;
	
	@BeforeMethod
	public void setup()
	{

		// launch chrome browser
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		// open url
		driver.get("https://www.google.com/");
		
		//maximise browser
		driver.manage().window().maximize();
	}
	
	@Test(dataProvider = "searchDataProvider")
	public void login(String keyword)
	{
		WebElement searchbox = driver.findElement(By.name("q"));
		searchbox.sendKeys(keyword);
		searchbox.sendKeys(Keys.ENTER);
	}
	
	
	@DataProvider(name= "searchDataProvider")
	public Object[][] searchDataProviderMethod()
	
	{
		Object[][] searchData = new Object[2][1]; //2 rowa & 1 colum
		searchData[0][0] = "Taj Mahal"; //row=1 col=1
		searchData[0][0] = "Taj Mahal"; //row=2 col=1
		return searchData;
	}
	
//	public String[][] getExcelData(String fileName, String sheetName)
//	{
//		String[][] data = null;
//		
//		//open file in read open
//		try {
//			FileInputStream inputStream = new FileInputStream(fileName);
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();

	
	
	@AfterMethod
	public void QuitBrowser() 
	{
		driver.quit();
	}
}
