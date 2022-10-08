package TestNGConcepts;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import SeleniumUtility.XLUtility;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProvidersInTestNGwithExcel {

	WebDriver driver;

	@BeforeMethod
	public void setup() {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("https://classic.freecrm.com/index.html?e=1");

	}
	
	@Test(dataProvider="login",retryAnalyzer=RetryAnalyzerDemo.RetryAnalyzer.class)
	
	public void loginTest(String un,String pwd,String mode) {
		WebElement email=driver.findElement(By.xpath("//input[@name='username']"));
		email.clear();
		email.sendKeys(un);
		
		WebElement password=driver.findElement(By.xpath("//input[@name='password']"));
		password.clear();
		password.sendKeys(pwd);
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		String validTitle="CRMPRO";
		
		String actualTitle=driver.getTitle();
		String loginpageTitle="Free CRM  - CRM software for customer relationship management, sales, and support.";
		
		if(mode.equals("Valid")) {
			if(validTitle.equals(actualTitle)) {
				driver.switchTo().frame("mainpanel");
				driver.findElement(By.linkText("Logout")).click();
				Assert.assertTrue(true);//pass
				
			}else {
				Assert.assertTrue(false);//fail
			}
		}else if(mode.equals("Invalid")) {
			System.out.println(driver.getTitle());
			if(validTitle.equals(actualTitle)) {
				driver.switchTo().frame("mainpanel");
				driver.findElement(By.linkText("Logout")).click();
				Assert.assertTrue(false);
				
				
			}else {
				Assert.assertTrue(true);
			}
		}
		
		
		
	}
	
	
	
	@DataProvider(name="login")
	public Object[][] getdata() throws Exception{
		
//		String data[][]= {
//				          {"pankaj99","Admin@12345","Invalid"},
//				          {"Vishwa","Test@123","Invalid"},
//				          {"Pran","Admin@1","Invalid"},
//				          {"pankaj99","Admin@12345","Valid"}
//				    };
		XLUtility excel= new XLUtility("C:\\Users\\pankaj.kumar\\workspace\\Seleniumsessions2022\\ExcelData\\Countrydata.xlsx");
		
		int rows=excel.getRowCount("Sheet2");
		
		int cols=excel.getCellCount("Sheet2", 1);
		
		String data[][]=new String[rows][cols];//create an empty array
		
		for(int i=1;i<=rows;i++) {
			
			for(int j=0;j<cols;j++) {
				
				data[i-1][j]=excel.getCellData("Sheet2", i, j);
			}
		}
		
		
		
		
		
		return data;
	}

	@AfterMethod

	public void teardown() {
		driver.close();
	}

}
