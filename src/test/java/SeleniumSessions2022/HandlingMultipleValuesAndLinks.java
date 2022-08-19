package SeleniumSessions2022;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingMultipleValuesAndLinks {

	public static void main(String[] args) {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","C:\\Users\\pankaj.kumar\\workspace\\Seleniumsessions2022\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);  deprecated in Selenium 4
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS); deprecated in Selenium 4
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.get("https://www.wikipedia.org/");
		List<WebElement> element=driver.findElements(By.xpath("//select[@id='searchLanguage']"));
		
		for(int i=0;i<element.size();i++) {
			System.out.println(element.get(i).getText());
		}
		
		//finding links in a page
		List<WebElement> links=driver.findElements(By.tagName("a"));
		for(int i=0;i<links.size();i++) {
			System.out.println(links.get(i).getAttribute("href"));
		}
		System.out.println("Toal links:"+links.size());

	}

}
