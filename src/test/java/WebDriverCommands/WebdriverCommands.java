package WebDriverCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebdriverCommands {
	public static void main(String[] args) {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","C:\\Users\\pankaj.kumar\\workspace\\Seleniumsessions2022\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.automationexercise.com/products");
		driver.getPageSource();
		driver.getClass();
		driver.getCurrentUrl();
		driver.getTitle();
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().to("https://www.automationexercise.com/products");
		driver.navigate().refresh();
		//driver.close();
		//driver.quit();
		driver.getWindowHandle();
		//driver.switchTo().alert();
		//driver.switchTo().parentFrame();
		
	
		
		driver.findElement(By.name("search")).sendKeys("jeans");
	}
}
