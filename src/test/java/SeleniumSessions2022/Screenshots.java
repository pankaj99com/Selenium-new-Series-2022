package SeleniumSessions2022;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshots {
	static WebDriver driver;

	public static void screenCapture(String filepath, String name, WebDriver driver1) throws IOException {

		TakesScreenshot screenshot = (TakesScreenshot) driver;
		File src = screenshot.getScreenshotAs(OutputType.FILE);

		FileHandler.copy(src, new File(filepath + name + ".png"));
	}

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\pankaj.kumar\\workspace\\Seleniumsessions2022\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("Http://www.google.com");
		
		Screenshots.screenCapture("D:\\Pankaj-QA\\ScriptsScreeshots\\", "google",driver );
	}

}
