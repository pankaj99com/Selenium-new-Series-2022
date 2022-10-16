package SeleniumSessions2022;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaleElementExceptionDemo {

	public static void main(String[] args) {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\pankaj.kumar\\workspace\\Seleniumsessions2022\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.automationexercise.com/products");
		WebElement searchbox = driver.findElement(By.className("input-lg"));
		try {
			driver.navigate().refresh();//because DOM is expiring we will get org.openqa.selenium.StaleElementReferenceException
			searchbox.sendKeys("Sweater");
		} catch (StaleElementReferenceException e) {
			driver.findElement(By.className("input-lg")).sendKeys("Sweater");//Reload the element and exception will be handled
		}
		
		

	}

}
