package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

/**
 * Computers text, DesktopsLink, NotebooksLink, SoftwareLink Locators and
 * create appropriate methods for it.
 */
public class ComputerPage extends Utility {

    @CacheLookup
    @FindBy(linkText = "Computers")
    WebElement computersText;
    @CacheLookup
    @FindBy(xpath = "//a[@title='Show products in category Desktops'][normalize-space()='Desktops']")
    WebElement desktopLink;
public String  verifyComputerText(){
    String message = getTextFromElement(computersText);
    return message;

}
public void clickOnDesktopLink(){
    clickOnElement(desktopLink);
}

    }

