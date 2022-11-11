package com.test.autotrade.stepdef;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class Test {
    public static void main(String[] args) throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformVersion", "10");
        capabilities.setCapability("deviceName","emulator-5554");
        capabilities.setCapability("platformName","Android");
        capabilities.setCapability("appPackage", "uk.co.autotrader.androidconsumersearch");
        capabilities.setCapability("appActivity","uk.co.autotrader.androidconsumersearch.ui.activity.LauncherActivity"); // This is Launcher activity of your app (you can get it from apk info app)
        capabilities.setCapability("noReset","false");
        capabilities.setCapability("fullReset","false");

        AndroidDriver driver =new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        driver.findElement(By.id("getStartedButton")).click();
        driver.findElement(By.id("acceptComScoreButton")).click();
        driver.findElement(By.id("skipRegisterTextView")).click();
        driver.findElement(By.id("homeScreenSearchButton")).click();
        driver.findElement(By.xpath("//*[@text='ENTER POSTCODE']")).click();
        driver.findElement(By.xpath("//*[contains(@resource-id,'option_value') and contains (@text,'e.g. ')]")).sendKeys("GL11QX");
        driver.findElement(By.xpath("//*[@text='Only show new car deals']/..//android.widget.Switch")).click();
        driver.findElement(By.xpath("//android.widget.Button[contains(@text,'Search') and contains(@text,'cars')]")).click();
        System.out.println(driver.findElement(By.id("countText")).getText());

        driver.quit();
    }
}
