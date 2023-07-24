package tests.automationExercisesPractice;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AutomationExcercisePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC17 {

        @Test
        public void test01(){
            //1. Launch browser
            AutomationExcercisePage automationExcercisePage=new AutomationExcercisePage();
            //2. Navigate to url 'http://automationexercise.com'
            Driver.getDriver().get(ConfigReader.getProperty("automationExerciseUrl"));
            //3. Verify that home page is visible successfully
            Assert.assertTrue(automationExcercisePage.homePageVisibleTest.isDisplayed());
            //4. Add products to cart
            automationExcercisePage.popUpAdsInEveryPage.click();
            Actions actions=new Actions(Driver.getDriver());
            actions.sendKeys(Keys.PAGE_DOWN);
            automationExcercisePage.popUpAdsInEveryPage.click();
            ReusableMethods.bekle(3);
            automationExcercisePage.addProduct1.click();
            automationExcercisePage.clickOnContinueShopping.click();
            actions.sendKeys(Keys.TAB);
            automationExcercisePage.addProduct2.click();

            //5. Click 'Cart' button
            automationExcercisePage.clickCardButton.click();
            //6. Verify that cart page is displayed
            Assert.assertTrue(automationExcercisePage.cardPageVisibleTest.isDisplayed());
            //7. Click 'X' button corresponding to particular product
            automationExcercisePage.clickX1.click();
            ReusableMethods.bekle(3);
            automationExcercisePage.clickX2.click();
            //8. Verify that product is removed from the cart
            Assert.assertTrue(automationExcercisePage.productRemovedTest.isEnabled());
        }
    }

