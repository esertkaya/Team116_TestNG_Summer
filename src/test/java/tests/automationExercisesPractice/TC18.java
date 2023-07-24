package tests.automationExercisesPractice;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AutomationExcercisePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC18 {
    @Test
    public void test01(){
        //1. Launch browser
        AutomationExcercisePage automationExcercisePage=new AutomationExcercisePage();
        //2. Navigate to url 'http://automationexercise.com'
        Driver.getDriver().get(ConfigReader.getProperty("automationExerciseUrl"));
        //3. Verify that categories are visible on left sidebar
        automationExcercisePage.popUpAdsInEveryPage.click();
        Actions actions=new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN);
        Assert.assertTrue(automationExcercisePage.categoryIsVisibleTest.isDisplayed());
        //4. Click on 'Women' category
        automationExcercisePage.popUpAdsInEveryPage.click();
        ReusableMethods.bekle(3);
        automationExcercisePage.clickWomenButton.click();
        //5. Click on any category link under 'Women' category, for example: Dress
        automationExcercisePage.clickDressUnderWomenCategory.click();
        ReusableMethods.bekle(5);
        //6. Verify that category page is displayed and confirm text 'WOMEN - TOPS PRODUCTS'
        Assert.assertTrue(automationExcercisePage.categoryPageVisible.isDisplayed());
        automationExcercisePage.categoryIsVisibleTest.getText();
        //7. On left sidebar, click on any sub-category link of 'Men' category
        ReusableMethods.bekle(5);
        automationExcercisePage.clickOnManCategory.click();
        automationExcercisePage.popUpAdsInEveryPage.click();
        automationExcercisePage.clickOnTshirts.click();
        //8. Verify that user is navigated to that category page
        Assert.assertTrue(automationExcercisePage.manCategoryPageIsEnabledTest.isEnabled());
    }
}
