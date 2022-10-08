package Dropdowns;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) throws Exception {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","C:\\Users\\pankaj.kumar\\workspace\\Seleniumsessions2022\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://semantic-ui.com/modules/dropdown.html");
		driver.findElement(By.xpath("//div[@class='ui fluid dropdown selection multiple']")).click();
		Thread.sleep(2000);
		List<WebElement> li=driver.findElements(By.xpath("//div[text()='Angular']//parent::*"));
		
		for(int i=0;i<li.size();i++) {
			System.out.println(li.get(i).getText());
		}
		
	}

}
