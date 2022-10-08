package SeleniumSessions2022;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingCalendar {

	public static void main(String[] args) throws Exception {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","C:\\Users\\pankaj.kumar\\workspace\\Seleniumsessions2022\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);  //deprecated in Selenium 4
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		
		//driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS); deprecated in Selenium 4
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
		
		driver.get("https://www.redbus.in/");
		
		driver.findElement(By.xpath("//input[@id='src']")).sendKeys("Bangalore");
		driver.findElement(By.xpath("//input[@id='src']")).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='dest']")).sendKeys("Chennai");
		driver.findElement(By.xpath("//input[@id='dest']")).sendKeys(Keys.ENTER);
		WebElement calander=driver.findElement(By.xpath("//input[@id='onward_cal']"));
		calander.click();
		calander.sendKeys(Keys.ENTER);
		
		
	
//		try {
//			calander.click();
//		} catch (StaleElementReferenceException e) {
//			calander=driver.findElement(By.xpath("//table[@class='rb-monthTable first last']"));
//			calander.click();
//		}
		List<WebElement> dates=driver.findElements(By.xpath("//table[@class='rb-monthTable first last']/tbody/tr/td"));
//		
		
		/* //table[@class='rb-monthTable first last']/tbody/tr[1]/td[2]
		 * 
		 * //table[@class='rb-monthTable first last']/tbody/tr[1]/td[3]
		 * 
		 * //table[@class='rb-monthTable first last']/tbody/tr[1]/td[1]
		 */

		int total_cells=dates.size();
		
		for(int i=0;i<total_cells;i++) {
			
			String date=dates.get(i).getText();
			
			if(date.equals("30")) {
				dates.get(i).click();
				JavascriptExecutor js=(JavascriptExecutor) driver;
				js.executeScript("arguements[0].click();",driver.findElement(By.xpath("//button[@id='search_btn']")));
				
				
			}
		}
		
		driver.findElement(By.xpath("//button[@id='search_btn']" )).click();
		
	}

}
