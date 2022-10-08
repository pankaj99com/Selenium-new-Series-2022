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
import org.openqa.selenium.interactions.Actions;

public class SliderHandling {

	public static void main(String[] args) throws Exception {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\pankaj.kumar\\workspace\\Seleniumsessions2022\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://jqueryui.com/slider/");
		driver.switchTo().frame(0);
		WebElement slide=driver.findElement(By.xpath("//div[@id='slider']/span"));
		
		System.out.println(slide.getLocation());
		System.out.println(slide.getSize());
		
		Actions action=new Actions(driver);
		action.dragAndDropBy(slide, 200,0).perform();;
		
		System.out.println(" TEST");
		

		
		
		

	}

}
