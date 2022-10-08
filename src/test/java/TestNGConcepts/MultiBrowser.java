package TestNGConcepts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.*;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultiBrowser {

	public WebDriver driver;

	@Test
	@Parameters("browser")
	public void verifyTitleTest(String browser) throws Exception {
		
		
		System.out.println("Browser selected");
		if (browser.equalsIgnoreCase("firefox")) {

			System.out.println("Test");

			System.setProperty("webdriver.gecko.driver",
					"C:\\Users\\pankaj.kumar\\workspace\\Seleniumsessions2022\\Drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
			System.out.println("FF");
		} else if (browser.equalsIgnoreCase("chrome")) {

			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();

		}
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("https://classic.freecrm.com/index.html");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("pankaj99");
		// email.clear();
		// email.sendKeys(username);

		WebElement pass = driver.findElement(By.xpath("//input[@type='password']"));
		pass.clear();
		pass.sendKeys("Admin@12345");
		WebElement button=driver.findElement(By.xpath("//input[@type='submit']"));
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();",button);
		Thread.sleep(2000);

		
		String validTitle = "CRMPRO";
		String actualTitle = driver.getTitle();
		Assert.assertEquals(validTitle, actualTitle);
		driver.close();

	}

}
