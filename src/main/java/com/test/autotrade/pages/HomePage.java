package com.test.autotrade.pages;

import com.test.autotrade.Util.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class HomePage extends PageBase{

    public HomePage(DriverManager manager)
    {
        super(manager);
    }
    By btn_Search     = By.id("homeScreenSearchButton");

    public void clickSearchCarsButton()
    {
        getWebElementVisible(btn_Search).click();
    }
}
