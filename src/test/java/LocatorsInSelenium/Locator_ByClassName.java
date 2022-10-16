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
		driver.manage().window().maximize();
		driver.get("https://www.automationexercise.com/products");
		String title=JavaScriptUtil.getTitleByJS(driver);
		System.out.println(title);
		/*
		 * <input type="text" name="search" id="search_product" value=""
		 * placeholder="Search Product" class="form-control input-lg" xpath="1">
		 * 
		 */
		WebElement searchbox = driver.findElement(By.className("input-lg"));
		JavaScriptUtil.flash(driver, searchbox);
		JavaScriptUtil.drawBorder(searchbox, driver);
	
		driver.findElement(By.className("input-lg")).sendKeys("Sweater");
		WebElement searchBtn=driver.findElement(By.xpath("//button[@id='submit_search']"));
		JavaScriptUtil.clickByJS(searchBtn, driver);
		//JavaScriptUtil.generateAlertByJS(driver, "You clicked on Search button");
		JavaScriptUtil.refreshBrowserByJS(driver);
		WebElement email=driver.findElement(By.xpath("//input[@type='email']"));
		WebElement kids=driver.findElement(By.xpath("//a[normalize-space()='Kids']"));
		JavaScriptUtil.scrollPageDownByJS(driver);
	    JavaScriptUtil.scrollIntoViewByJS(kids,driver);
	    JavaScriptUtil.drawBorder(kids, driver);
	    JavaScriptUtil.scrollByIndexJS(driver);

}
}
