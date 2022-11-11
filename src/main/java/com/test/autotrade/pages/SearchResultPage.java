package com.test.autotrade.pages;
import com.test.autotrade.Util.DriverManager;
import org.openqa.selenium.By;

public class SearchResultPage extends PageBase {
    public SearchResultPage(DriverManager manager){
        super(manager);}

    By label_Count_text     = By.id("countText");

    public String getCountText() {
        return getWebElementVisible(label_Count_text).getText();
    }

}