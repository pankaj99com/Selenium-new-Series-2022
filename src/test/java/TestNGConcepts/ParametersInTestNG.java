package TestNGConcepts;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParametersInTestNG {
	
	WebDriver driver;
	
	
	
	
	@Test
	@Parameters({"username","password","url","Env"})
	public void loginTest(String username, String password,String url,String Env) throws IOException {
		if(Env.equals("QA")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();

			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));

			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));

			driver.manage().deleteAllCookies();

			driver.manage().window().maximize();

			driver.get(url);


			 driver.findElement(By.xpath("//input[@type='text']")).sendKeys(username);;
//			email.clear();
//			email.sendKeys(username);

			WebElement pass = driver.findElement(By.xpath("//input[@type='password']"));
			pass.clear();
			pass.sendKeys(password);

			driver.findElement(By.xpath("//input[@type='submit']")).click();
			String validTitle = "CRMPRO";
			String actualTitle = driver.getTitle();
		
		}else {
			System.out.println("Sorry cannot run at this moment");
		}
		
	}
	
	
	@AfterMethod

	public void teardown() {
		driver.close();
	}
}
