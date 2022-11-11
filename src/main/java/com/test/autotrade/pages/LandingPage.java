package com.test.autotrade.pages;

import com.test.autotrade.Util.DriverManager;
import org.openqa.selenium.By;

import java.text.SimpleDateFormat;
import java.util.Date;

public class LandingPage extends PageBase {

    public LandingPage(DriverManager manager) {
        super(manager);
    }

    By btn_Get_Started       = By.id("getStartedButton");

    public void click_Get_started(){
        getWebElementVisible(btn_Get_Started).click();
    }


}
