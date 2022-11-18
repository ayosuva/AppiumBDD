package com.test.autotrade.stepdef;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class Test {
    public static void main(String[] args) throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName","iOS");
        capabilities.setCapability("appium:platformVersion", "15.5");
        capabilities.setCapability("appium:deviceName","iPhone 13 Pro Max");
        capabilities.setCapability("appium:bundleId", "com.yosuva.IntegrationApp");
        capabilities.setCapability("appium:noReset","false");
        capabilities.setCapability("appium:fullReset","false");
        capabilities.setCapability("appium:automationName","XCUITest");
        capabilities.setCapability("appium:udid","00008110-001969603629801E");
        capabilities.setCapability("appium:includeSafariInWebviews","true");
        capabilities.setCapability("appium:newCommandTimeout","3600");
        capabilities.setCapability("appium:connectHardwareKeyboard","true");



        IOSDriver driver =new IOSDriver(new URL("http://0.0.0.0:4723"), capabilities);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        driver.findElement(By.xpath("//XCUIElementTypeStaticText[@name='Attributes']")).click();
        WebElement value_field=driver.findElement(By.xpath("//XCUIElementTypeTextField[@value='Value']"));
        value_field.clear();
        value_field.sendKeys("Yosuva");
        WebElement value2_field=driver.findElement(By.xpath("//XCUIElementTypeTextField[@value='Value2']"));
        value2_field.clear();
        value2_field.sendKeys("Arulanthu");
        driver.findElement(By.xpath("//XCUIElementTypeButton[@name='Second']")).click();

        driver.quit();
    }
}
