package io.techleadacademy.pages;

import io.techleadacademy.base.TestBase;
import io.techleadacademy.testData.NewUserInfo;
import io.techleadacademy.util.Waits;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage extends TestBase {
    /**
     * Task Jan - 12
     * //        1. Navigate to phptravels.net/home
     * //        2. Verify page title
     * //        "PHPTRAVELS | Travel Technology Partner"
     * //        3. Crate a new account:
     * //        Click on "My account"
     * //        Click on "Sign Up"
     * //        Fill Out "Register" form
     * //        Click Sumbit
     * //        Verify Sign Up was successfull
     * //                (How? Assert after you click Submit it takes you to profile page)
     * //        4. Verify on "Profile page":
     * //        Title is "My Account"
     * //        Its says "Hi, firstName LastName"
     * //        Today's date
     */
    public RegisterPage () {
        super();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath ="//input[@name='firstname']")
    public WebElement firstName;

    @FindBy(xpath = "//input[@name='lastname']")
    public WebElement lastName;

    @FindBy(xpath = "//input[@name='phone']")
    public WebElement cellPhoneNum;

    @FindBy(xpath = "//input[@name='email']")
    public WebElement email;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement password;

    @FindBy(xpath = "//input[@name='confirmpassword']")
    public WebElement confPassword;

    @FindBy(xpath = "//button[@class='signupbtn btn_full btn btn-success btn-block btn-lg']")
    public WebElement signUp_Btn;



    public void navigateToRegisterPage(){
        HomePage homePage = new HomePage();
        homePage.clickSignUp();
    }

    public void registerNewUser(){
        NewUserInfo user = new NewUserInfo();
        firstName.sendKeys(user.getFirstName());
        lastName.sendKeys(user.getLastName());
        cellPhoneNum.sendKeys(user.getCellPhoneNum());
        email.sendKeys(user.getEmail());
        password.sendKeys(user.getPassword());
        confPassword.sendKeys(user.getConfPassword());
        Waits.sleep(1000);
        signUp_Btn.click();

    }

}
