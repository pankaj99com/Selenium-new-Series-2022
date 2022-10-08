package SeleniumSessions2022;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Calander {

	public static void main(String[] args) throws Exception {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\pankaj.kumar\\workspace\\Seleniumsessions2022\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");

		driver.findElement(By.id("datepicker")).click();
		String monthyearval = driver.findElement(By.className("ui-datepicker-title")).getText();

		System.out.println(monthyearval);

		String monthval = monthyearval.split(" ")[0].trim();
		String yearval = monthyearval.split(" ")[1].trim();

		while (!(monthval.equals("October") && yearval.equals("2014"))) {
			driver.findElement(By.xpath("//a[@title='Prev']")).click();
			monthyearval = driver.findElement(By.className("ui-datepicker-title")).getText();
			System.out.println(monthyearval);
			monthval = monthyearval.split(" ")[0].trim();
			yearval = monthyearval.split(" ")[1].trim();
		}

		driver.findElement(By.xpath("//a[text()='9']")).click();

	}

}
