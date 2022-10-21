package TestNgRevision;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleAnnotationTesting_2 {

	WebDriver driver;

	@BeforeMethod
	public void setup() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\pankaj.kumar\\workspace\\Seleniumsessions2022\\Drivers\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
		driver.manage().deleteAllCookies();

		driver.get("http://www.google.com");

	}

	@Test(priority=1,groups="Title")
	public void titleTest() {
		System.out.println("Title of page is" + driver.getTitle());
	}

	@Test(priority=2,groups="logo")
	public void logoTest() {
		boolean logo = driver.findElement(By.xpath("//img[@class='lnXdpd']")).isDisplayed();
		Assert.assertTrue(logo);
	}
	
	@Test(priority=2,groups="link")
	public void imageLinkTest() {
		boolean image = driver.findElement(By.xpath("//a[normalize-space()='Images']")).isDisplayed();
		Assert.assertTrue(image);
	}
	
	@Test(priority=3,groups="link",invocationTimeOut=10)
	public void linkTest() {
		boolean gmail = driver.findElement(By.xpath("//a[text()='Gmail']")).isDisplayed();
		Assert.assertTrue(gmail);
	}

	@Test(priority=3,groups="test1")
	public void A() {
		System.out.println("This is Method A");
		Assert.assertEquals(true, false);
	}

	@Test(priority=3,groups="test")
	public void B() {
		System.out.println("This is Method B");
	}

	@Test(priority=3,groups="test")
	public void C() {
		System.out.println("This is Method C");
	}
	
	@Test(priority=3,groups="test1")
	public void D() {
		System.out.println("This is Method D");
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
