package TestNgRevision;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(MyListner.class)
public class SccrenshotTesting extends Base{
	
	@BeforeMethod
	public void begin() {
		setup();
	}
	
	@Test
	public void LinkTest() {
		boolean link=driver.findElement(By.xpath("//input[@placeholder='Username']")).isDisplayed();
		Assert.assertEquals(true, false);
	}
	
	@Test
	public void titleTest() {
		String title=driver.getTitle();
		Assert.assertEquals(title, "CRMPRO");
	}
	
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}

}
