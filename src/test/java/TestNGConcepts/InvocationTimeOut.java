package TestNGConcepts;

public class InvocationTimeOut {
	
	
	@org.testng.annotations.Test(invocationTimeOut=3)
	public void Test() {
		int i=1;
		while(i==1) {
			System.out.println("Hello");
		}
	}

}
