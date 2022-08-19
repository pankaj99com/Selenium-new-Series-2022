package LocatorsInSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator_XpathOptions {

	public static void main(String[] args) {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\pankaj.kumar\\workspace\\Seleniumsessions2022\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		// <input class="search_query form-control ac_input" type="text"
		// id="search_query_top" name="search_query"
		// placeholder="Search" value="" autocomplete="off"
		// data-ol-has-click-handler="">

		// 1.Xpath options ------->OR
		driver.findElement(By.xpath("//input[@id='search_query_top' or @name='search_query']")).sendKeys("Dress");

		driver.findElement(By.xpath("//input[@id='search_query_top' or @name='search_query']")).clear();

		// 2.Xpath options ------->AND
		driver.findElement(By.xpath("//input[@id='search_query_top' and @name='search_query']")).sendKeys("JEANS");
		driver.findElement(By.xpath("//input[@id='search_query_top' and @name='search_query']")).clear();

		// 3.Xpath options----->contains()
		// tagname[contains(@attribute,'value')]
		driver.findElement(By.xpath("//input[contains(@id,'search_query_top')]")).sendKeys("top");

		// 4.Xpath options---->starts-with()
		/*
		 * <button type="submit" name="submit_search"
		 * class="btn btn-default button-search"> <span>Search</span> </button>
		 */

		driver.findElement(By.xpath("//button[starts-with(@name,'submit')]")).click();
		
		//5.Xpath options----->text()
		
		/*<a href="http://automationpractice.com/index.php?id_category=3&amp;controller=category" 
		 * title="Women" class="sf-with-ul">Women</a>*/
		
		driver.findElement(By.xpath("//a[text()='Women']")).click();
		
		//6.chained xpath
		/* <form id="searchbox" method="get" action="http://automationpractice.com/index.php?controller=search">
		<input type="hidden" name="controller" value="search">
		<input type="hidden" name="orderby" value="position">
		<input type="hidden" name="orderway" value="desc">
		<input class="search_query form-control ac_input" type="text" id="search_query_top" name="search_query" placeholder="Search" value="top" autocomplete="off" data-ol-has-click-handler="">
		<button type="submit" name="submit_search" class="btn btn-default button-search">
			<span>Search</span>
		</button>
	</form>*/
		
		driver.findElement(By.xpath("//form[@id='searchbox']//input[4]")).sendKeys("raincoat");
		
		driver.findElement(By.xpath("//form[@id='searchbox']//button[@type='submit']")).click();

	}

}
