package LocatorsInSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator_ByLinkText {

	public static void main(String[] args) {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","C:\\Users\\pankaj.kumar\\workspace\\Seleniumsessions2022\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.automationexercise.com/");
		//<a href="/test_cases" class="test_cases_list" xpath="1"><button type="button" 
		//class="btn btn-success">Test Cases</button></a>
		
		driver.findElement(By.className("test_cases_list")).click();
	}

}
