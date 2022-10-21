package JavaScriptUtility;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JavaScriptUtil {

	public static void flash(WebDriver driver, WebElement element) {

		JavascriptExecutor js = ((JavascriptExecutor) driver);
		String bgcolor = element.getCssValue("backgroundColor");
		for (int i = 0; i < 30; i++) {
			changeColor("#00FF00", element, driver);
			changeColor("#0000FF", element, driver);
			changeColor("#FF0000", element, driver);
			changeColor(bgcolor, element, driver);

		}

	}

	public static void changeColor(String color, WebElement element, WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].style.backgroundColor ='" + color + "'", element);

	}

	public static void drawBorder(WebElement element, WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].style.border ='3px solid red'", element);

	}
	
	public static String getTitleByJS(WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		String title=js.executeScript("return document.title").toString();
		return title;
	}
	
	public static void clickByJS(WebElement element,WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].click();", element); 
		
	}
	
	public static void generateAlertByJS(WebDriver driver,String message) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("alert('" + message + " ')"); 
		
	}
	
	public static void refreshBrowserByJS(WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("history.go(0)" ); 
		
	}
	
	public static void scrollIntoViewByJS(WebElement element,WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].scrollIntoView(true);",element ); 
		
	}
	
	public static void scrollPageDownByJS(WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)"); 
		
	}
	
	public static void scrollByIndexJS(WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("window.scrollBy(0,200)");
		
	}
	

}