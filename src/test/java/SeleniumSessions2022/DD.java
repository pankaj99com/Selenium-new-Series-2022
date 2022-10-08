package SeleniumSessions2022;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DD {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","C:\\Users\\pankaj.kumar\\workspace\\Seleniumsessions2022\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
		driver.get("https://semantic-ui.com/modules/dropdown.html");
        driver.findElement(By.xpath("//div[@class='ui fluid dropdown selection multiple']")).click();
        
       driver.findElement(By.xpath("//div[@class='menu transition visible']//div[3]")).click();  
       
       driver.findElement(By.xpath("//div[@class='menu transition visible']//div[9]")).click();
       
       List<WebElement> li=driver.findElements(By.xpath("//div[@class='menu transition visible']/div"));
       System.out.println(li.size());
       for(int i=0;i<li.size();i++) {
    	   
    	  String s= li.get(i).getText();
    	 
    	  System.out.println(s);
    	  
    	  if(s.equals("HTML")) {
    		  li.get(i).click();
    		  //break;
    		  
    	  }
       }
	}

}
