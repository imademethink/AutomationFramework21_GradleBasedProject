package pkg_pageobject;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import pkg_locators.Locator_Popup;

public class Page_VarietyDropdown extends Locator_Popup {

    private static final Logger myLog = Logger.getLogger(Page_VarietyDropdown.class);
    private WebDriverWait localWait    = null;
    private WebDriver localDriver      = null;

    public Page_VarietyDropdown(WebDriver driver){
        localDriver = driver;
        localWait   = utilGeneral.ExplicitWaitNormal();
    }

    public void ChooseDropdownCountry(String sCountryName){
        utilGeneral.ImplicitWait(3000);
        utilGeneral.DropDownChoose("countries",sCountryName);
    }

    public void PerformMouseHovering(){
        utilGeneral.ImplicitWait(3000);
        utilGeneral.MouseHoverTopMenu();
    }

}
