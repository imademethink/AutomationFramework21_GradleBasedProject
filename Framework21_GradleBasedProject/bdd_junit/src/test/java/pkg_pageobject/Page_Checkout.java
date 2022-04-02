package pkg_pageobject;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import pkg_global.GlobalObjects;

import java.util.List;

public class Page_Checkout extends GlobalObjects {

    private static final Logger myLog = Logger.getLogger(Page_Checkout.class);
    private WebDriverWait localWait    = null;
    private WebDriver localDriver     = null;

    public Page_Checkout(WebDriver localDriver){
        PageFactory.initElements(localDriver, this);
        localDriver = localDriver;
        localWait = utilGeneral.ExplicitWaitNormal();
    }

    @FindBy(how = How.ID, using = "search_query_top")
    private WebElement Txtbx_Search;
    @FindBy(how = How.CSS, using = "button[name='submit_search']")
    private WebElement Btn_SearchSubmit;
    @FindBy(how = How.ID, using = "cart_title")
    private List<WebElement> lstBtn_AddToCart;
    @FindBy(how = How.CSS, using = "a[title='Proceed to checkout']")
    private WebElement Btn_ProceedToCheckout;
    @FindBy(how = How.ID, using = "cart_title")
    private WebElement Txt_CartSummary;
    @FindBy(how = How.CSS, using = "tr[id*='product_']")
    private WebElement Element_OverallProductsCheckout;
    @FindBy(how = How.CSS, using = "a[title='Log me out']")
    private List<WebElement> lstBtn_SignOut;



    public void ValidateCheckoutResult(){
        if(Element_OverallProductsCheckout.isDisplayed()){
            myLog.info("Log: Checkout validation successful");
            if(lstBtn_SignOut.size() > 0){lstBtn_SignOut.get(0).click(); }
        }else{
            if(lstBtn_SignOut.size() > 0){ lstBtn_SignOut.get(0).click(); }
            Assert.fail("Log: Checkout validation NOT successful");
        }
    }




}
