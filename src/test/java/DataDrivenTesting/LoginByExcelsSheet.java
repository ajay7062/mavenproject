package DataDrivenTesting;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginByExcelsSheet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		XSSFWorkbook ExcelWBook = null;
		XSSFSheet ExcelWSheet;
		// XSSFRow Row ;
		// XSSFCell Cell ;

		// create an object of file class to open file
		File excelFile = new File("C:\\Users\\CW\\Desktop\\mavenProject\\Datadriventesting.xlsx");

		FileInputStream inputStream = null;
		// create an object of fileinputstread to read data from file
		try {
			inputStream = new FileInputStream(excelFile);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// Excel->workbook->Sheet->row->cell
		try {
			ExcelWBook = new XSSFWorkbook(inputStream);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		// to access workbook sheet
		ExcelWSheet = ExcelWBook.getSheetAt(0);

		// get total row count
		int totalrows = ExcelWSheet.getLastRowNum() + 1;

		int totalCells = ExcelWSheet.getRow(0).getLastCellNum();

		for (int currentRow = 1; currentRow < totalrows; currentRow++)

		{

			// launch chrome browser
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();

			// open url
			driver.get("https://www.saucedemo.com/");

			// enter user name
			driver.findElement(By.id("user-name")).sendKeys(ExcelWSheet.getRow(currentRow).getCell(0).toString());

			// enter password
			driver.findElement(By.id("password")).sendKeys(ExcelWSheet.getRow(currentRow).getCell(1).toString());

			// click on submit
			driver.findElement(By.id("login-button")).click();
		
			//sleep the element
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

//				for(int currentCell = 0; currentCell<totalCells; currentCell++)
//				{
//					System.out.print(ExcelWSheet.getRow(currentRow).getCell(currentCell).toString());
//					System.out.print("\t");
//					
//				}
//				System.out.print("\n");
		}

		try {
			ExcelWBook.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
