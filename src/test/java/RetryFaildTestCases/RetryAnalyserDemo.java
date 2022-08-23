package RetryFaildTestCases;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyserDemo implements IRetryAnalyzer {
	
	//counter to keep track of retry attempts
	int counterRetryAttempts = 0;
	
	//set maxlimit for retry
	int setMaxLimitForRetry = 3;

	
	//this method to retry failed test cases
	public boolean retry(ITestResult result) {
		// TODO Auto-generated method stub
		
		if(!result.isSuccess())
		{
			if(counterRetryAttempts < setMaxLimitForRetry)
			
			{
				counterRetryAttempts++;
				return true;
			}
		}
		return false;
	}
	
	

}
