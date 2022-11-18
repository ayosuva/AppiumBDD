package com.test.integrationapp.stepdef;

import com.test.integrationapp.Util.IOSDriverManager;
import com.test.integrationapp.Util.ReusableFunctions;
import com.test.integrationapp.pages.*;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import static org.junit.Assert.assertEquals;

public class IntegrationAppStepDef {

    IOSDriverManager context;
    HomePage homePage;
    AttributesPage attributesPage;
    String automationName="iOS";
    private Scenario scenario;
    public IntegrationAppStepDef(IOSDriverManager context){
        this.context = context;

    }

    @Given("I am on integration app")
    public void i_am_on_integration_app() {
        addScreenshot();
        homePage    = new HomePage(context);
        attributesPage =new AttributesPage(context);
    }
    @When("I click Attributes")
    public void i_click_attributes() {
        homePage.clickAttributesLink();
        addScreenshot();

    }

    @Then("I clear and enter Value as {string}")
    public void i_clear_and_enter_value_as(String value) {
        attributesPage.clearAndTypeValue(value);
    }

    @Then("I clear and enter Value1 as {string}")
    public void i_clear_and_enter_value1_as(String value) {
        attributesPage.clearAndTypeValue1(value);
    }

    @Then("I Click Second toggle button")
    public void i_click_second_toggle_button() {
        attributesPage.clickToggleSecond();
        addScreenshot();
    }

    @After
    public void closeDriver(){
        if(ReusableFunctions.readJsonData("defaultproperties","automationName").equals("iOS")) {

            if (this.scenario.isFailed()) {
                addScreenshot();
            }
            context.getDriver().quit();
        }
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
