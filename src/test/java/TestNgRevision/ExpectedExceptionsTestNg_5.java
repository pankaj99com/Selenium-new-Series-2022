package TestNgRevision;

import org.testng.annotations.Test;

public class ExpectedExceptionsTestNg_5 {

	@Test(expectedExceptions = { ArithmeticException.class })
	public void run() {
		int i = 9;
		int j = i / 0;
		System.out.println(j);

		System.out.println("Exception handled by --->expectedExceptions<----- ");
	}

}
