package GetCookiesDemo;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CookiesExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// launch browser
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		// open url
		driver.get("https://www.amazon.in/");

//		//capture all the cookies
//		Set <Cookie> cookiesList =  driver.manage().getCookies();
//		
//		//print size/number of cookies
//		System.out.println("size:" + cookiesList.size());
//		
//		for(Cookie ck:cookiesList)
//		{
//			System.out.println(ck.getName() + " : " + ck.getValue());
//		}
//		
//		//get specfic cookie according to name
//		System.out.println(driver.manage().getCookieNamed("i18n-prefs"));
//
//		driver.quit();

		// add cookies in browser

		// capture all the cookies
		Set<Cookie> cookiesList = driver.manage().getCookies();

		// print size/number of cookies
		System.out.println(" before adding size:" + cookiesList.size());

		for (Cookie ck : cookiesList) {
			System.out.println(ck.getName() + " : " + ck.getValue());
		}

		// get specfic cookie according to name
		// System.out.println(driver.manage().getCookieNamed("i18n-prefs"));

		// create cookie
		Cookie cookiObjec = new Cookie("TestCookie", "www.amazon.in");

		// add cookie to browser
		driver.manage().addCookie(cookiObjec);

		// capture all the cookies
		cookiesList = driver.manage().getCookies();

		// print size/number of cookies
		System.out.println("after adding size:" + cookiesList.size());

		for (Cookie ck : cookiesList) {
			System.out.println(ck.getName() + " : " + ck.getValue());
		}

		// delete cookie
		// driver.manage().deleteCookie(cookiObjec);

		// delete cookie with name
		driver.manage().deleteCookieNamed("TestCookie");
		
		//delete all cookies 
		driver.manage().deleteAllCookies();

		// capture all the cookies
		cookiesList = driver.manage().getCookies();

		// print size/number of cookies
		System.out.println(" \n\n after deleting size:" + cookiesList.size());

		for (Cookie ck : cookiesList) {
			System.out.println(ck.getName() + " : " + ck.getValue());
		}

		driver.quit();

	}

}
