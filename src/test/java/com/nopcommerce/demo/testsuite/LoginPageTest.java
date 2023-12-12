package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.LoginPage;
import com.nopcommerce.demo.testbase.BaseTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(CustomListeners.class)
public class LoginPageTest extends BaseTest {
    HomePage homePage;
    LoginPage loginPage;

    @BeforeMethod(alwaysRun = true)
    public void inIt() {
        homePage = new HomePage();
        loginPage = new LoginPage();
    }
        @Test(groups = {"sanity","smoke","regression"})
        public void userShouldNavigateToLoginPageSuccessFully() {
            //Click on login link
            homePage.clickOnLoginLink();
            //verify that "Welcome, Please Sign In!" message display
            loginPage.getWelcomeText();
        }
        @Test(groups = {"smoke", "regression"})
        public void verifyTheErrorMessageWithInValidCredentials () {
            //Click on login link
            homePage.clickOnLoginLink();
            //Enter EmailId
            loginPage.enterEmailId("abc@gmail.com");
            //Enter Password
            loginPage.enterPassword("abc123");
            //Click on Login Button
            loginPage.clickOnLoginButton();
            //Verify that the Error message
            loginPage.getErrorMessage();
        }
        @Test(groups = {"regression"})
        public void verifyThatUserShouldLogInSuccessFullyWithValidCredentials () {
            //Click on login link
            homePage.clickOnLoginLink();
            //Enter EmailId
            loginPage.enterEmailId("abc@gmail.com");
            //Enter Password
            loginPage.enterPassword("abc123");
            //Click on Login Button
            loginPage.clickOnLoginButton();
            //Verify that LogOut link is display
            loginPage.verifyLogoutLink();
        }
        @Test(groups = {"regression"})
        public void verifyThatUserShouldLogOutSuccessFully () {
            //Click on login link
            homePage.clickOnLoginLink();
            //Enter EmailId
            loginPage.enterEmailId("abc@gmail.com");
            //Enter Password
            loginPage.enterPassword("abc123");
            //Click on Login Button
            loginPage.clickOnLoginButton();
            //Click on LogOut Link

            //Verify that LogIn Link Display
        }
    }
