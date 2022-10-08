package JavascriptExecutorDemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class TestDemo {

	public static void main(String[] args) {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","C:\\Users\\pankaj.kumar\\workspace\\Seleniumsessions2022\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);  deprecated in Selenium 4
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS); deprecated in Selenium 4
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.get("https://www.wikipedia.org/");
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		//1.title of page
		
		String title=js.executeScript("return document.title").toString();
		System.out.println(title);
		
	
		
		//2.domain name
		String domainName=js.executeScript("return document.domain").toString();
		System.out.println(domainName);
		
		
		//3.Innerhtml
		
		driver.get("https://www.orangehrm.com/");
		String linktxt=js.executeScript("return document.getElementById('linkadd').innerHTML").toString();
		System.out.println(linktxt);
		//System.out.println(driver.findElement(By.id("searchInput")).getAttribute("innerHTML"));

		
		//4.QuerySelector
		
		js.executeScript("document.querySelector('input.form-control').value='pankajkumar@gmail.com'");
		driver.manage().deleteAllCookies();
	
		WebElement button=driver.findElement(By.id("linkadd"));
		System.out.println(driver.manage().getCookies());
		//button.click();
		//buuton click
		//driver.get("https://demo.automationtesting.in/Index.html");
		js.executeScript("arguments[0].click();",button);
		
		//driver.navigate().refresh();//selenium
		
		js.executeScript("history.go[0]");
		
		//js.executeScript("window.scrollBy(0,400)");
		
		//js.executeScript("document.getElementById('Form_getForm_action_submitForm').scrollIntoView()");
		
//		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
//		js.executeScript("window.scrollBy(0,0)");
		WebElement ele=driver.findElement(By.xpath("//input[@type='submit']"));
		String test=ele.getLocation().toString();
		System.out.println(test);
		for(int i=0;i<20;i++) {
		
			driver.findElement(By.id("Form_getForm_action_submitForm")).sendKeys(Keys.DOWN);
			
		
		}


		
	}

}
