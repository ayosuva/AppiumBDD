package com.test.integrationapp.pages;

import com.test.integrationapp.Util.IOSDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AttributesPage extends PageBase {

    public AttributesPage(IOSDriverManager manager) {
        super(manager);
    }

    By input_Value       = By.xpath("//XCUIElementTypeTextField[@value='Value']");
    By input_Value2      = By.xpath("//XCUIElementTypeTextField[@value='Value2']");
    By toggle_Second     = By.xpath("//XCUIElementTypeButton[@name='Second']");

    public void clearAndTypeValue(String value){
        WebElement Value= getWebElementVisible(input_Value);
        Value.clear();
        Value.sendKeys(value);
        //getWebElementVisible(input_Value).sendKeys(value);
    }
    public void clearAndTypeValue1(String value){
        WebElement Value= getWebElementVisible(input_Value2);
        Value.clear();
        Value.sendKeys(value);
        //getWebElementVisible(input_Value2).sendKeys(value);
    }
    public void clickToggleSecond(){
        getWebElementVisible(toggle_Second).click();
    }



}
