package LocatorsInSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import JavaScriptUtility.JavaScriptUtil;

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
		WebElement searchbox = driver.findElement(By.className("input-lg"));
		JavaScriptUtil.flash(driver, searchbox);
		JavaScriptUtil.drawBorder(searchbox, driver);
		driver.findElement(By.className("input-lg")).sendKeys("Sweater");
		
	} 

}
