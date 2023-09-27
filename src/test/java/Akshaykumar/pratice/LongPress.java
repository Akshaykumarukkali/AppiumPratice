package Akshaykumar.pratice;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
//import io.appium.java_client.android.AndroidDriver;
//import io.appium.java_client.android.options.UiAutomator2Options;
//import io.appium.java_client.service.local.AppiumDriverLocalService;
//import io.appium.java_client.service.local.AppiumServiceBuilder;


public class LongPress extends BaseTest
{
	@Test
	//public void OnbillInstall() throws InterruptedException {
		
		/*driver.findElement(AppiumBy.accessibilityId("Views")).click();
		driver.findElement(By.xpath("//android.widget.EditText[@index='3']")).sendKeys("Tyss");

		driver.findElement(By.xpath("//android.widget.EditText[@index='5']")).sendKeys("Onebill@2023");
		System.out.println("Entered valid credentials");
		Thread.sleep(5000);*/
	
	public void LongpressGesture() throws MalformedURLException, InterruptedException{
		driver.findElement(AppiumBy.accessibilityId("Views")).click();
		driver.findElement(AppiumBy.accessibilityId("Expandable Lists")).click();
		driver.findElement(AppiumBy.accessibilityId("1. Custom Adapter")).click();
		WebElement ele= driver.findElement(By.xpath("//android.widget.TextView[@text='People Names']"));
		Longpressaction(ele);
		//((JavascriptExecutor)driver).executeScript("mobile: longClickGesture",
				//ImmutableMap.of("elementId",((RemoteWebElement)ele).getId(), "duration",2000));
		//((JavascriptExecutor)driver).executeScript("mobile :longClickGesture", ImmutableMap.of("elementId", ((RemoteWebElement)ele).getId(), "duration",2000));
		Thread.sleep(2000);
		String menuText= driver.findElement(By.id("android:id/title")).getText();
		Assert.assertEquals(menuText, "Sample menu");
		Assert.assertTrue(driver.findElement(By.id("android:id/title")).isDisplayed());
	}

		
	}
