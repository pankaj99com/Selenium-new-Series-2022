package SeleniumSessions2022;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingBrowserWindows {

	
	public static void main(String[] args) throws Exception {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","C:\\Users\\pankaj.kumar\\workspace\\Seleniumsessions2022\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
		driver.get("https://demo.automationtesting.in/Windows.html");
		//System.out.println("Parent window id: "+driver.getWindowHandles());
		driver.findElement(By.xpath("//a[@href='http://www.selenium.dev']//button[@class='btn btn-info'][normalize-space()='click']")).click();
		
		//String title=driver.getTitle();
		
		//System.out.println(title);
		
		Set<String> s=driver.getWindowHandles();
		System.out.println(s.size());
		//System.out.println(driver.switchTo().window(s).getTitle());
		
		
		for(String i:s) {
			System.out.println(i);
			
			String title1=driver.switchTo().window(i).getTitle();
			System.out.println(title1);
			if(title1.contains("Frames & windows")) {
				driver.close();
			}if(title1.contains("Selenium")) {
				driver.close();
		}
		}
		
		
		
	}
	}

	


