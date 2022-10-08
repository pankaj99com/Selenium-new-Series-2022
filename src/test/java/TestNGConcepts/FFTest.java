package TestNGConcepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class FFTest {
	
	@Test
	 public void display() {
		
		
		System.setProperty("webdriver.gecko.driver","D:\\Pankaj-QA\\SELENIUM SOFTWARES\\geckodriver-v0.31.0-win64 (2)\\geckodriver.exe");
		WebDriver driver =new FirefoxDriver();
		
		driver.get("http://www.google.com");
		System.out.println(driver.getTitle());
		
		
	}

}
