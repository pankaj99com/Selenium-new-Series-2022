package SeleniumSessions2022;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import JavaScriptUtility.JavaScriptUtil;
import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSearch {

	public static void main(String[] args) throws IOException {

		WebDriverManager.chromedriver().setup();
		// System.setProperty("webdriver.chrome.driver",
		// "C:\\Users\\pankaj.kumar\\workspace\\Seleniumsessions2022\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.google.com/");
		WebElement searchbox=driver.findElement(By.xpath("//input[@title='Search']"));
		JavaScriptUtil.drawBorder(searchbox, driver);
		ScreenShots.ScreenShots.CaptureScreenShot("C:\\Users\\pankaj.kumar\\workspace\\Seleniumsessions2022\\src\\test\\java\\SeleniumSessions2022\\Google.png", driver);
		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("Testing");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));// allowing
																			// list
																			// to
																			// load
																			// by
																			// giving
																			// some
																			// wait
		List<WebElement> list1 = driver
				.findElements(By.xpath("//ul[@role='listbox']//li/descendant::div[@class='wM6W7d']/span"));
		System.out.println(list1.size());
		for (int i = 0; i < list1.size(); i++) {

			String items = list1.get(i).getText();
			System.out.println(items);
			if (items.contains("testing tools")) {
				list1.get(i).click();
				break;// breaking after finding the "testing tools"
			}
		}
		driver.quit();
		System.out.println("----Test passed---");
	}

}
