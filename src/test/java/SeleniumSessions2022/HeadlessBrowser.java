package SeleniumSessions2022;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessBrowser {

	public static void main(String[] args) {
		ChromeOptions options=new ChromeOptions();
		//options.addArguments("Headless");
		options.setHeadless(true);
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","C:\\Users\\pankaj.kumar\\workspace\\Seleniumsessions2022\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver(options);
		
		driver.get("Http://www.google.com");
		System.out.println(driver.getTitle());
	}

}
