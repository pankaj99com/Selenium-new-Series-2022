package SeleniumSessions2022;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingDropdowns {

	public static void main(String[] args) {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","C:\\Users\\pankaj.kumar\\workspace\\Seleniumsessions2022\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
		driver.get("http://seleniumpractise.blogspot.com/2016/08/");
		
		driver.findElement(By.xpath("//button[normalize-space()='Tutorials']")).click();
		List<WebElement> li=driver.findElements(By.xpath("//ul[@class='dropdown-menu']//li/a"));
		System.out.println(li.size());
		for(int i=0;i<li.size();i++) {
			String ele=li.get(i).getText();
//			
//			if(ele.contains("CSS")) {
//				System.out.println("using getText() method: "+ele);
//				
//				
//				break;
//			}
			System.out.println(ele);
			
		}
		
	}

}
