package Docker;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class TestOnDocker1 {
	static WebDriver driver;
	@Test
		public void Test1() throws InterruptedException, MalformedURLException {

			String nodeURL = "http://localhost:4444/wd/hub";
			DesiredCapabilities cap = new DesiredCapabilities();
			cap.setBrowserName("firefox");
			//cap.setPlatform(Platform.WIN10);
			
		//System.setProperty("webdriver.chrome.driver", "D:\\Pankaj-QA\\SELENIUM SOFTWARES\\chromedriver.exe");
			driver = new RemoteWebDriver(new URL(nodeURL), cap);

			driver.get("https://classic.freecrm.com/index.html");
			driver.findElement(By.xpath("//input[@type='text']")).sendKeys("pankaj99");
			// email.clear();
			// email.sendKeys(username);

			WebElement pass = driver.findElement(By.xpath("//input[@type='password']"));
			pass.clear();
			pass.sendKeys("Admin@12345");
			WebElement button = driver.findElement(By.xpath("//input[@type='submit']"));
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click();", button);
			Thread.sleep(2000);

			String validTitle = "CRMPRO";
			String actualTitle = driver.getTitle();
			System.out.println(actualTitle);
			if (validTitle.equals(actualTitle)) {
				System.out.println("Test passed");
			} else {
				System.out.println("Test Failed");
			}
			driver.close();

		}

	}
