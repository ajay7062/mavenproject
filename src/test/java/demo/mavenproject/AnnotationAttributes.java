package demo.mavenproject;

import org.testng.annotations.*;
import org.testng.annotations.BeforeSuite;

import junit.framework.Assert;

public class AnnotationAttributes {

	
	
	//extention name - 
	
	
	// @Test(description = "this is testcase1.")

	@Test(priority = 3)
	public void testCase1() {
		System.out.println("Mobile login TestCases...");
	}

	@Test
	public void testCase4() {
		System.out.println("both login TestCases...");
		Assert.assertTrue(false);
	}

	// write the description for test cases
	// @Test(description = "this is testcase2.")

	// manage timing
	// @Test(timeOut = 200)

	// Sequence wise run test cases
	// @Test(priority=1)

	// disable the test cases
	// @Test(enabled=false)

	// add depedancy in test cases
	// @Test(dependsOnMethods = {"testCase4"})
	
	//group wise run test cases
	//@Test(groups="automobile")
	
	@Test
	public void testCase2() {
		try {
			Thread.sleep(400);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Web login TestCases...");
	}

	// @Test(description = "this is testcase3.")

	// @Test(priority=2)

	// add depedancy in test cases
	@Test(dependsOnMethods = { "testCase4" })
	public void testCase3() {
		System.out.println("Api login TestCases...");

	}

}
