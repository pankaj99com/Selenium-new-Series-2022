package XpathsLearning;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorDemo1 {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		
//		WebDriver driver;
//		System.setProperty("webdriver.chrome.driver",
//				"C:\\Users\\pankaj.kumar\\workspace\\Seleniumsessions2022\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.automationexercise.com/products");

		/*
		 * <input type="text" name="search" id="search_product" value=""
		 * placeholder="Search Product" class="form-control input-lg">
		 */
		// 1.Xpath---->or

		driver.findElement(By.xpath("//input[@id='search_prod' or @name='search1' or @placeholder='Search Product']"))
				.sendKeys("Jackets");
		driver.findElement(By.xpath("//input[@id='search_prod' or @name='search1' or @placeholder='Search Product']"))
				.clear();

		// 2.Xpath---->and

		driver.findElement(
				By.xpath("//input[@id='search_product' and @name='search' and @placeholder='Search Product']"))
				.sendKeys("Sweater");
		driver.findElement(
				By.xpath("//input[@id='search_product' and @name='search' and @placeholder='Search Product']")).clear();

		// 3. xpath options--->contains()
		// tagname[contains(@attribute,'value')]

		driver.findElement(By.xpath("//input[contains(@id,'search_product')]")).sendKeys("Skirts");
		driver.findElement(By.xpath("//input[contains(@id,'search_product')]")).clear();
		driver.findElement(By.xpath("//input[contains(@name,'search')]")).sendKeys("Shirts");

		// 4.xpath options--->starts-with()
		// tagname[starts-with(@attribute,'value')]
		/*
		 * <button type="button" id="submit_search"
		 * class="btn btn-default btn-lg" data-ol-has-click-handler=""><i
		 * class="fa fa-search"></i></button>
		 */

		driver.findElement(By.xpath("//button[starts-with(@id,'sub')]")).click();

		// 5.xpath--text()

		// tagname[text()='textname']

		driver.findElement(By.xpath("//a[text()=' Products']")).click();

		// 6.normalized-space()==whenever there is extra spaces available in the
		// html elements then we should go for normalized-space which actually
		// innore the extra spaces

		// tagname[normalize-space()='textname']

		driver.findElement(By.xpath("//a[normalize-space()='Women']")).click();

		// 7.Chained xpath

		WebElement leftsideMenu = driver.findElement(By.xpath("//div[@class='left-sidebar']"));

		List<WebElement> mylist = leftsideMenu.findElements(By.tagName("a"));
		System.out.println(mylist.size());

		for (int i = 0; i < mylist.size(); i++) {

			System.out.println(mylist.get(i).getAttribute("href"));
		}

		// driver.navigate().to("https://www.automationexercise.com/contact_us");
		// driver.get("https://www.automationexercise.com/contact_us");
		// Thread.sleep(2000);
		// WebElement
		// form=driver.findElement(By.xpath("//form[@id='contact-us-form']"));
		// List<WebElement> inputtags=form.findElements(By.tagName("div"));
		// for(int i=0;i<inputtags.size();i++) {
		// System.out.println(inputtags.get(i).getAttribute("class"));
		// }

	}

}
