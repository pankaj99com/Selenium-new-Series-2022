package LocatorsInSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator_ByCSSSelector {

	/*
	 * Rules:------ 1. TAG and ID------------------->TAG#ID 2. TAG and
	 * class---------------->TAG.CLASS 3. TAG and
	 * attribute------------>TAG[ATTRIBUTE=VALUE] 4.
	 * TAG,CLASS,ATTRIBUTE-------------->TAG.CLASS[ATTRIBUTE=VALUE]
	 */

	public static void main(String[] args) {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\pankaj.kumar\\workspace\\Seleniumsessions2022\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.automationexercise.com/");
		// <input type="email" id="susbscribe_email" required=""
		// placeholder="Your email address">

		// 1. TAG and ID------------------->TAG#ID
		driver.findElement(By.cssSelector("input#susbscribe_email")).sendKeys("pankaj99.com@gmail.com");
		driver.findElement(By.cssSelector("input#susbscribe_email")).clear();

		// 3. TAG and attribute------------>TAG[ATTRIBUTE=VALUE]
		driver.findElement(By.cssSelector("input[type=email]")).sendKeys("pankaj");

		// 2. TAG and class---------------->TAG.CLASS
		driver.get("https://www.facebook.com/");
		// <input type="text" class="inputtext _55r1 _6luy" name="email"
		// id="email" data-testid="royal_email"
		// placeholder="Email address or phone number" autofocus="1"
		// aria-label="Email address or phone number">
		driver.findElement(By.cssSelector("input.inputtext")).sendKeys("sweater");

		// 4. TAG,CLASS,ATTRIBUTE-------------->TAG.CLASS[ATTRIBUTE=VALUE]*/
		// <input type="text" class="inputtext _55r1 _6luy" name="email"
		// id="email" data-testid="royal_email"
		// placeholder="Email address or phone number" autofocus="1"
		// aria-label="Email address or phone number">
		driver.findElement(By.cssSelector("input.inputtext[id=email]")).sendKeys("ABVSFSFFSF");

	}

}
