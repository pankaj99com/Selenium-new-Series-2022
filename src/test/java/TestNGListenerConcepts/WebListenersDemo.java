package TestNGListenerConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.WebDriverEventListener;

public class WebListenersDemo extends Base implements WebDriverEventListener{

	public void beforeAlertAccept(WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	public void afterAlertAccept(WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	public void afterAlertDismiss(WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	public void beforeAlertDismiss(WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	public void beforeNavigateTo(String url, WebDriver driver) {
		System.out.println("Before Navigating url:"+url);
		
	}

	public void afterNavigateTo(String url, WebDriver driver) {
		System.out.println("After Navigating url:"+url);
		
	}

	public void beforeNavigateBack(WebDriver driver) {
		System.out.println("Before Navigated back");
		
	}

	public void afterNavigateBack(WebDriver driver) {
		System.out.println("After Navigated back");
		
	}

	public void beforeNavigateForward(WebDriver driver) {
		System.out.println("Before Navigating forward");
	}

	public void afterNavigateForward(WebDriver driver) {
		System.out.println("After Navigating forward");
		
	}

	public void beforeNavigateRefresh(WebDriver driver) {
		System.out.println("Before Refresh");
		
	}

	public void afterNavigateRefresh(WebDriver driver) {
		System.out.println("After Refresh");
		
	}

	public void beforeFindBy(By by, WebElement element, WebDriver driver) {
		System.out.println("Before findby:"+by+"---->"+element);
		
	}

	public void afterFindBy(By by, WebElement element, WebDriver driver) {
		System.out.println("After findby:"+by+"---->"+element);
		
	}

	public void beforeClickOn(WebElement element, WebDriver driver) {
		System.out.println("Before Clickon:---->"+element.toString());
		
	}

	public void afterClickOn(WebElement element, WebDriver driver) {
		System.out.println("After Clickon:---->"+element.toString());
		
	}

	public void beforeChangeValueOf(WebElement element, WebDriver driver, CharSequence[] keysToSend) {
		System.out.println("Before Changeof value:---->"+element+" --->"+keysToSend);
		
	}

	public void afterChangeValueOf(WebElement element, WebDriver driver, CharSequence[] keysToSend) {
		// TODO Auto-generated method stub
		
	}

	public void beforeScript(String script, WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	public void afterScript(String script, WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	public void beforeSwitchToWindow(String windowName, WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	public void afterSwitchToWindow(String windowName, WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	public void onException(Throwable throwable, WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	public <X> void beforeGetScreenshotAs(OutputType<X> target) {
		// TODO Auto-generated method stub
		
	}

	public <X> void afterGetScreenshotAs(OutputType<X> target, X screenshot) {
		// TODO Auto-generated method stub
		
	}

	public void beforeGetText(WebElement element, WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	public void afterGetText(WebElement element, WebDriver driver, String text) {
		// TODO Auto-generated method stub
		
	}
	

}
