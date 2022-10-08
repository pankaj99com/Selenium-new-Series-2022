package SeleniumSessions2022;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DD1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","C:\\Users\\pankaj.kumar\\workspace\\Seleniumsessions2022\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
		driver.get("https://www.jqueryscript.net/demo/Bootstrap-Style-Dropdown-Menu-Plugin-jQuery/");
        driver.findElement(By.xpath("//div[normalize-space()='Default Dropdown Menu']")).click();
        ////div[@class='dropdown open']/ul/li
      //ul[@class='dropdown-menu']/child::li
        List<WebElement> li=driver.findElements(By.xpath("//div[@class='dropdown open']/ul/li"));
        
        for(int i=0;i<li.size();i++) {
        	
        	System.out.println(li.get(i).getText());
        	
//        	if(li.get(i).getText().contains("HTML5/CSS/JavaScript")) {
//        		System.out.println(li.get(i).getAttribute("href"));
//        		break;
//        	}
}
	}
}
