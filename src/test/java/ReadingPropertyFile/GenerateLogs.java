package ReadingPropertyFile;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GenerateLogs {

	public static void main(String[] args) {
		
		Logger log=Logger.getLogger(GenerateLogs.class);
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		log.info("Launching browser");
		
		driver.get("http://www.google.com");
		log.info("Google url has been launched");
		
		
		String title=driver.getTitle();
		System.out.println("Title value is:"+title);
		
		log.info("Title vale is:"+title);
		
		if(title.equals("Google")) {
			System.out.println("Correct title is Google");
			log.info("Correct title is Google and test is passed");
		}else {
			System.out.println("Correct title is Google");
			log.info("Correct title is Google and test is passed");
		}
		

	}

}
