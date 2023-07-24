package tests.automationExercisesPractice;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AutomationExcercisePage;
import utilities.Driver;

public class TC04 {
    @Test
    public void test01(){
        //1. Launch browser
        AutomationExcercisePage automationExcercisePage=new AutomationExcercisePage();
        //2. Navigate to url 'http://automationexercise.com'
        Driver.getDriver().get("http://automationexercise.com");
        //3. Verify that home page is visible successfully
        Assert.assertTrue(automationExcercisePage.homePageVisibleTest.isDisplayed());
        //4. Click on 'Signup / Login' button
        automationExcercisePage.signUpLoginAtTheTop.click();
        //5. Verify 'Login to your account' is visible
        Assert.assertTrue(automationExcercisePage.loginToYourAccountVisible.isDisplayed());
        //6. Enter correct email address and password
        automationExcercisePage.loginEmail.sendKeys("ea@hotmail.com");
        automationExcercisePage.loginPassword.sendKeys("123456");
        //7. Click 'login' button
        automationExcercisePage.loginButtonClick.click();
        //8. Verify that 'Logged in as username' is visible
        Assert.assertTrue(automationExcercisePage.loggedInAsUserNameTest.isDisplayed());
        //9. Click 'Logout' button
        automationExcercisePage.logOutButton.click();
        //10. Verify that user is navigated to login page
        Assert.assertTrue(automationExcercisePage.loginPageVisible.isDisplayed());
    }
}
