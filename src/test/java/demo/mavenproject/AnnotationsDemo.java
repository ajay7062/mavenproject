package demo.mavenproject;

import org.testng.annotations.*;

public class AnnotationsDemo {

	// before suite execute first of all test cases
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Before Suite...");
	}

	// after suite execute last of all test cases
	@AfterSuite
	public void afterSuite() {
		System.out.println("After Suite...");
	}

	// before test execute first of all test cases
	@BeforeTest
	public void beforeTest() {
		System.out.println("Before test...");
	}

	// after test execute last of all test cases
	@AfterTest
	public void afterTest() {
		System.out.println("After test...");
	}

	// BeforeClass execute before test cases
	@BeforeClass
	public void beforeClass() {
		System.out.println("before Class...");
	}

	// AfterClass execute after test cases
	@AfterClass
	public void AfterClass() {
		System.out.println("After Class...");
	}

	// BeforeMethod execute before all method
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Before Method...");
	}

	// mark the test case
	@Test
	public void test1() {
		System.out.println("This is test1...");
	}

	@Test
	public void test2() {
		System.out.println("This is test2...");
	}

	// AfterMethod execute after all method
	@AfterMethod
	public void afterMethod() {
		System.out.println("After Method...");
	}

}
