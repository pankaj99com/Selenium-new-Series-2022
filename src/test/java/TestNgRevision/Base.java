package TestNgRevision;

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

public class Base {

	public static WebDriver driver;

	public static void setup() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\pankaj.kumar\\workspace\\Seleniumsessions2022\\Drivers\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.get("https://classic.freecrm.com/index.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	}

	public static void failure(String methodName)  {
		TakesScreenshot ts=(TakesScreenshot) driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		try {
			
			String time=new SimpleDateFormat("YYYY_MM_DD_HH_MM_SS").format(new Date());
			
			FileHandler.copy(source, new File("C:\\Users\\pankaj.kumar\\workspace\\Seleniumsessions2022"
					+ "\\ScreenShots\\"+"Failure"+"_"+methodName.toUpperCase()+"_"+time+".png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
