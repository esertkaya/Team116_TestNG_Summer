package tests.automationExercisesPractice;

import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import pages.AutomationExcercisePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC20 {
    @Test
    public void test01(){
        //1. Launch browser
        AutomationExcercisePage automationExcercisePage=new AutomationExcercisePage();
        //2. Navigate to url 'http://automationexercise.com'
        Driver.getDriver().get(ConfigReader.getProperty("automationExerciseUrl"));
        //3. Click on 'Products' button
        automationExcercisePage.clickOnProducts.click();
        //4. Verify user is navigated to ALL PRODUCTS page successfully
        Assert.assertTrue(automationExcercisePage.allProductsVisibleTest.isEnabled());
        //5. Enter product name in search input and click search button
        automationExcercisePage.searchButton.sendKeys("Dress");
        automationExcercisePage.clickOnSearchBinary.click();
        //6. Verify 'SEARCHED PRODUCTS' is visible
        Assert.assertTrue(automationExcercisePage.searchedProductsVisibleTest.isDisplayed());
        //7. Verify all the products related to search are visible
        Assert.assertTrue(automationExcercisePage.allSearchedProductsEnabledTest.isDisplayed());
        //8. Add those products to cart
        automationExcercisePage.popUpAdsInEveryPage.click();
        Actions actions=new Actions(Driver.getDriver());
        ReusableMethods.bekle(2);
        automationExcercisePage.addFirstProductToCart.click();
        automationExcercisePage.clickOnContinueShopping.click();
        actions.sendKeys(Keys.TAB).perform();
        automationExcercisePage.addSecondProductToCart.click();
        automationExcercisePage.clickOnContinueShopping.click();
        actions.sendKeys(Keys.TAB).perform();
        automationExcercisePage.addThirdProductToCart.click();
        automationExcercisePage.clickOnContinueShopping.click();
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.bekle(3);
        automationExcercisePage.addFourthProductToCart.click();
        automationExcercisePage.clickOnContinueShopping.click();
        actions.sendKeys(Keys.TAB).perform();
        automationExcercisePage.addFifthProductToCart.click();
        automationExcercisePage.clickOnContinueShopping.click();
        actions.sendKeys(Keys.TAB).perform();
        automationExcercisePage.addSixthProductToCart.click();
        automationExcercisePage.clickOnContinueShopping.click();
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.bekle(3);
        automationExcercisePage.addSeventhProductToCart.click();
        automationExcercisePage.clickOnContinueShopping.click();
        actions.sendKeys(Keys.TAB).perform();
        automationExcercisePage.addEighthProductToCart.click();
        automationExcercisePage.clickOnContinueShopping.click();
        actions.sendKeys(Keys.TAB).perform();
        automationExcercisePage.addNinthProductToCart.click();
        //9. Click 'Cart' button and verify that products are visible in cart
        automationExcercisePage.clickOnViewCart.click();
        Assert.assertTrue(automationExcercisePage.addedProductsAreVisibleTest.isDisplayed());
        //10. Click 'Signup / Login' button and submit login details
        automationExcercisePage.signUpLoginAtTheTop.click();
        automationExcercisePage.loginEmail.click();
        actions.sendKeys("ea@hotmail.com").perform();
        automationExcercisePage.loginPassword.click();
        actions.sendKeys("123456").perform();
        automationExcercisePage.loginButtonClick.click();
        //11. Again, go to Cart page
        ReusableMethods.bekle(3);
        automationExcercisePage.clickCardButton.click();
        //12. Verify that those products are visible in cart after login as well
        Assert.assertTrue(automationExcercisePage.productsVisibleAfterLogin.isDisplayed());
    }

}
