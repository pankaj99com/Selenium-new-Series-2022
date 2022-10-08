package TestNGListenerConcepts;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class MyListners extends Base implements ITestListener{
	
	
	
	 
	public void onTestStart(ITestResult result) {  
	 
	}  
	  
	
	public void onTestSuccess(ITestResult result) {  
		success(result.getMethod().getMethodName());
		
		success();
		System.out.println("Screenshot taken");
	
	}  
	  
	 
	public void onTestFailure(ITestResult result) {  
		failure(result.getMethod().getMethodName());
		//System.out.println(result.getTestClass());
		System.out.println("Screenshot taken");
	  
	}  
	  
	 
	public void onTestSkipped(ITestResult result) {  
	 
	System.out.println("Skip of test cases and its details are : "+result.getName());  
	}  
	  

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {  
	
	System.out.println("Failure of test cases and its details are : "+result.getName());  
	}  
	  
 
	public void onStart(ITestContext context) {  
	 
	}  
	  
	public void onFinish(ITestContext context) {  
	
	}  
	

}
