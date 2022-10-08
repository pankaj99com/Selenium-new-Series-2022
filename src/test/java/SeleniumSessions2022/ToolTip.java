package SeleniumSessions2022;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ToolTip {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","C:\\Users\\pankaj.kumar\\workspace\\Seleniumsessions2022\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
//		System.setProperty("webdriver.gecko.driver","C:\\Users\\pankaj.kumar\\workspace\\Seleniumsessions2022\\Drivers\\geckodriver.exe");
//		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
		driver.get("https://en.wikipedia.org/wiki/Tooltip");
		
		WebElement tooltip=driver.findElement(By.xpath("//p//a[contains(text(),'graphical user interface')][1]"));
		Actions action=new Actions(driver);
		action.moveToElement(tooltip).build().perform();
		
		String text=tooltip.getAttribute("innerHTML");
		System.out.println(text);
	}

}
