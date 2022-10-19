package TestNgRevision;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DependOnMethodInTestNg_6 {
	
	
	
	@BeforeMethod
	public void setup() {
		System.out.println("This is Setup method in @BeforeMethod");
	}
	
	@Test()
	public void login() {
		int a=9;
		int b=a/0;
		System.out.println("login method");
	}
	
	
	@Test(dependsOnMethods="login")
	public void homeTest() {
		System.out.println("This is home page test method");
	}
	
	
	@Test(dependsOnMethods="login")
	public void contactsTest() {
		System.out.println("This is contacts page test method");
	}
	
	
	@Test
	public void logout() {
		System.out.println("This is logout test method");
	}
	
	
	@AfterMethod
	public void tearDown() {
		System.out.println("This is teardown method in @AfterMethod");
	}

}
