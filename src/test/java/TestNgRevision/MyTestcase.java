package TestNgRevision;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MyTestcase {
	//This retry analyzer is implemented at test level
	@Test(retryAnalyzer = TestNgRevision.MylogicForRetry.class)
	public void test() {
		
		System.out.println("This is a test method");
	}
	
	@Test(retryAnalyzer = TestNgRevision.MylogicForRetry.class)
	public void test1() {
		Assert.assertEquals(true, false);
		
	}


}
