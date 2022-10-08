package Excel;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import lib.ExcelDataConfig;

public class WebtableDataToExcelFile {

	public static void main(String[] args) throws Exception {
    WebDriverManager.chromedriver().setup();
    WebDriver driver=new ChromeDriver();
    driver.get("https://en.wikipedia.org/wiki/List_of_countries_and_dependencies_by_population");
    String path=".\\ExcelData\\Polulation4.xlsx";
    ExcelDataConfig excel=new ExcelDataConfig(path);
    
    //PRINTING HEADERS
    excel.setCellData("Sheet1", 0, 0, "COUNTRY");
    excel.setCellData("Sheet1", 0, 1, "CONTINENT");
    excel.setCellData("Sheet1", 0, 2, "POPULATION");
    excel.setCellData("Sheet1", 0, 3, "PERCENTAGE OF THE WORLD");
    excel.setCellData("Sheet1", 0, 4, "DATE");
    excel.setCellData("Sheet1", 0, 5, "SOURCE");
    excel.setCellData("Sheet1", 0, 6, "NOTES");
    
    
   WebElement table= driver.findElement(By.xpath("//table[@class='wikitable sortable jquery-tablesorter']/tbody"));
   
   int rows=table.findElements(By.xpath("tr")).size();//rows
   
   System.out.println(rows);
   
  for(int r=1;r<=rows;r++) {
   String country =driver.findElement(By.xpath("//table[@class='wikitable sortable jquery-tablesorter']/tbody/tr["+r+"]/td[1]")).getText();
   String continent =driver.findElement(By.xpath("//table[@class='wikitable sortable jquery-tablesorter']/tbody/tr["+r+"]/td[2]")).getText();
   String population =driver.findElement(By.xpath("//table[@class='wikitable sortable jquery-tablesorter']/tbody/tr["+r+"]/td[3]")).getText();
//   String percentage =driver.findElement(By.xpath("//table[@class='wikitable sortable jquery-tablesorter']/tbody/tr["+r+"]/td[4]")).getText();
//   String date =driver.findElement(By.xpath("//table[@class='wikitable sortable jquery-tablesorter']/tbody/tr["+r+"]/td[5]")).getText();
//   String source =driver.findElement(By.xpath("//table[@class='wikitable sortable jquery-tablesorter']/tbody/tr["+r+"]/td[6]")).getText();
//   String notes =driver.findElement(By.xpath("//table[@class='wikitable sortable jquery-tablesorter']/tbody/tr["+r+"]/td[7]")).getText();
//  
//	  String country= table.findElement(By.xpath("tr[1]/td[1])")).getText();
//	  String continent= table.findElement(By.xpath("tr["+r+"]/td[2])")).getText();
//	  String population= table.findElement(By.xpath("tr["+r+"]/td[3])")).getText();
//	  String percentage= table.findElement(By.xpath("tr["+r+"]/td[4])")).getText();
//	  String date= table.findElement(By.xpath("tr["+r+"]/td[5])")).getText();
//	  String source= table.findElement(By.xpath("tr["+r+"]/td[6])")).getText();
//	  String notes= table.findElement(By.xpath("tr["+r+"]/td[7])")).getText();
	  
	  System.out.println(country);
	  
	  excel.setCellData("Sheet1",r,0, country);
	  excel.setCellData("Sheet1",r,1, continent);
	  excel.setCellData("Sheet1",r,2, population);
//	  excel.setCellData("Sheet1",r,3, percentage);
//	  excel.setCellData("Sheet1",r,4, date);
//	  excel.setCellData("Sheet1",r,5, source);
//	  excel.setCellData("Sheet1",r,6, notes);
	  
	
	 // driver.close();
  }
  System.out.println("Data capture completed!!");

	}

}
