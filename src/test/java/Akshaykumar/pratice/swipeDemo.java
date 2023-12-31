package Akshaykumar.pratice;

import static org.testng.Assert.assertEquals;

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

@Test
public class swipeDemo extends BaseTest
{

	
	public void SwipeGesture() throws MalformedURLException, InterruptedException{
		driver.findElement(AppiumBy.accessibilityId("Views")).click();
		driver.findElement(AppiumBy.accessibilityId("Gallery")).click();
		driver.findElement(AppiumBy.accessibilityId("1. Photos")).click();
		WebElement fristImage=driver.findElement(By.xpath("(//android.widget.ImageView)[1]"));
	//(driver.findElement(By.xpath("//android.widget.Imageview[1]"));
		Assert.assertEquals(driver.findElement(By.xpath("(//android.widget.ImageView)[1]")).getAttribute("focusable"),"true");
		//swipeDemo swipeDemo =new swipeDemo();
		//swipeDemo.swipeAction(fristImage,"Left");
		swipeAction(fristImage,"Left");
		Assert.assertEquals(driver.findElement(By.xpath("//(android.widget.ImageView)[1]")).getAttribute("focusable"),"false");

		
	}
}
