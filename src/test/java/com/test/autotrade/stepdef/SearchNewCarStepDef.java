package com.test.autotrade.stepdef;

import com.test.autotrade.Util.DriverManager;
import com.test.autotrade.pages.*;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import static org.junit.Assert.assertEquals;

public class SearchNewCarStepDef {

    DriverManager context;
    LandingPage landingPage;
    CarSearchPage carSearchPage;
    CookiePage cookiePage;
    RegisterPage registerPage;
    HomePage homePage;
    SearchResultPage searchResultPage;
    String arrival_date;
    private Scenario scenario;
    public SearchNewCarStepDef(DriverManager context){
        this.context = context;

    }

    @Given("I am on Auto Trader App")
    public void i_am_on_auto_trader_app() {
        addScreenshot();
        landingPage = new LandingPage(context);
        cookiePage  = new CookiePage(context);
        registerPage= new RegisterPage(context);
        homePage    = new HomePage(context);
        carSearchPage = new CarSearchPage(context);
        searchResultPage =new SearchResultPage(context);
    }
    @When("I click Get Started button")
    public void i_click_get_started_button() {
        landingPage.click_Get_started();
        addScreenshot();

    }
    @When("I Click Accept button")
    public void i_click_accept_button() {
        cookiePage.clickAcceptCookies();
        addScreenshot();

    }
    @When("I Click Skip button")
    public void i_click_skip_button() {
        registerPage.click_Skip();
        addScreenshot();

    }
    @When("I Click Search button")
    public void i_click_search_button() {
        homePage.clickSearchCarsButton();
    }
    @Then("I enter post code as {string}")
    public void i_enter_post_code_as(String postcode) {
        carSearchPage.enterPostCode(postcode);
    }
    @Then("I click switch  Only show new car deals")
    public void i_click_switch_only_show_new_car_deals() {
        carSearchPage.clickSwitchOnly_show_new_car_deals();
        addScreenshot();
    }
    @Then("I Click Search button shown at the bottom")
    public void i_click_search_button_shown_at_the_bottom() {
        carSearchPage.clickSearch();
    }
    @Then("I Validate search result msg")
    public void i_validate_search_result_msg() {
        assertEquals("cars found",searchResultPage.getCountText());
        addScreenshot();

    }

    @After
    public void closeDriver(){
        if(this.scenario.isFailed())
        {
            addScreenshot();
        }
        context.getDriver().quit();
    }
    @Before
    public void setUpScenario(Scenario scenario){
    this.scenario = scenario; 
    }
    
    public void addScreenshot(){
        TakesScreenshot ts = (TakesScreenshot) context.getDriver();
		byte[] screenshot = ts.getScreenshotAs(OutputType.BYTES);
        scenario.attach(screenshot, "image/png", "");
    }
    
}
