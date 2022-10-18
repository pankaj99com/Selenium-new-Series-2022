package ScreenShots;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShots {
	WebDriver driver=null;
	public static void CaptureScreenShot(String filepath,WebDriver driver) {
	TakesScreenshot ts=(TakesScreenshot) driver;
	File src=ts.getScreenshotAs(OutputType.FILE);
	try {
		FileHandler.copy(src, new File(filepath));
	} catch (IOException e) {
		
		e.printStackTrace();
	}
	
	
	
	}
	
	
	

}
