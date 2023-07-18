package tests.automationExercisesPractice;

import com.github.javafaker.Faker;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AutomationExcercisePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC01 {
    @Test
    public void test01(){
    //1. Launch browser
        AutomationExcercisePage automationExcercisePage = new AutomationExcercisePage();
    //2. Navigate to url 'http://automationexercise.com'
        Driver.getDriver().get(ConfigReader.getProperty("automationExcerciseUrl"));
        //3. Verify that home page is visible successfully
        Assert.assertTrue(automationExcercisePage.homePageVisibleTest.isDisplayed());
    //4. Click on 'Signup / Login' button
automationExcercisePage.signUpLoginAtTheTop.click();
    //5. Verify 'New User Signup!' is visible
Assert.assertTrue(automationExcercisePage.newUserSignUpVisible.isDisplayed());
    //6. Enter name and email address
        Faker faker=new Faker();
        automationExcercisePage.enterName.sendKeys(faker.name().fullName());
        automationExcercisePage.enterEmail.sendKeys(faker.internet().emailAddress());
        //7. Click 'Signup' button
        automationExcercisePage.newUserSignUpButton.click();
    //8. Verify that 'ENTER ACCOUNT INFORMATION' is visible
        Assert.assertTrue(automationExcercisePage.enterAccountInformationVisibleTest.isDisplayed());
    //9. Fill details: Title, Name, Email, Password, Date of birth
        automationExcercisePage.pickTitle.click();
        Actions actions=new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        automationExcercisePage.enterPassword.sendKeys(faker.internet().password());
        automationExcercisePage.selectDay.click();
        automationExcercisePage.selectMonth.click();
        automationExcercisePage.selectYear.click();
        //10. Select checkbox 'Sign up for our newsletter!'
        automationExcercisePage.signUpForOurNewspaperButton.click();
    //11. Select checkbox 'Receive special offers from our partners!'
automationExcercisePage.receiveSpecialOffersButton.click();
    //12. Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number
automationExcercisePage.enterFirstName.sendKeys(faker.name().firstName());
automationExcercisePage.enterLastName.sendKeys(faker.name().lastName());
automationExcercisePage.enterCompanyName.sendKeys(faker.company().name());
automationExcercisePage.enterAdress1.sendKeys(faker.address().firstName());
automationExcercisePage.enterAdress2.sendKeys(faker.address().buildingNumber());
automationExcercisePage.enterCountry.sendKeys(faker.country().name());
automationExcercisePage.enterState.sendKeys(faker.country().capital());
automationExcercisePage.enterCity.sendKeys(faker.country().capital());
automationExcercisePage.enterZipcode.sendKeys(faker.country().countryCode2());
automationExcercisePage.enterMobileNumber.sendKeys(faker.phoneNumber().cellPhone());
    //13. Click 'Create Account button'
        automationExcercisePage.clickCreateAccountButton.click();
    //14. Verify that 'ACCOUNT CREATED!' is visible
        Assert.assertTrue(automationExcercisePage.accountCreatedTest.isDisplayed());
    //15. Click 'Continue' button
automationExcercisePage.clickContinue.click();
    //16. Verify that 'Logged in as username' is visible
        Assert.assertTrue(automationExcercisePage.loggedInAsUserNameTest.isDisplayed());
    //17. Click 'Delete Account' button
        automationExcercisePage.clickDeleteAccount.click();
    //18. Verify that 'ACCOUNT DELETED!' is visible and click 'Continue' button
        Assert.assertTrue(automationExcercisePage.accountDeletedTest.isDisplayed());
        automationExcercisePage.clickContinueAfterDeletingTheAccount.click();
}
}