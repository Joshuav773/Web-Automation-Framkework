package ebayUtil;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.security.cert.X509Certificate;

public class HomepageUtilities extends CommonAPI {

    @FindBy(css = "#gh-ac") public static WebElement searchBar;
    @FindBy(css = "#gh-btn") public static WebElement searchButton;
    @FindBy(xpath = "//span[contains (text(), 'Home')]")public static WebElement homeButton;
    @FindBy(xpath = "//a[contains(text(), 'Saved') and @href='/feed']")public static WebElement savedUtility;
    @FindBy(xpath = )public static WebElement motorDropDownMenu;


    public void usingSearchbar(){
        searchBar.sendKeys("Car Parts");
        searchButton.click();
    }
    public void searchbutton(){
        searchButton.click();
    }
    public void homeButton(){
        homeButton.click();
    }
    //Must be signed in to access feed
    public void savedUtility(){
        savedUtility.click();
    }
    public void motorDropDownMenu(){

    }



}
