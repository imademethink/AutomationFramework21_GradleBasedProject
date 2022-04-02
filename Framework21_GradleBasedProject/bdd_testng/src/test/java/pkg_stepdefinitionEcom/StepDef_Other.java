package pkg_stepdefinitionEcom;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import pkg_global.GlobalObjects;
import pkg_pageobject.*;

public class StepDef_Other extends GlobalObjects {

    private static final Logger myLog = Logger.getLogger(StepDef_Other.class);

    @When("^Navigate to forget password section$")
    public void Navigate_to_forget_password_section(){
        myLog.info("Log: Navigating to forget password section " + hmGlobalData.get("url_forget_password") + "\n");
        realDriver.get(hmGlobalData.get("url_forget_password"));
        utilGeneral.ImplicitWait(8000);

        pgOtherForgetPwd = new Page_VarietyForgetPwd(realDriver);
        pgOtherForgetPwd.PerformForgetPassword();
    }

    @Then("^Forget password activity should be successful$")
    public void Forget_password_activity_should_be_successful(){
        pgOtherForgetPwd.ValidateForgetPassword();
    }



    @When("^Navigate to pop up section$")
    public void Navigate_to_pop_up_section(){
        myLog.info("Log: Navigating to forget password section " + hmGlobalData.get("url_popup") + "\n");
        realDriver.get(hmGlobalData.get("url_popup"));
        utilGeneral.ImplicitWait(8000);

        pgOtherPopup = new Page_VarietyPopup(realDriver);
        pgOtherPopup.PerformPopupTest();
    }

    @Then("^Pop up activity should be successful$")
    public void Pop_up_activity_should_be_successful(){
        pgOtherPopup.ValidatePopup();
    }


    @When("^Navigate to window handling section$")
    public void Navigate_to_window_handling_section(){
        myLog.info("Log: Navigating to window handling section " + hmGlobalData.get("url_multi_window") + "\n");
        realDriver.get(hmGlobalData.get("url_multi_window"));
        utilGeneral.ImplicitWait(8000);

        pgOtherMultiwindow = new Page_VarietyMultiwindow(realDriver);
        pgOtherMultiwindow.PerformWindowHandling();
    }

    @Then("^Window handling activity should be successful$")
    public void Window_handling_activity_should_be_successful(){
        pgOtherMultiwindow.ValidateMultiWindow();
    }



    @When("^Navigate to iframe handling section$")
    public void Navigate_to_iframe_handling_section(){
        myLog.info("Log: Navigating to iframe handling section " + hmGlobalData.get("url_iframe") + "\n");
        realDriver.get(hmGlobalData.get("url_iframe"));
        utilGeneral.ImplicitWait(8000);

        pgOtherIframe = new Page_VarietyIframe(realDriver);
        pgOtherIframe.PerformIframeHandling();
    }

    @Then("^Iframe handling activity should be successful$")
    public void Iframe_handling_activity_should_be_successful(){
        pgOtherIframe.ValidateIframe();
    }






    @When("^Navigate to javascript pop up handling section$")
    public void Navigate_to_javascript_pop_up_handling_section(){
        myLog.info("Log: Navigating to javascript pop up handling section " + hmGlobalData.get("url_javascript_popup") + "\n");
        realDriver.get(hmGlobalData.get("url_javascript_popup"));
        utilGeneral.ImplicitWait(8000);

        pgOther = new Page_VarietyRobot(realDriver);
        pgOther.InvokeJavascriptPop();
    }

    @Then("^Javascript pop up handling activity should be successful$")
    public void Javascript_pop_up_handling_activity_should_be_successful(){
        pgOther.HandleJavascriptpopupUsingRobot();
    }

    @When("^Navigate to google ads handling section$")
    public void Navigate_to_google_ads_handling_section(){
        myLog.info("Log: Navigating to javascript pop up handling section " + hmGlobalData.get("url_google_ad") + "\n");
        realDriver.get(hmGlobalData.get("url_google_ad"));
        utilGeneral.ImplicitWait(8000);

        pgOther = new Page_VarietyRobot(realDriver);
        pgOther.HandleGoogleAds();
    }

    @Then("^Googls ads handling activity should be successful$")
    public void Googls_ads_handling_activity_should_be_successful(){
        pgOther.GoogleAdsshouldbeClosed();
    }

    @When("^Navigate to dropdown handling section$")
    public void Navigate_to_dropdown_handling_section(){
        myLog.info("Log: Navigating to dropdown handling section " + hmGlobalData.get("url_dropdown_handling") + "\n");
        realDriver.get(hmGlobalData.get("url_dropdown_handling"));
        utilGeneral.ImplicitWait(8000);

        pgDropdown = new Page_VarietyDropdown(realDriver);
        pgDropdown.ChooseDropdownCountry("Cuba");
        utilGeneral.Sleep(2000);
    }

    @Then("^Dropdown handling activity should be successful$")
    public void Dropdown_handling_activity_should_be_successful(){
        //
    }

    @When("^Navigate to actions handling section$")
    public void Navigate_to_actions_handling_section(){
        myLog.info("Log: Navigating to dropdown handling section " + hmGlobalData.get("url_dropdown_handling") + "\n");
        realDriver.get(hmGlobalData.get("url_dropdown_handling"));
        utilGeneral.ImplicitWait(8000);

        pgDropdown = new Page_VarietyDropdown(realDriver);
        pgDropdown.PerformMouseHovering();
    }

    @Then("^Actions handling activity should be successful$")
    public void Actions_handling_activity_should_be_successful(){
        //
    }


    @When("^Perform scrolling$")
    public void Perform_scrolling$(){
        myLog.info("Log: Navigating to other section \n");
        realDriver.get("http://the-internet.herokuapp.com/infinite_scroll");
        utilGeneral.ImplicitWait(8000);
        utilGeneral.ScrollUsingJavaScript("300");
        utilGeneral.Sleep(1500);
        utilGeneral.ScrollUsingJavaScript("300");
        utilGeneral.Sleep(1500);
        utilGeneral.ScrollUsingJavaScript("300");
        utilGeneral.Sleep(1500);
        utilGeneral.ScrollUsingJavaScriptBottom();
        utilGeneral.Sleep(1500);
    }

    @Then("^Perform click using Javascript$")
    public void Perform_click_using_Javascript$(){
        utilGeneral.ClickUsingJavaScriptBottom(
                realDriver.findElement(By.cssSelector("img[alt='Fork me on GitHub']"))
        );
        utilGeneral.Sleep(1000);
    }







}
