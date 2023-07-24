package tests.automationExercisesPractice;

import org.junit.Test;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import pages.AutomationExcercisePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC19 {
    @Test
    public void test01(){
        //1. Launch browser
        AutomationExcercisePage automationExcercisePage=new AutomationExcercisePage();
        //2. Navigate to url 'http://automationexercise.com'
        Driver.getDriver().get(ConfigReader.getProperty("automationExerciseUrl"));
        //3. Click on 'Products' button
        automationExcercisePage.popUpAdsInEveryPage.click();
        automationExcercisePage.clickOnProducts.click();

        //4. Verify that Brands are visible on left sidebar
        ReusableMethods.bekle(3);
        automationExcercisePage.popUpAdsInEveryPage.click();
        Actions actions=new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN);
        ReusableMethods.bekle(2);
        Assert.assertTrue(automationExcercisePage.brandsAreVisibleTest.isDisplayed());
        //5. Click on any brand name
        automationExcercisePage.clickOnBrandHM.click();
        //6. Verify that user is navigated to brand page and brand products are displayed
        Assert.assertTrue(automationExcercisePage.HMPageIsVisibleTest.isDisplayed());
        automationExcercisePage.popUpAdsInEveryPage.click();
        //7. On left sidebar, click on any other brand link
      //  automationExcercisePage.popUpAdsInEveryPage.click();
        automationExcercisePage.popUpAdsInEveryPage.click();
        ReusableMethods.bekle(3);
        actions.sendKeys(Keys.PAGE_DOWN);
        automationExcercisePage.popUpAdsInEveryPage.click();
        automationExcercisePage.clickOnKookieKids.click();
        //8. Verify that user is navigated to that brand page and can see products
        Assert.assertTrue(automationExcercisePage.kookieKidsIsVisbleTest.isDisplayed());
    }
}
