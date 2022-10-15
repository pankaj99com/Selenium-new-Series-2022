package lib;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import com.google.common.base.Function;

public class MyFluentWait {
	public static void WaitForSpecificElement(WebDriver driver,final By locator) {
		
	
	Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(40))
			.pollingEvery(Duration.ofSeconds(1)).ignoring(NoSuchElementException.class);

	WebElement LocatedElement = wait.until(new Function<WebDriver, WebElement>() {
		public WebElement apply(WebDriver driver) {
			return driver.findElement(locator);
		}
	});
	LocatedElement.click();
	}
}
