package Akshaykumar.pratice;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
//import io.appium.java_client.android.AndroidDriver;
//import io.appium.java_client.android.options.UiAutomator2Options;
//import io.appium.java_client.service.local.AppiumDriverLocalService;
//import io.appium.java_client.service.local.AppiumServiceBuilder;


public class NewBasic extends BaseTest
{
	@Test
	public void AppiumTest2() throws MalformedURLException, InterruptedException {
		
		//AppiumDriverLocalService service = new AppiumServiceBuilder().withAppiumJS(new File("C:\\Users\\TYSS\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js")).withIPAddress("127.0.0.1").usingPort(4723).build();
		//service.start();
		//UiAutomator2Options options = new UiAutomator2Options();
		//options.setDeviceName("AkshayPhone");
		//options.setApp("C:/Users/TYSS/eclipse-workspace/pratice/src/test/java/Resource/ApiDemos-debug.apk");
		//AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), options);
		driver.findElement(AppiumBy.accessibilityId("Preference")).click();
		driver.findElement(By.xpath( "//android.widget.TextView[@content-desc='3. Preference dependencies']")).click();
		driver.findElement(By.id("android:id/checkbox")).click();
		driver.findElement(By.xpath("(//android.widget.RelativeLayout)[2]")).click();
		String alertTitle=driver.findElement(By.id("android:id/alertTitle")).getText();
		Assert.assertEquals(alertTitle, "WiFi settings");
		driver.findElement(By.id("android:id/edit")).sendKeys("Ganapati");
		driver.findElements(AppiumBy.className("android.widget.Button")).get(1).click();
		Thread.sleep(3000);
	}
}