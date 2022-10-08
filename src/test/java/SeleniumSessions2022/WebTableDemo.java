package SeleniumSessions2022;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableDemo {

	public static void main(String[] args) {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","C:\\Users\\pankaj.kumar\\workspace\\Seleniumsessions2022\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);  //deprecated in Selenium 4
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		
		//driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS); deprecated in Selenium 4
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
		
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		/* //table[@id='customers']/tbody/tr[2]/td[1]
		 * //table[@id='customers']/tbody/tr[3]/td[1]
		 * //table[@id='customers']/tbody/tr[4]/td[1]
		 */
		String rowsxp1="//table[@id='customers']/tbody/tr[";
		String rowsxp2="]/td[1]";
		String rowxpath3="//table[@id='customers']/tbody/tr[";
		String rowxpath4="]/td[2]";
		for(int i=2;i<=7;i++) {
			
//			String xpath1=rowsxp1+i+rowsxp2;
//			
//			WebElement ele=driver.findElement(By.xpath(xpath1));
//			
//			System.out.println(ele.getText());
			
			String xpath2=rowxpath3+i+rowxpath4;
			WebElement ele1=driver.findElement(By.xpath(xpath2));
			System.out.println(ele1.getText());
			
		}
	}

}
