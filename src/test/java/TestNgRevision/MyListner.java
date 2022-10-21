package TestNgRevision;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class MyListner extends Base implements ITestListener {
	Base obj=new Base();
	
	public void onTestStart(ITestResult result) {
		    // not implemented
		  }

	public void onTestSuccess(ITestResult result) {
		    // not implemented
		  }

		  
	public void onTestFailure(ITestResult result) {
		    System.out.println("There is failure.Taking screenshot!!");
		    System.out.println(result.getMethod().getMethodName());
				failure(result.getMethod().getMethodName());
				
		  }

		 
	public void onTestSkipped(ITestResult result) {
		    // not implemented
		  }

		 
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		    // not implemented
		  }

	
	public void onTestFailedWithTimeout(ITestResult result) {
		    onTestFailure(result);
		  }

		  
	public void onStart(ITestContext context) {
		    // not implemented
		  }

	
	public void onFinish(ITestContext context) {
		    // not implemented
		  }
		}

	

