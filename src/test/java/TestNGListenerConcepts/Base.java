package TestNGListenerConcepts;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {

	public static WebDriver driver;

	public static void initiate() {
		
		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://classic.freecrm.com/index.html?e=1");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
	}

	public void failure(String methodName) {
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		try {
			Date date=new Date();
			
			SimpleDateFormat formatter = new SimpleDateFormat("MM_dd_yyyy_hh_mm_ss");
			String  timestamp=formatter.format(new Date());
			
			FileHandler.copy(src, new File("C:\\Users\\pankaj.kumar\\workspace\\Seleniumsessions2022\\ScreenShots\\"
					+ "Failure" + "_" + methodName +"_"+timestamp+ ".png"));
		} catch (IOException e) {

			e.printStackTrace();
		}
	}
	
	
	
	public void success(String methodName) {
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		try {
			Date date=new Date();
			
			SimpleDateFormat formatter = new SimpleDateFormat("MM_dd_yyyy_hh_mm_ss");
			String  timestamp=formatter.format(new Date());
			
			FileHandler.copy(src, new File("C:\\Users\\pankaj.kumar\\workspace\\Seleniumsessions2022\\ScreenShots\\"
					+ "Success" + "_" + methodName +"_"+timestamp+ ".png"));
		} catch (IOException e) {

			e.printStackTrace();
		}
	}
	
	public void success() {
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		try {
			Date date=new Date();
			
			SimpleDateFormat formatter = new SimpleDateFormat("MM_dd_yyyy_hh_mm_ss");
			String  timestamp=formatter.format(new Date());
			
			FileHandler.copy(src, new File("C:\\Users\\pankaj.kumar\\workspace\\Seleniumsessions2022\\ScreenShots\\"
					+ "Success" + "_"+timestamp+ ".png"));
		} catch (IOException e) {

			e.printStackTrace();
		}
	}
	
}
