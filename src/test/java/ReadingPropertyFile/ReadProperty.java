package ReadingPropertyFile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ReadProperty {
     static WebDriver driver;
   
	public static void main(String[] args) throws Exception {
	 Properties prop=new Properties();
	 FileInputStream fis=new FileInputStream("C:\\Users\\pankaj.kumar\\workspace\\Seleniumsessions2022\\config.properties");
	 prop.load(fis);
	 
	 System.out.println(prop.get("browser"));
	 
	 String browsername=prop.getProperty("browser");
	 
	 if(browsername.equals("chrome")){
		 
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\pankaj.kumar\\workspace\\Seleniumsessions2022\\Drivers\\chromedriver.exe" );
		 driver=new ChromeDriver();
		 
	 }else if(browsername.equals("Firefox")){
		 System.setProperty("webdriver.gecko.driver","C:\\Users\\pankaj.kumar\\workspace\\Seleniumsessions2022\\Drivers\\geckodriver.exe" );
		 driver=new FirefoxDriver();
	 } else {
		 System.out.println("Browser value is not given");
	 }
	 
	 
	 driver.get(prop.getProperty("url"));
	 driver.findElement(By.xpath(prop.getProperty("Xpath_username"))).sendKeys(prop.getProperty("username"));
	 driver.findElement(By.xpath(prop.getProperty("Xpath_password"))).sendKeys(prop.getProperty("password"));
	 driver.findElement(By.xpath(prop.getProperty("Xapth_loginbtn"))).click();
	 driver.close();

	}

}
