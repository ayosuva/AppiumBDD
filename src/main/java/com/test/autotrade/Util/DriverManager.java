package com.test.autotrade.Util;

import io.appium.java_client.android.AndroidDriver;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.FileReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class DriverManager {
    public AndroidDriver getDriver() {
        if (driver == null) {
            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability("platformVersion", "10");
            capabilities.setCapability("deviceName","emulator-5554");
            capabilities.setCapability("platformName","Android");
            capabilities.setCapability("appPackage", "uk.co.autotrader.androidconsumersearch");
            capabilities.setCapability("appActivity","uk.co.autotrader.androidconsumersearch.ui.activity.LauncherActivity"); // This is Launcher activity of your app (you can get it from apk info app)
            capabilities.setCapability("noReset","false");
            capabilities.setCapability("fullReset","false");

            try {
                driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
            } catch (MalformedURLException e) {
                throw new RuntimeException(e);
            }
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        }
        return driver;
    }

    private AndroidDriver driver;

    public String readJsonData(String node, String field) {
        Object obj = null;
        try {
            obj = new JSONParser().parse(new FileReader("./src/test/resources/data/config.json"));
        } catch (Exception e) {
            e.printStackTrace();
        }
        JSONObject jo = (JSONObject) obj;
        return (String) ((JSONObject) jo.get(node)).get(field);
    }
}
