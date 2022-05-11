package testcase;
import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryFailedTc implements IRetryAnalyzer {

	int count=0;
	public boolean retry(ITestResult result) {

		if(!result.isSuccess()&& count<4)
		{
			count++;
			return true;
		}		
		
		return false;
	
	}

}
