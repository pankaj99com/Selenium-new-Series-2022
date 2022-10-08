package TestNGConcepts;

import org.testng.annotations.Test;

public class DependsOnConcept {
	
	
	@Test
	public void loginMethod() {
		int a=9;
		int b=a/0;
		
		System.out.println(b);
		System.out.println("loginMethod");
	}
	
	@Test(dependsOnMethods="loginMethod")
	public void addToCart() {
		System.out.println("addToCart");
	}
	
	
	@Test(dependsOnMethods="loginMethod")
	public void paymentMethod() {
		System.out.println("paymentMethod");
	}

}
