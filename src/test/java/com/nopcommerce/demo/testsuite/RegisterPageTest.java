package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.RegisterPage;
import com.nopcommerce.demo.testbase.BaseTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(CustomListeners.class)
public class RegisterPageTest extends BaseTest {
    HomePage homePage;
    RegisterPage registerPage;
    @BeforeMethod(alwaysRun = true)
    public void inIt() {
        homePage = new HomePage();
        registerPage = new RegisterPage();
    }

    @Test(groups = {"sanity","smoke","regression"})
    public void verifyUserShouldNavigateToRegisterPageSuccessfully(){
        //Click on Register Link
        homePage.clickOnRegisterLink();
        //Verify "Register" text
        registerPage.getRegisterText();
    }
    @Test(groups = {"smoke", "regression"})
    public void verifyThatFirstNameLastNameEmailPasswordAndConfirmPasswordFieldsAreMandatory(){
//Click on Register Link
        homePage.clickOnRegisterLink();
//Click on "REGISTER" button
        registerPage.clickOnRegisterButton();
//Verify the error message "First name is required."
        registerPage.verifyFirstNameErrorMessage();
//Verify the error message "Last name is required."
        registerPage.verifyLastNameErrorMessage();
//Verify the error message "Email is required."
registerPage.verifyEmailErrorMessage();
//Verify the error message "Password is required."
registerPage.verifyPasswordErrorMessage();
//Verify the error message "Password is required."
        registerPage.verifyConfirmPasswordError();
    }
    @Test(groups = {"regression"})
    public void verifyThatUserShouldCreateAccountSuccessfully(){
        //Click on Register Link
        homePage.clickOnRegisterLink();
        //Select gender "Female"
        registerPage.selectGenderTab();
        //Enter firstname
registerPage.enterFirstName("ABC");
        //Enter lastname
        registerPage.enterLastName("ch");
        //Select day
registerPage.selectDay();
        //Select month
        registerPage.selectMonth();
        //Select year
        registerPage.selectYear();
        //Enter email
        registerPage.enterEmail("abc@gmail.com");
        //Enter password
registerPage.enterPassword("abc123");
        //Enter Confirm Password
        registerPage.confirmPassword("abc123");
        //Click on "REGISTER" button
        registerPage.clickOnRegisterButton();
        //Verify message "Your registration completed"
        registerPage.verifyRegistrationCompletedMessage();
    }


}
