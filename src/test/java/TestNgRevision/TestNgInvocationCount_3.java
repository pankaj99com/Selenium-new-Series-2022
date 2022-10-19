package TestNgRevision;

import org.testng.annotations.Test;

public class TestNgInvocationCount_3 {
	/*@Test
	public void addition() {
		int i=0;
		int n=10;
		while(i<n) {
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println(c);
		i++;
		}
	}*/
	
	
	@Test(invocationCount=10)
	public void addition() {
		
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println(c);
	
		}
	

}
