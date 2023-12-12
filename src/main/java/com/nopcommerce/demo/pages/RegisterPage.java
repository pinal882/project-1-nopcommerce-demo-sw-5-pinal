package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

/**
 * Register Text, male female radio, Firstname, lastname, Date of Birth drop
 * down, email, Password, Confirm Password, Register Button, "First name is required.","Last name
 * is required.", "Email is required.","Password is required.", "Password is required." error message,
 * "Your registration completed" message, "CONTINUE" button
 * Locators and it's actions
 */

public class RegisterPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Register']")
    WebElement registerText;
    @CacheLookup
    @FindBy(id = "register-button")
    WebElement registerButton;
    @CacheLookup
    @FindBy(id = "FirstName-error")
    WebElement firstNameError;
    @CacheLookup
    @FindBy(id = "LastName-error")
    WebElement lastNameError;
    @CacheLookup
    @FindBy(id="Email-error")
    WebElement emailError;
    @CacheLookup
    @FindBy(id = "Password-error")
    WebElement passwordError;
    @CacheLookup
    @FindBy(id = "ConfirmPassword-error")
    WebElement confirmPasswordError;
    @CacheLookup
    @FindBy(id = "gender")
    WebElement genderTab;
    @CacheLookup
    @FindBy(id = "FirstName")
    WebElement firstName;
    @CacheLookup
    @FindBy(id = "LastName")
    WebElement lastName;
    @CacheLookup
    @FindBy(name = "DateOfBirthDay")
    WebElement day;
    @CacheLookup
    @FindBy(name = "DateOfBirthMonth")
    WebElement month;
    @CacheLookup
    @FindBy(name = "DateOfBirthYear")
    WebElement year;
    @CacheLookup
    @FindBy(id = "Email")
    WebElement email;
    @CacheLookup
    @FindBy(id = "Password")
    WebElement password;
    @CacheLookup
    @FindBy(id = "ConfirmPassword")
    WebElement confirmPassword;
    @CacheLookup
    @FindBy(linkText = "Your registration completed")
    WebElement registrationComplete;
    public String getRegisterText(){
        String message = getTextFromElement(registerText);
        return message;
    }
    public void clickOnRegisterButton(){
        clickOnElement(registerButton);
    }
    public String verifyFirstNameErrorMessage(){
        String message = getTextFromElement(firstNameError);
        return message;
    }
    public String verifyLastNameErrorMessage(){
        String message = getTextFromElement(lastNameError);
        return message;
    }
    public String verifyEmailErrorMessage(){
        String message = getTextFromElement(emailError);
        return message;
    }
    public String verifyPasswordErrorMessage(){
        String message = getTextFromElement(passwordError);
        return message;
    }
    public String verifyConfirmPasswordError(){
        String message = getTextFromElement(confirmPasswordError);
        return message;
    }
    public void selectGenderTab(){
        clickOnElement(genderTab);
    }
    public void enterFirstName(String fName){
        sendTextToElement(firstName, fName);

    }
    public void enterLastName(String lName){
        sendTextToElement(lastName,lName);
    }
    public void selectDay(){
        selectByIndexFromDropDown(day,2);
    }
    public void selectMonth(){
        selectByIndexFromDropDown(month,4);
    }
    public void selectYear(){
        selectByIndexFromDropDown(year,1);
    }
    public void enterEmail(String mail){
        sendTextToElement(email,mail);
    }
    public void enterPassword(String pass){
        sendTextToElement(password,pass);
    }
    public void confirmPassword(String confirm){
        sendTextToElement(confirmPassword,confirm);
    }
    public String verifyRegistrationCompletedMessage(){
        String message = getTextFromElement(registrationComplete);
        return message;
    }

}
