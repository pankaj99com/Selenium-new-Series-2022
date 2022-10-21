package TestNgRevision;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class MylogicForRetry implements IRetryAnalyzer {
	int count=0;
	int retrylimit=10;

	public boolean retry(ITestResult result) {
		if(count<retrylimit) {
			count++;
		return true;
		}
		
		return false;
	}

}
