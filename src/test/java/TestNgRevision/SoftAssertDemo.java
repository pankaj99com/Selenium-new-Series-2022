package TestNgRevision;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertDemo {
	
	static SoftAssert softassert=new SoftAssert();
	
	
	@Test
	public static void begin() {
		System.out.println("open chrome browser");
		softassert.assertEquals(true, true);
		System.out.println("enter user details");
		System.out.println("click on signin button");
		softassert.assertEquals(true, true);
		
		System.out.println("welcome to home page");
		softassert.assertEquals(true, false,"home page check");
		System.out.println("go to cart");
		System.out.println("make payment");
		softassert.assertEquals(true, false,"unable to make payment");
		
		System.out.println("go to customer care page");
		System.out.println("provide feedback");
		softassert.assertEquals(true,false,"Unable to contact customer care");
		
		
		softassert.assertAll();//this particular statement actuall collects all failures together and print it at last 
	}
	

	@Test
	public static void end() {
		System.out.println("open chrome browser===>end");
		Assert.assertEquals(true, true);
		System.out.println("enter user details===>end");
		System.out.println("click on signin button===>end");
		Assert.assertEquals(true, true);
		
		System.out.println("welcome to home page===>end");
		Assert.assertEquals(true, false,"home page check===>end");
		System.out.println("go to cart===>end");
		System.out.println("make payment===>end");
		Assert.assertEquals(true, false,"unable to make payment===>end");
		
		System.out.println("go to customer care page===>end");
		System.out.println("provide feedback===>end");
		Assert.assertEquals(true,true);
		
		
		softassert.assertAll();//this particular statement actuall collects all failures together and print it at last 
	}
	
}
