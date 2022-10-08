package TestNGConcepts;

import org.testng.annotations.Test;

public class InvocationCount {
	
//	@Test
//	public void sum() {
//		for(int i=0;i<=20;i++) {
//		int a=10;
//		int b=20;
//		int c=a+b;
//		System.out.println("Sum of a and b is:"+c);
//		}
//	}
//	
	@Test(invocationCount=20)
	public void sum() {
		
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println("Sum of a and b is:"+c);
		
	}

}
