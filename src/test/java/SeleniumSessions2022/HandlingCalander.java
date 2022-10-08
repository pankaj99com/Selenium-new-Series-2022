package SeleniumSessions2022;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingCalander {

	public static void main(String[] args) {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\pankaj.kumar\\workspace\\Seleniumsessions2022\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();
		
		//a[@title='Prev']
		
		////a[@title='Next']
		//div[@class='ui-datepicker-title']
		
		String monthyear=driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText();
		
		System.out.println(monthyear);
		
		String month=monthyear.split("\\s")[0].trim();
		String year=monthyear.split("\\s")[1].trim();
		
		System.out.println(month);
		System.out.println(year);
		
		while(!(month.equals("October")&& year.equals("2020"))) {
			driver.findElement(By.xpath("//a[@title='Prev']")).click();
			monthyear=driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText();
			System.out.println(monthyear);
			
			month=monthyear.split("\\s")[0].trim();
			year=monthyear.split("\\s")[1].trim();
		}
		
		driver.findElement(By.xpath("//a[text()='9']")).click();

	}

}
