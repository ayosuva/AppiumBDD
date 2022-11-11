package com.test.autotrade.pages;

import com.test.autotrade.Util.DriverManager;
import org.openqa.selenium.By;


public class RegisterPage extends PageBase {

    public RegisterPage(DriverManager manager) {
        super(manager);
    }

        By btn_Skip              = By.id("skipRegisterTextView");

        public void click_Skip() {

        getWebElementVisible(btn_Skip).click();

    }


}

