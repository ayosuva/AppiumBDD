package com.test.integrationapp.pages;

import com.test.integrationapp.Util.IOSDriverManager;
import org.openqa.selenium.By;

public class HomePage extends PageBase {

    public HomePage(IOSDriverManager manager)
    {
        super(manager);
    }
    By link_Attributes     = By.xpath("//XCUIElementTypeStaticText[@name='Attributes']");

    public void clickAttributesLink()
    {
        getWebElementVisible(link_Attributes).click();
    }
}
