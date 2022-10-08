package LocatorsInSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator_ByID {

	public static void main(String[] args) {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","C:\\Users\\pankaj.kumar\\workspace\\Seleniumsessions2022\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://testmatick.com/best-demo-websites-to-perform-software-test-automation/");
		//<input name="s" id="s" type="text" placeholder="Search..." value="" style="" xpath="1">
		driver.findElement(By.id("s")).sendKeys("java");
		
		
	}

}
