package TestNGConcepts;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FirstTestNgDemo {

	WebDriver driver;

	@BeforeSuite

	public void setup() {

		System.out.println("@BeforeSuite--->Chrome setup method");

	}

	@BeforeTest
	public void browserlaunch() {
		System.out.println("@BeforeTest--->Launch chrome browser");
	}

	@BeforeClass
	public void login() {
		System.out.println("@BeforeClass--->login to app");
	}
	
	@BeforeMethod
	
	public void enterUrl() {
		
		System.out.println("@BeforeMethod--->entering url");
	}
	
	@Test
	public void googleTitleTest() {
		
		System.out.println("Google Title Test");
	}
	
	@AfterMethod
	
	public void logout() {
		System.out.println("@AfterMethod--->Logout");
	}
	
	
	@AfterClass
	public void deleteAllCookies() {
		System.out.println("@AfterClass--->Delete all cookies");
	}
	
	
	@AfterTest
	
	public void close() {
		System.out.println("@AfterTest--->Close the browser");
	}
	
	
	@AfterSuite
	
	public void generateReports() {
		System.out.println("@AfterSuite--->Genearte reports");
	}
	

}
