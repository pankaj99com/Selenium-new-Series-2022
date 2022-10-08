package SeleniumSessions2022;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingJavascriptAlert {

	public static void main(String[] args) {

		WebDriver driver;

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\pankaj.kumar\\workspace\\Seleniumsessions2022\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@type='submit']")).click();

		Alert alert = driver.switchTo().alert();
		String text = alert.getText();

		if (text.equals("Please enter a valid user name")) {

			System.out.println("Correct Alert message found");
			System.out.println("Test case passed");
		} else {
			System.out.println("Invalid alert message");
			System.out.println("Test case failed");
		}

		alert.accept();

		driver.quit();

	}

}
