package com.test.autotrade.pages;

import com.test.autotrade.Util.DriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.*;

public class CarSearchPage extends PageBase {

    public CarSearchPage(DriverManager manager) {
        super(manager);
    }

    By label_Enter_PostCode            = By.xpath("//*[@text='ENTER POSTCODE']");
    By input_PostCode = By.xpath("//*[contains(@resource-id,'option_value') and contains (@text,'e.g. ')]");
    By radio_Only_show_new_car_deals=By.xpath("//*[@text='Only show new car deals']/..//android.widget.Switch");
    By button_Search= By.xpath("//android.widget.Button[contains(@text,'Search') and contains(@text,'cars')]");
    public void enterPostCode(String postcode){
        getWebElementVisible(label_Enter_PostCode).click();
        getWebElementVisible(input_PostCode).sendKeys(postcode);
    }
    public void clickSwitchOnly_show_new_car_deals(){
        getWebElementVisible(radio_Only_show_new_car_deals).click();
    }

    public void clickSearch(){
        getWebElementVisible(button_Search).click();
    }




}
