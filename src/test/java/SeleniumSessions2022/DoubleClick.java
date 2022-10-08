package SeleniumSessions2022;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {

	public static void main(String[] args) {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","C:\\Users\\pankaj.kumar\\workspace\\Seleniumsessions2022\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);  deprecated in Selenium 4
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		//driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS); deprecated in Selenium 4
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
		
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_ondblclick_addeventlistener");
		driver.switchTo().frame("iframeResult");
		
		WebElement link=driver.findElement(By.xpath("//p[@id='demo']"));
		
		Actions action=new Actions(driver);
		
		action.doubleClick(link).build().perform();
		

	}

}
