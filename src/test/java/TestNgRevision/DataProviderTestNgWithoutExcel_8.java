package TestNgRevision;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import graphql.Assert;

public class DataProviderTestNgWithoutExcel_8 {

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

		driver.get("https://classic.freecrm.com/index.html");
	}

	@Test(dataProvider = "TestData")
	public void loginTest(String username, String password, String mode) {

		WebElement user = driver.findElement(By.xpath("//input[@placeholder='Username']"));

		user.clear();
		user.sendKeys(username);
		WebElement pwd = driver.findElement(By.xpath("//input[@placeholder='Password']"));
		pwd.clear();
		pwd.sendKeys(password);

		driver.findElement(By.xpath("//input[@value='Login']")).click();

		String title = "CRMPRO";
		String actualTitle = driver.getTitle();

		if (mode.equals("valid")) {
			if (title.equals(actualTitle)) {
				driver.switchTo().frame("mainpanel");
				driver.findElement(By.linkText("Logout")).click();
				Assert.assertTrue(true);

			} else {
				Assert.assertTrue(false);
			}
		} else if (mode.equals("invalid")) {
			if (title.equals(actualTitle)) {
				driver.switchTo().frame("mainpanel");
				Assert.assertTrue(false);
			} else {
				Assert.assertTrue(true);
			}
		}
	}
	// int a[][]=new int[][] {{1,2},{2,5},{3,6}};

	@DataProvider(name = "TestData")
	public Object[][] getData() {
		Object data[][] = { { "pankaj99", "Admin@12345", "valid" }, { "abhi", "Admin@123", "invalid" },
				{ "Pran", "Test@123", "invalid" }, { "pankaj99", "Admin@12345", "invalid" },
				{ "pankaj99", "123424", "invalid" }};
		return data;
	}

	@AfterMethod
	public void teardown() {
		driver.quit();
	}

}
