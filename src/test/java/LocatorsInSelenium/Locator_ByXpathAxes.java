package LocatorsInSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator_ByXpathAxes {

	public static void main(String[] args) {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\pankaj.kumar\\workspace\\Seleniumsessions2022\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://money.rediff.com/gainers");
		driver.manage().window().maximize();

		// 1.identify the self node

		String selfnode = driver.findElement(By.xpath("//a[contains(text(),'RO Jewels')]/self::a")).getText();
		System.out.println(selfnode);

		// 2.Identifying parent node

		String parentnode = driver.findElement(By.xpath("//a[contains(text(),'RO Jewels')]/parent::td")).getText();
		System.out.println(parentnode);

		// 3.Identifying child node
		List<WebElement> childnode = driver
				.findElements(By.xpath("//a[contains(text(),'RO Jewels')]/ancestor::tr/child::td"));
		System.out.println(childnode.size());

		// 4.Identifying the ancestor node
		String ancestornode = driver.findElement(By.xpath("//a[contains(text(),'RO Jewels')]/ancestor::tr")).getText();
		System.out.println(ancestornode);

		// 5.Identifying Descendant node

		List<WebElement> descendantnodes = driver
				.findElements(By.xpath("//a[contains(text(),'RO Jewels')]/ancestor::tr/descendant::*"));
		System.out.println(descendantnodes.size());

		// 6.Identifying following nodes

		List<WebElement> followingnodes = driver
				.findElements(By.xpath("//a[contains(text(),'RO Jewels')]/ancestor::tr/following::tr"));
		System.out.println(followingnodes.size());

		// 7.Identifying following sibling nodes
		List<WebElement> following_sibling = driver
				.findElements(By.xpath("//a[contains(text(),'RO Jewels')]/ancestor::tr/following-sibling::tr"));
		System.out.println(following_sibling.size());

		// 8.Identifying preceding nodes
		List<WebElement> precedingnodes = driver
				.findElements(By.xpath("//a[contains(text(),'RO Jewels')]/ancestor::tr/preceding::tr"));
		System.out.println(precedingnodes.size());

		// 9.Identifying preceding sibling nodes
		List<WebElement> preceding_sibling = driver
				.findElements(By.xpath("//a[contains(text(),'RO Jewels')]/ancestor::tr/preceding-sibling::tr"));
		System.out.println(preceding_sibling.size());
		
		driver.quit();

	}

}
