package com.test.autotrade.pages;
import com.test.autotrade.Util.DriverManager;
import org.openqa.selenium.By;

public class CookiePage extends PageBase {
    public CookiePage(DriverManager manager){
        super(manager);}

    By btn_accept_Cookies     = By.id("acceptComScoreButton");

    public void clickAcceptCookies() {
        getWebElementVisible(btn_accept_Cookies).click();
    }

}