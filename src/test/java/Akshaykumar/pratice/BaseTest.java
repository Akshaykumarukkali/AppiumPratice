package Akshaykumar.pratice;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;

public class BaseTest {
	public AndroidDriver driver;
	public AppiumDriverLocalService service;
	@BeforeClass
	public void ConfigureAppium() throws MalformedURLException
	{
		// service = new AppiumServiceBuilder().withAppiumJS(new File("C:\\Users\\TYSS\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js")).withIPAddress("127.0.0.1").usingPort(4723).build();
		//service.start();
		UiAutomator2Options options = new UiAutomator2Options();
		options.setDeviceName("AkshayPhone");
		options.setApp("C:/Users/TYSS/eclipse-workspace/pratice/src/test/java/Resource/ApiDemos-debug.apk");
		//options.setApp("C:\\Users\\TYSS\\eclipse-workspace\\abcd\\src\\main\\resources\\resource1\\build-1694070825686.apk");
		//options.setApp("C:\\Users\\TYSS\\eclipse-workspace\\pratice\\src\\test\\java\\Resource\\ApiDemos-debug.apk");
		driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
	}
	
	public void Longpressaction(WebElement ele)
	{
		((JavascriptExecutor)driver).executeScript("mobile: longClickGesture",
				ImmutableMap.of("elementId",((RemoteWebElement)ele).getId(), "duration",2000));
	}
	
	public void scrollToEnd() {
		boolean canScrollMore;
		do{
		 canScrollMore = (Boolean) ((JavascriptExecutor) driver).executeScript("mobile: scrollGesture", ImmutableMap.of(
			    "left", 500, "top", 500, "width", 600, "height", 600,
			    "direction", "down",
			    "percent", 3.0
			    ));
		 
			}while(canScrollMore);
	}
	
	public void swipeAction(WebElement ele, String direction) {

		((JavascriptExecutor) driver).executeScript("mobile: swipeGesture", ImmutableMap.of(
			   "elementId", ((RemoteWebElement)ele).getId(),
			    "direction", direction,
			    "percent", 0.75
			));
	

			
			
		}
	public void dragDropAction(RemoteWebElement source) throws InterruptedException {
		((JavascriptExecutor) driver).executeScript("mobile: dragGesture", ImmutableMap.of(
			    "elementId", ((RemoteWebElement) source).getId(),
			    "endX", 829,
			    "endY", 766
			));
		Thread.sleep(2000);
	}
	
	
	@AfterClass
	
	
	public void teardown()
	{
		driver.quit();
		//service.stop();
	}

}
