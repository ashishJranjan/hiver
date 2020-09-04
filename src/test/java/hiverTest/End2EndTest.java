package hiverTest;

import locators.Locators;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import utils.Setup;
import utils.UtilityHelper;


public class End2EndTest {

    Setup setup = new Setup();
    UtilityHelper utilityHelper = new UtilityHelper();


    @Test(enabled = true,description = "End 2 End Test")
    public void end2end() throws Exception {
        WebDriver driver =  setup.initializeDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://www.gmail.com");
        if(utilityHelper.findElementByXpath(driver,Locators.GmailLoginPage.username) !=null){
            utilityHelper.findElementByXpath(driver,Locators.GmailLoginPage.username).sendKeys("showranjan@gmail.com");

        }

    }
}
