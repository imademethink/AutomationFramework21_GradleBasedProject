package pkg_stepdefinitionEcom;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.apache.log4j.Logger;
import org.junit.Assert;
import pkg_global.GlobalObjects;

public class StepDef_Ecom extends GlobalObjects {

    private static final Logger myLog = Logger.getLogger(StepDef_Ecom.class);

    @When("^Ecom user login with Username \"(.*?)\" and Password \"(.*?)\"$")
    public void User_attempts_to_login_with_Username_and_Password(String sUser, String sPwd){

        myLog.info("Log: Navigating to login section " + hmGlobalData.get("sUrlHome") + "\n");
        realDriver.get(hmGlobalData.get("sUrlHome"));
        utilGeneral.ImplicitWait(8000);

        pgHome.PerformLogin(sUser, sPwd);

//        LocalDriver = new GlobalObjects().getDriver();
//        LocalDriver.get(sUrlLogin);
//        LocalDriver.manage().timeouts().implicitlyWait(8000, TimeUnit.MILLISECONDS);
//        myLog.info("Log: Attempting to login");
//        LocalDriver.findElement(By.id("email")).sendKeys(sUser);
//        LocalDriver.findElement(By.id("passwd")).sendKeys(sPwd);
//        LocalDriver.findElement(By.cssSelector("i[class='icon-lock left']")).click();
//        LocalDriver.manage().timeouts().implicitlyWait(8000, TimeUnit.MILLISECONDS);
    }

    @When("^Ecom user login should be successful$")
    public void Ecom_user_login_should_be_successful(){
        pgHome.ValidateLogin(true);
    }

    @Then("^Ecom user login should NOT be successful$")
    public void Ecom_user_login_should_NOT_be_successful(){
        pgHome.ValidateLogin(false);
    }



    @When("^Ecom user registration with following data$")
    public void Ecom_user_registration_with_following_data(){
        //new Utility_General().InitAllPageObject();

        myLog.info("Log: Navigating to registration section " + hmGlobalData.get("sUrlRegister") + "\n");
        realDriver.get(hmGlobalData.get("sUrlRegister"));
        utilGeneral.ImplicitWait(8000);

        // User data from Excel will be used
        pgRegister.RegistrationStart();
        pgRegister.RegistrationFormFill();
    }

    @When("^Ecom user registration should be successful$")
    public void Ecom_user_registration_should_be_successful(){
        pgRegister.ValidateRegistration();
    }




    @When("^Ecom user attempts to search for \"(.*?)\" item$")
    public void Ecom_user_attempts_to_search_for_item(String sSearchType){
        //new Utility_General().InitAllPageObject();

        myLog.info("Log: Navigating to home " + hmGlobalData.get("sUrlHome") + "\n");
        realDriver.get(hmGlobalData.get("sUrlHome"));
        utilGeneral.ImplicitWait(8000);

        pgSearch.PerformSearch(sSearchType);
    }

    @Then("^Successful Ecom search results should be shown$")
    public void Successful_Ecom_search_results_should_be_shown(){
        pgSearch.ValidateSearchResult(true);
    }

    @Then("^Successful Ecom search results should NOT be shown$")
    public void Successful_Ecom_search_results_should_NOT_be_shown(){
        pgSearch.ValidateSearchResult(false);
    }



    @And("^Ecom user adds item to cart and proceeds to checkout$")
    public void Ecom_user_adds_item_to_cart_and_proceeds_to_checkout(){
        pgSearch.AddItemToCart();
    }

    @Then("^Selected items should be available in basket$")
    public void Selected_items_should_be_available_in_basket(){
        pgCheckout.ValidateCheckoutResult();
    }




    @When("^dummy step2$")
    public void dummy_step2(){
        myLog.info("Log: Dummy step2");
        Assert.fail("Log: Dummy step2 failed");
    }

}
