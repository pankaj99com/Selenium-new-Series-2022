package Waits;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Function;

import io.github.bonigarcia.wdm.WebDriverManager;
import lib.MyFluentWait;

public class WebDriverWaitDemo {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();

		// WebDriver driver;
		// System.setProperty("webdriver.chrome.driver",
		// "C:\\Users\\pankaj.kumar\\workspace\\Seleniumsessions2022\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://omayo.blogspot.com/");
		
		
//		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30))
//				.pollingEvery(Duration.ofSeconds(1)).ignoring(NoSuchElementException.class);
//
//		WebElement dropdownBtn = wait.until(new Function<WebDriver, WebElement>() {
//			public WebElement apply(WebDriver driver) {
//				return driver.findElement(By.className("dropbtn"));
//			}
//		});
		
		//MyFluentWait.WaitForSpecificElement(driver, By.className("dropbtn"));
		Thread.sleep(4000);
		System.out.println("waiting done");
		MyFluentWait.WaitForSpecificElement(driver, By.xpath("//a[normalize-space()='Facebook']"));
		System.out.println("PASS");
	}

}
