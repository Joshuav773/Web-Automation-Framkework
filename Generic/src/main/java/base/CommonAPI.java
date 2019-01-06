package base;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class CommonAPI {

   public WebDriver driver = null;


    @BeforeMethod
    public void openBrowser(){
        System.setProperty("webdriver.chrome.driver","/Users/joshuasmba/Documents/amazon/Web-Automation-Framkework/drivers/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://www.ebay.com/");
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

    }
    @AfterMethod
    public void cleanUp(){
        driver.quit();
    }

}
