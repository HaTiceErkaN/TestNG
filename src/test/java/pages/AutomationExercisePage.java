package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AutomationExercisePage {

    public AutomationExercisePage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//html[@lang='en']")
    public WebElement homePage;
    @FindBy(xpath = "//a[@href='/login']")
    public WebElement login;

    @FindBy(xpath = "//*[text()='Login to your account']")
    public WebElement verifyLogin;

    @FindBy(xpath = "//*[text()='New User Signup!']")
    public WebElement newUserSignUp;

    @FindBy(xpath = "(//input[@type='email'])[1]")
    public WebElement email;

    @FindBy(xpath = "(//input[@type='password'])[1]")
    public WebElement password;

    @FindBy(xpath ="//input[@data-qa='signup-name']")
    public WebElement newName;

    @FindBy(xpath ="//input[@data-qa='signup-email']")
    public WebElement newEmail;

    @FindBy(xpath = "//button[@data-qa='signup-button']")
    public WebElement newSignUpButton;

    @FindBy(xpath = "//*[text()='Email Address already exist!']")
    public WebElement alreadyExist;


    @FindBy(xpath = "(//button[@type='submit'])[1]")
    public WebElement submit;

    @FindBy(xpath = "//*[text()='Hatice Erkan']")
    public WebElement girisYapildi;

    @FindBy(xpath = "//*[text()=' Delete Account']")
    public WebElement deleteAccount;

    @FindBy(xpath = "//*[text()=' Logout']")
    public WebElement logout;

    @FindBy(xpath = "//*[text()='Login to your account']")
    public WebElement logoutYazisi;

}
