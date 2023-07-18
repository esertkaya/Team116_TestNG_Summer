package pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

    public class AutomationExcercisePage {
        public AutomationExcercisePage() {
            PageFactory.initElements(Driver.getDriver(), this);
        }
        @FindBy(xpath = "//div[@class='grippy-host']")
        public WebElement popUpAdsInEveryPage;
        @FindBy(xpath = "//img[@alt='Website for automation practice']")
        public WebElement homePageVisibleTest;
        @FindBy(xpath = "//*[@class='fa fa-lock']")
        public WebElement signUpLoginAtTheTop;
        @FindBy(xpath = "//*[text()='New User Signup!']")
        public WebElement newUserSignUpVisible;
        @FindBy(xpath = "//*[@data-qa='signup-name']")
        public WebElement enterName;
        @FindBy(xpath = "//*[@data-qa='signup-email']")
        public WebElement enterEmail;
        @FindBy(xpath = "//*[text()='Signup']")
        public WebElement newUserSignUpButton;
        @FindBy(xpath = "//*[text()='Enter Account Information']")
        public WebElement enterAccountInformationVisibleTest;
        @FindBy(xpath = "//*[@id='id_gender2']")
        public WebElement pickTitle;
        @FindBy(xpath = "//input[@id='password']")
        public WebElement enterPassword;
        @FindBy(xpath = "(//option[@value='12'])[1]")
        public WebElement selectDay;
        @FindBy(xpath = "(//option[@value='4'])[1]")
        public WebElement selectMonth;
        @FindBy(xpath = "(//option[@value='1980'])[1]")
        public WebElement selectYear;

        @FindBy(xpath = "//*[@id='newsletter']")
        public WebElement signUpForOurNewspaperButton;
        @FindBy(xpath = "//*[@id='optin']")
        public WebElement receiveSpecialOffersButton;
        @FindBy(xpath = "//input[@id='first_name']")
        public WebElement enterFirstName;
        @FindBy(xpath = "//input[@id='last_name']")
        public WebElement enterLastName;
        @FindBy(xpath = "//input[@id='company']")
        public WebElement enterCompanyName;
        @FindBy(xpath = "//input[@id='address1']")
        public WebElement enterAdress1;
        @FindBy(xpath = "//input[@id='address2']")
        public WebElement enterAdress2;
        @FindBy(xpath = "//select[@name='country']")
        public WebElement enterCountry;
        @FindBy(xpath = "//input[@name='state']")
        public WebElement enterState;
        @FindBy(xpath = "//input[@name='city']")
        public WebElement enterCity;
        @FindBy(xpath = "//input[@id='zipcode']")
        public WebElement enterZipcode;
        @FindBy(xpath = "//input[@id='mobile_number']")
        public WebElement enterMobileNumber;
        @FindBy(xpath = "//button[text()='Create Account']")
        public WebElement clickCreateAccountButton;
        @FindBy(xpath = "//h2[@data-qa='account-created']")
        public WebElement accountCreatedTest;
        @FindBy(xpath = "//a[@data-qa='continue-button']")
        public WebElement clickContinue;
        @FindBy(xpath = "//i[@class='fa fa-user']")
        public WebElement loggedInAsUserNameTest;
        @FindBy(xpath = "//*[@href='/delete_account']")
        public WebElement clickDeleteAccount;
        @FindBy(xpath = "//*[text()='Account Deleted!']")
        public WebElement accountDeletedTest;
        @FindBy(xpath = "//a[@data-qa='continue-button']")
        public WebElement clickContinueAfterDeletingTheAccount;
        @FindBy(xpath = "//*[text()='Login to your account']")
        public WebElement loginToYourAccountVisible;
        @FindBy(xpath = "//*[@data-qa='login-email']")
        public WebElement loginEmail;
        @FindBy(xpath = "//*[@data-qa='login-password']")
        public WebElement loginPassword;
        @FindBy(xpath = "//*[@data-qa='login-button']")
        public WebElement loginButtonClick;





    }


