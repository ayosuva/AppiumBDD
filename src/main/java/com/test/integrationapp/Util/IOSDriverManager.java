package com.test.integrationapp.Util;

import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.FileReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class IOSDriverManager {
    public IOSDriver getDriver() {
        if (driver == null) {
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

            try {
                driver = new IOSDriver(new URL("http://0.0.0.0:4723"), capabilities);
            } catch (MalformedURLException e) {
                throw new RuntimeException(e);
            }
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        }
        return driver;
    }

    private IOSDriver driver;
}
