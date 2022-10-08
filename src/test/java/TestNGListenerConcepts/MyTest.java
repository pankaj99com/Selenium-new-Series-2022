package TestNGListenerConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(TestNGListenerConcepts.MyListners.class)
public class MyTest extends Base {

	@BeforeMethod

	public void setup() {
		initiate();//code reusability achieved
		System.out.println("Browser launched");
	}

	@Test

	public void getTitle() {

		String title = driver.getTitle();

		Assert.assertEquals("Free CRM - CRM software for customer relationship management, sales, and support.",title);
		

	}

	@Test

	public void LogoTest() {

		WebElement logo = driver.findElement(By.xpath("//img[@src='https://classic.freecrm.com/img/logo.png']"));
		System.out.println(logo.isDisplayed());

		Assert.assertEquals(true, false);
		

	}

	@AfterMethod

	public void teardown() {
		driver.close();
		System.out.println("Driver closed....");
	}

}
