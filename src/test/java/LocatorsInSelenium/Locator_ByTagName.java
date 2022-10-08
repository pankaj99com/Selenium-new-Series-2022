package LocatorsInSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator_ByTagName {

	public static void main(String[] args) {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\pankaj.kumar\\workspace\\Seleniumsessions2022\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.automationexercise.com/");
		// <a href="/products" xpath="1"><i class="material-icons card_travel"
		// style="font-size: 16px;"></i> Products</a>
		int no = driver.findElements(By.tagName("a")).size();
		System.out.println("number of tags:::" + no);

		int no1 = driver.findElements(By.tagName("div")).size();

		System.out.println("number of div tags are: " + no1);

		int no2 = driver.findElements(By.tagName("button")).size();

		System.out.println("number of button tags are: " + no2);
	}

}
