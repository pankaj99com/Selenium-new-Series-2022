package LocatorsInSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator_ByClassName {

	public static void main(String[] args) {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\pankaj.kumar\\workspace\\Seleniumsessions2022\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.automationexercise.com/products");
		/*
		 * <input type="text" name="search" id="search_product" value=""
		 * placeholder="Search Product" class="form-control input-lg" xpath="1">
		 * 
		 */

		driver.findElement(By.className("input-lg")).sendKeys("Sweater");
	}

}
