package TestNgRevision;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MyTestcase2 {
	
	@Test
	public void test() {
		
		System.out.println("This is a test method");
	}
	
	@Test
	public void test1() {
		Assert.assertEquals(true, false);
		
	}

	@Test
	public void test2() {
		Assert.assertEquals(true, false);
		
	}
	@Test
	public void test3() {
		Assert.assertEquals(true, false);
		
	}
}
