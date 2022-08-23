package RetryFaildTestCases;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class FaildTestCases {

	//@Test(retryAnalyzer = RetryAnalyserDemo.class)
	 @Test
	public void TestCases02() {
		Assert.assertTrue(false); // test case will fail
	}

	//@Test(retryAnalyzer = RetryAnalyserDemo.class)
	@Test
	public void TestCases01() {
		Assert.assertTrue(false); // test case will fail
	}

	//@Test(retryAnalyzer = RetryAnalyserDemo.class)
	 @Test
	public void TestCases03() {
		Assert.assertTrue(true); // test case will pass
	}
}
