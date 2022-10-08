package SeleniumSessions2022;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingCalendar2 {

	public static void main(String[] args) throws Exception {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\pankaj.kumar\\workspace\\Seleniumsessions2022\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.redbus.in/");

		WebElement source = driver.findElement(By.xpath("//input[@id='src']"));
		driver.navigate().refresh();
		try {
			source.sendKeys("Bangalore");
		} catch (StaleElementReferenceException e) {
			source = driver.findElement(By.xpath("//input[@id='src']"));
			source.sendKeys("Mysuru");
		}
		driver.findElement(By.xpath("//input[@id='src']")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath(" //input[@id='dest']")).sendKeys("Chennai");

		driver.findElement(By.xpath(" //input[@id='dest']")).sendKeys(Keys.ENTER);

		driver.findElement(By.xpath("//input[@id='onward_cal']")).click();
		String monthyear = driver.findElement(By.xpath("//td[@class='monthTitle']")).getText();
		System.out.println(monthyear);
		String month = monthyear.split(" ")[0].trim();
		String year = monthyear.split(" ")[1].trim();

		while (!(month.equals("Feb") && year.equals("2023"))) {

			driver.findElement(By.xpath("//td[@class='next']")).click();
			monthyear = driver.findElement(By.xpath("//td[@class='monthTitle']")).getText();
			System.out.println(monthyear);

			month = monthyear.split(" ")[0].trim();
			year = monthyear.split(" ")[1].trim();

		}
		driver.findElement(By.xpath("//td[text()='9']")).click();

	}

}
