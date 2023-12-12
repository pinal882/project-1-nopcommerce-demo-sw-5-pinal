package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

/**
 * Email, password, Login Button and "Welcome, Please Sign In!" text Locators and
 * create appropriate methods for it.
 */
public class LoginPage extends Utility {

    @CacheLookup
    @FindBy(id = "Email")
    WebElement emailField;
    @CacheLookup
    @FindBy(id = "Password")
    WebElement passwordField;
@CacheLookup
@FindBy(xpath = "//h1[contains(text(),'Welcome, Please Sign In!')]")
WebElement welcomeText;
@CacheLookup
@FindBy(xpath = "//div[@class='message-error validation-summary-errors']")
WebElement errorMessage;
@CacheLookup
@FindBy(linkText = "Log in")
WebElement loginButton;
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Log out']")
    WebElement logoutbutton;
    public void enterEmailId(String email){
        sendTextToElement(emailField,email);
    }
    public void enterPassword(String password){
        sendTextToElement(passwordField,password);
        CustomListeners.test.log(Status.PASS,"Enter Password" + password);
    }
    public String getWelcomeText(){
        String message = getTextFromElement(welcomeText);
        return message;
    }
    public String getErrorMessage(){
        String message = getTextFromElement(errorMessage);
        CustomListeners.test.log(Status.PASS,"Get errorMessage");
        return message;
    }
    public void clickOnLoginButton(){
        clickOnElement(loginButton);
    }
    public String  verifyLogoutLink(){
        return getTextFromElement(logoutbutton);
    }
}
