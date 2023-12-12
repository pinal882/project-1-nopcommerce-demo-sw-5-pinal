package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

/**
 * Build your own computer Text, Processor Drop Down, Ram
 * drop down, HDD radios, os radio, software check boxes, Add To Card button, "The product has
 * been added to your shopping cart" message locators and it's actions
 */
public class BuildYourOwnComputerPage extends Utility {
    @CacheLookup
    @FindBy(linkText = "Build your own computer")
    WebElement buildYourOwnComputer;
    @CacheLookup
    @FindBy(id = "product_attribute_1")
    WebElement processor;
    @CacheLookup
    @FindBy(id = "product_attribute_2")
    WebElement ram;
    @CacheLookup
    @FindBy(xpath = "//label[text() = '320 GB']")
    WebElement hdd320Gb;

    @CacheLookup
    @FindBy(xpath = "//label[text() = '400 GB [+$100.00]']")
    WebElement hdd400Gb;
   // @CacheLookup
   //@FindBy(id = "product_attribute_3_6")
   // WebElement hdd;
@CacheLookup
@FindBy(id = "product_attribute_4_8")
WebElement osVistaHome;
    @CacheLookup
    @FindBy(xpath = "//label[text() = 'Vista Premium [+$60.00]']")
    WebElement osVistaPremium;
@CacheLookup
@FindBy(id = "product_attribute_5_10")
WebElement softwareMicrosoftOffice;
    @CacheLookup
    @FindBy(xpath = "//input[@id='product_attribute_5_11']")
    WebElement softwareAcrobatReader;

    @CacheLookup
    @FindBy(xpath = "//input[@id='product_attribute_5_12']")
    WebElement softwareTotalCommander;
@CacheLookup
@FindBy(id = "add-to-cart-button-1")
WebElement addToCart;
@CacheLookup
@FindBy(linkText = "The product has been added to your shopping cart")
WebElement addToShoppingCartMessage;
    public void clickOnBuildYourOwnComputer(){
        clickOnElement(buildYourOwnComputer);
    }


    public void selectProcessor(String processor2){
        selectByIndexFromDropDown(processor,1);
    }
    public void selectRam(String ram2){
        selectByIndexFromDropDown(ram,2);
    }
    public void selectHdd(String hdd){
        if (hdd == "320 GB"){
            clickOnElement(hdd320Gb);
        }else if(hdd == "400 GB [+$100.00]") {
            clickOnElement(hdd400Gb);
        }else {
            System.out.println("select wrong Features ");
        }
    }

    public void selectOs(String os){
        if (os == "Vista Home [+$50.00]"){
            clickOnElement(osVistaHome);
        }else if(os == "Vista Premium [+$60.00]") {
            clickOnElement(osVistaPremium);
        }else {
            System.out.println("select wrong Features ");
        }

    }
    public void selectSoftware(String software){
        if (software == "Microsoft Office [+$50.00]"){
            clickOnElement(softwareMicrosoftOffice);
        }else if(software == "Acrobat Reader [+$10.00]") {
            clickOnElement(softwareAcrobatReader);
        } else if(software == "Total Commander [+$5.00]") {
            clickOnElement(softwareTotalCommander);
        }else {
            System.out.println("select wrong Features ");
        }
    }
    public void clickOnAddToCart(){
        clickOnElement(addToCart);
    }
    public String verifyAddToShoppingCartMessage(){
        String message = getTextFromElement(addToShoppingCartMessage);
        return message;
    }
    public void selectFeaturesOfComputer (String processor, String ram, String hdd, String os,String software) {
        selectProcessor(processor);
        selectRam(ram);
        selectHdd(hdd);
        selectOs(os);
        selectSoftware(software);

    }


}
