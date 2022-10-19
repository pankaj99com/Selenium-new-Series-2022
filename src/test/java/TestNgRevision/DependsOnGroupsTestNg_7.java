package TestNgRevision;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DependsOnGroupsTestNg_7 {

	@BeforeMethod
	public void setup() {
		System.out.println("This is Setup method in @BeforeMethod");
	}
	
	@Test(groups="A1")
	public void login() {
		Assert.assertEquals(true, false);
		System.out.println("login method");
	}
	
	
	@Test(groups="B1",dependsOnGroups="A1")
	public void homeTest() {
		System.out.println("This is home page test method");
	}
	
	
	@Test(groups="C1",dependsOnGroups="B1")
	public void contactsTest() {
		System.out.println("This is contacts page test method");
	}
	
	@Test(groups="test1")
	public void A() {
		System.out.println("This is Method A");
	}

	@Test(groups="test",dependsOnGroups="A1")
	public void B() {
		System.out.println("This is Method B");
	}

	@Test(groups="test",dependsOnGroups="A1")
	public void C() {
		System.out.println("This is Method C");
	}
	
	@Test(groups="test1")
	public void D() {
		System.out.println("This is Method D");
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
