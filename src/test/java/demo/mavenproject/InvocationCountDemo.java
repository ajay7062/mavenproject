package demo.mavenproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.AssertJUnit;
import org.testng.ITestContext;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class InvocationCountDemo {

	@Test(invocationCount = 5)
	public void test1(ITestContext context) {

		int currentInvocation = context.getAllTestMethods()[0].getCurrentInvocationCount();
		System.out.println("Executing: " + currentInvocation);
		System.out.println("test methos 1.....");

	}

	@Test(invocationCount = 3)
	public void test2(ITestContext context) {
		
		int currentInvocation = context.getAllTestMethods()[1].getCurrentInvocationCount();
		System.out.println("Executing: " + currentInvocation);
		System.out.println("test methos 2.....");

	}

}
