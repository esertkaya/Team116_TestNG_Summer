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
        @FindBy(xpath = "//*[text()='Your email or password is incorrect!']")
        public WebElement emailOrPasswordIncorrect;
        @FindBy(xpath = "//*[text()=' Logout']")
        public WebElement logOutButton;
        @FindBy(xpath = "//*[@class='col-sm-4 col-sm-offset-1']")
        public WebElement loginPageVisible;
        @FindBy(xpath = "(//a[@data-product-id='1'])[1]")
        public WebElement addProduct1;
        @FindBy(xpath = "(//a[@class='btn btn-default add-to-cart'])[3]")
        public WebElement addProduct2;
        @FindBy(xpath = "//a[@class='btn btn-default add-to-cart'])[5]")
        public WebElement AddProduct3;
        @FindBy(xpath = "//*[text()='View Cart']")
        public WebElement clickCardButton;
        @FindBy(xpath = "//div[@id='cart_info']")
        public WebElement cardPageVisibleTest;
        @FindBy(xpath = "//*[@class='fa fa-times']")
        public WebElement clickX1;
        @FindBy(xpath = "//i[@class='fa fa-times']")
        public WebElement clickX2;
        @FindBy(xpath = "//*[@id='empty_cart']")
        public WebElement productRemovedTest;
        @FindBy(xpath = "//*[@class='left-sidebar']")
        public WebElement categoryIsVisibleTest;
        @FindBy(xpath = "(//*[@data-toggle='collapse'])[1]")
        public WebElement clickWomenButton;
        @FindBy(xpath = "(//*[text()='Dress '])[1]")
        public WebElement clickDressUnderWomenCategory;
        @FindBy(xpath = "(//*[@class='container'])[1]")
        public WebElement categoryPageVisible;
        @FindBy(xpath = "(//*[@data-toggle='collapse'])[2]")
        public WebElement clickOnManCategory;
        @FindBy(xpath = "//*[text()='Tshirts ']")
        public WebElement clickOnTshirts;
        @FindBy(xpath = "(//div[@class='container'])[2]")
        public WebElement manCategoryPageIsEnabledTest;
        @FindBy(xpath = "//button[text()='Continue Shopping']")
        public WebElement clickOnContinueShopping;
        @FindBy(xpath = "//a[@href='/products']")
        public WebElement clickOnProducts;
        @FindBy(xpath = "//div[@class='brands_products']")
        public WebElement brandsAreVisibleTest;
        @FindBy(xpath = "//a[@href='/brand_products/H&M']")
        public WebElement clickOnBrandHM;
        @FindBy(xpath = "//div[@class='features_items']")
        public WebElement HMPageIsVisibleTest;
        @FindBy(xpath = "//*[@href='/brand_products/Kookie Kids']")
        public WebElement clickOnKookieKids;
        @FindBy(xpath = "//div[@class='features_items']")
        public WebElement kookieKidsIsVisbleTest;











    }


