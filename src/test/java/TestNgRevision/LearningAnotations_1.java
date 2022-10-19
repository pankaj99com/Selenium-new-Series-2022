package TestNgRevision;

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

public class LearningAnotations_1 {
	
	/*
	@BeforeSuite--@AfterSuite//only one  time execution happens
	@BeforeTest--@AfterTest//only one  time execution happens
	@BeforeClass--@AfterClass//only one  time execution happens
	@BeforeMethod--@AfterMethod//This method will execute everytime for each test case
	@Test(priority,dependsOnMethods,dependsOnGroups,invocationCount,invocationTimeOut,expectedExceptions)
	@Parameters*/
	
	WebDriver driver;
	
	@BeforeSuite
	public void setup() {
		System.out.println("-----BeforeSuite----");
	}
	
	@BeforeTest
	public void launch() {
		System.out.println("-----Before Test----");
	}
	
	
	@BeforeClass
	public void settings() {
		System.out.println("----Before Classs----");
	}
	
	
	
	@BeforeMethod
	public void systemsetup() {
		System.out.println("----Before Method----");
	}
	
	
	@Test(priority=1)
	public void title() {
		System.out.println("----Title test---");
	}
	
	@Test(priority=2)
	public void button() {
		System.out.println("----Button test----");
	}
	
	@Test(priority=3)
	public void link() {
		System.out.println("----Link test----");
	}
	
	
	@AfterMethod
	public void releaseSetup() {
		System.out.println("----After Method----");
	}
	
	
	@AfterClass
	public void release() {
		System.out.println("----After Class----");
	}
	
	
	@AfterTest
	public void close() {
		System.out.println("----After Test----");
	}
	
	
	
	
	@AfterSuite
	public void teardown() {
		System.out.println("----After suite----");
	}
	

}
