package tests.automationExercisesPractice;

import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AutomationExcercisePage;
import utilities.Driver;

public class TC03 {
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
        //6. Enter incorrect email address and password
        Faker faker=new Faker();
        automationExcercisePage.loginEmail.sendKeys(faker.internet().emailAddress());
        automationExcercisePage.loginPassword.sendKeys(faker.internet().password());
        //7. Click 'login' button
        automationExcercisePage.loginButtonClick.click();
        //8. Verify error 'Your email or password is incorrect!' is visible
        Assert.assertTrue(automationExcercisePage.emailOrPasswordIncorrect.isDisplayed());

    }
}
