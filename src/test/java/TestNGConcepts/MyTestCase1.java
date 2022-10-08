package TestNGConcepts;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MyTestCase1 {

	@Test

	public void test1() {
		System.out.println("Test1");
	}

	@Test
	public void test2() {
		System.out.println("Test2");
	}

	@Test
	public void test3() {
		System.out.println("Test3");
	}

	@Test(retryAnalyzer = RetryAnalyzerDemo.RetryAnalyzer.class)
	public void test4() {
		System.out.println("Test4");
		Assert.assertEquals(true, false);
	}

	@Test
	public void test5() {

		System.out.println("Test5");
		Assert.assertEquals(true, false);
	}

}
