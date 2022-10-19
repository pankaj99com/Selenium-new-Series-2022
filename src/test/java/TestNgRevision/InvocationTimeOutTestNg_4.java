package TestNgRevision;

import org.testng.annotations.Test;

public class InvocationTimeOutTestNg_4 {
	
	@Test(invocationTimeOut=10)
	public void run() {
		int i=1;
		while(i==1) {
			System.out.println("Running like a Rabbit");
		}
	}

}
