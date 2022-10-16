package XpathAdvanceConcepts;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class XpathAxes {

	public static void main(String[] args) throws IOException {

//		ChromeOptions options = new ChromeOptions();
//		options.addArguments("Headless");

		WebDriver driver;
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\pankaj.kumar\\workspace\\Seleniumsessions2022\\Drivers\\chromedriver.exe");
		//driver = new ChromeDriver(options);
		driver = new ChromeDriver();
		driver.get("https://money.rediff.com/gainers");

		// 1-self --to identify your base location

		String self = driver.findElement(By.xpath("//a[normalize-space()='BSL Ltd']/self::a")).getText();

		System.out.println("Self location in the webtable:" + self);

		// 2-parent--to identify immediate parent

		String parent = driver.findElement(By.xpath("//a[normalize-space()='BSL Ltd']/parent::td")).getText();

		System.out.println("Parent location in the webtable:" + parent);

		// 3.Child--to identify the child elements

		List<WebElement> childs = driver
				.findElements(By.xpath("//a[normalize-space()='BSL Ltd']/ancestor::tr/child::td"));

		System.out.println("Total childs are:" + childs.size());
		for (int i = 0; i < childs.size(); i++) {

			String child_name = childs.get(i).getText();
			System.out.println(child_name);
		}

		// 4.ancestor--to identify the ancestor

		String ancestor = driver.findElement(By.xpath("//a[normalize-space()='BSL Ltd']/ancestor::tr")).getText();

		System.out.println("Ancestor is : " + ancestor);

		// descendant

		List<WebElement> descendants = driver
				.findElements(By.xpath("//a[normalize-space()='BSL Ltd']/ancestor::tr/descendant::*"));

		System.out.println(descendants.size());

		for (int i = 0; i < descendants.size(); i++) {

			String descendants_name = descendants.get(i).getText();
			System.out.println(descendants_name);
		}
		// following--->to see the below tr or td from the self node

		List<WebElement> following_node = driver
				.findElements(By.xpath("//a[normalize-space()='BSL Ltd']/ancestor::tr/following::tr"));

		System.out.println("Total following nodes:" + following_node.size());
		ScreenShots.ScreenShots.CaptureScreenShot("D://Pankaj-QA//ScriptsScreeshots//rediffmpney.png", driver);

		// following-sibling

		List<WebElement> following_sibling = driver
				.findElements(By.xpath("//a[normalize-space()='BSL Ltd']/ancestor::tr/following-sibling::tr"));
		System.out.println("Total no. of following sibling nodes:" + following_sibling.size());

		// preceding

		List<WebElement> preceding_nodes = driver
				.findElements(By.xpath("//a[normalize-space()='BSL Ltd']/ancestor::tr/preceding::tr"));

		System.out.println("Total no. of preceding nodes:" + preceding_nodes.size());

		for (int i = 0; i < preceding_nodes.size(); i++) {

			System.out.println(preceding_nodes.get(i).getText());
		}

		// preceding-sibling

		List<WebElement> precedingsib_nodes = driver
				.findElements(By.xpath("//a[normalize-space()='BSL Ltd']/ancestor::tr/preceding-sibling::tr"));
		
		System.out.println("total no. of preceding sibling_nodes:"+precedingsib_nodes.size());
		driver.findElement(By.xpath("//a[normalize-space()='BSL Ltd']")).click();
		System.out.println("Test completed!!");
	
		driver.close();
		driver.quit();

	}

}
