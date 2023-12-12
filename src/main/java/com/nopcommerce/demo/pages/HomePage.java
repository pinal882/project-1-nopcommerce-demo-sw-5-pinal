package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

/**
 * All Menu (Seven menu), LoginLink, registerLink, nopcommerce logo, My account
 * link and LogOut link locators and create appropriate methods for it.
 */
public class HomePage extends Utility {
    @CacheLookup
    @FindBy(linkText = "Log in")
    WebElement loginLink;
    @CacheLookup
    @FindBy(linkText = "Register")
    WebElement registerLink;
    @CacheLookup
    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[normalize-space()='Computers']")
    WebElement computerTab;

    public void clickOnLoginLink() {
        clickOnElement(loginLink);
        CustomListeners.test.log(Status.PASS, "Click on loginButton");
    }

    public void clickOnRegisterLink() {
        clickOnElement(registerLink);
    }

    public void clickOnComputerTab() {
        clickOnElement(computerTab);
    }
}
