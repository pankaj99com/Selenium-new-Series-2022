package TestNGConcepts;

import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import lib.ExcelDataConfig;

public class DataProviderConcept {

	WebDriver driver;

	@BeforeMethod

	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));

		driver.manage().deleteAllCookies();

		driver.manage().window().maximize();

		driver.get("https://classic.freecrm.com/login.cfm");

	}
	
	@Test(dataProvider = "login")
	public void loginTest(String name, String pwd, String res) throws IOException {

		WebElement email = driver.findElement(By.xpath("//input[@type='text']"));
		email.clear();
		email.sendKeys(name);

		WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
		password.clear();
		password.sendKeys(pwd);

		driver.findElement(By.xpath("//input[@type='submit']")).click();
		String validTitle = "CRMPRO";
		String actualTitle = driver.getTitle();

		if (res.equals("valid")) {
			
			
			
			if (validTitle.equals(actualTitle)) {
				driver.switchTo().frame("mainpanel");

				driver.findElement(By.linkText("Logout")).click();

				Assert.assertTrue(true);
				 ExcelDataConfig excelwrite=new  ExcelDataConfig("C:\\Users\\pankaj.kumar\\workspace\\Seleniumsessions2022\\ExcelData\\Countrydata.xlsx");
				 //excelwrite.setCellData("Sheet2", , colnum, data);
				int rows= excelwrite.getrowcount("Sheet2");
					for (int row = 1; row <= rows; row++) {
						
						excelwrite.setCellData("Sheet2",row,2, "pass");
						
							

						
					}
			}
					else {
				Assert.assertTrue(false);
				ExcelDataConfig excelwrite=new  ExcelDataConfig("C:\\Users\\pankaj.kumar\\workspace\\Seleniumsessions2022\\ExcelData\\Countrydata.xlsx");
				 //excelwrite.setCellData("Sheet2", , colnum, data);
				int rows= excelwrite.getrowcount("Sheet2");
				int cols=excelwrite.getCellCount("Sheet2", rows);
					for (int row = 1; row <= cols; row++) {
						
						excelwrite.setCellData("Sheet2",row,2, "fail");
					}
							

			}
		} else if (res.equals("invalid")) {
			
			
			if (validTitle.equals(actualTitle)) {

				driver.findElement(By.linkText("Logout")).click();

				Assert.assertTrue(false);

			} else {
				Assert.assertTrue(true);

			}
		}

	}
	
	
	
	
	
	
	@DataProvider(name = "login")
	public Object[][] getData() throws Exception {

		ExcelDataConfig excel = new ExcelDataConfig("C:\\Users\\pankaj.kumar\\workspace\\Seleniumsessions2022\\ExcelData\\Countrydata.xlsx");
		int rows = excel.getrowcount("Sheet2");
		int cols = excel.getCellCount("Sheet2", 1);
		String[][] data = new String[rows][cols];
		for (int i = 1; i <= rows; i++) {
			for (int j = 0; j < cols; j++) {
				data[i - 1][j] = excel.getCellData("Sheet2", i, j);

			}
		}

		return data;

	}

	@AfterMethod
	public void teardown() {
		driver.close();
	}

}
