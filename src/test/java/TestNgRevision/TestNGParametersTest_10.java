package TestNgRevision;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGParametersTest_10 {
	WebDriver driver;
	@Parameters({"browser"})
	@BeforeMethod

	public void setup(String browsername) {
		if(browsername.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\pankaj.kumar\\workspace\\Seleniumsessions2022\\Drivers\\chromedriver.exe");
			driver=new ChromeDriver();

		} else if(browsername.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver",
					"C:\\Users\\pankaj.kumar\\workspace\\Seleniumsessions2022\\Drivers\\geckodriver.exe");
			driver=new FirefoxDriver();
		}
	}
	@Parameters({"un","pwd","url"})
	@Test
	
	public void CRMLoginTest(String username,String password,String url) {
		
		
		driver.get(url);
		WebElement user = driver.findElement(By.xpath("//input[@placeholder='Username']"));

		user.clear();
		user.sendKeys(username);
		WebElement pwd = driver.findElement(By.xpath("//input[@placeholder='Password']"));
		pwd.clear();
		pwd.sendKeys(password);

		WebElement btn=driver.findElement(By.xpath("//input[@value='Login']"));
		JavascriptExecutor js=((JavascriptExecutor) driver);
		js.executeScript("arguments[0].click();", btn);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.switchTo().frame("mainpanel");
		WebElement btn1=driver.findElement(By.linkText("Logout"));
		btn1.click();
		//js.executeScript("arguments[0].click();", btn);
		
	}
	
	@AfterMethod
	
	public void teardown() {
		driver.quit();
	}
	

}
