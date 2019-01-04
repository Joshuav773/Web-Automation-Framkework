import ebayUtil.HomepageUtilities;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomeUtilitiesTests extends HomepageUtilities {

    HomepageUtilities homepageUtilities;

    @BeforeMethod
    public void initelements(){
        homepageUtilities = PageFactory.initElements(driver, HomepageUtilities.class);
    }

    @Test
    public void usingSearchBarTest(){
        usingSearchbar();
    }
    @Test
    public void searchbuttonTest(){
        searchbutton();
    }
    @Test
    public void homeButtonTest(){
        homeButton();
    }
    //Must be signed in
    @Test
    public void savedUtilityTest(){
        savedUtility();
    }

}
