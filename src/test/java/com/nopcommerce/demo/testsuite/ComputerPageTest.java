package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.pages.BuildYourOwnComputerPage;
import com.nopcommerce.demo.pages.ComputerPage;
import com.nopcommerce.demo.pages.DesktopsPage;
import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import resources.testdata.TestData;

@Listeners(CustomListeners.class)
public class ComputerPageTest extends BaseTest {
    HomePage homePage;
    ComputerPage computerPage;
    DesktopsPage desktopsPage;
    BuildYourOwnComputerPage buildYourOwnComputerPage;

    @BeforeMethod(alwaysRun = true)
    public void inIt() {
        homePage = new HomePage();
        computerPage = new ComputerPage();
        desktopsPage = new DesktopsPage();
        buildYourOwnComputerPage = new BuildYourOwnComputerPage();
    }
    @Test(groups = {"sanity","smoke","regression"})
    public void verifyUserShouldNavigateToComputerPageSuccessfully(){
      //Click on Computer tab
        homePage.clickOnComputerTab();
        //Verify "Computer" text
        computerPage.verifyComputerText();
    }
    @Test(groups = {"smoke", "regression"})
    public void verifyUserShouldNavigateToDesktopsPageSuccessfully(){
       //Click on Computer tab
        homePage.clickOnComputerTab();
        //Click on Desktops link
        computerPage.clickOnDesktopLink();
        //Verify "Desktops" text
        Assert.assertEquals(desktopsPage.verifyDesktopsText(),"Desktops");

    }
    @Test(groups = {"regression"},dataProvider = "computerConfigs",dataProviderClass = TestData.class)
    public void verifyThatUserShouldBuildYouOwnComputerAndAddThemToCartSuccessfully(String processor, String ram, String hdd, String os, String software){
//Click on Computer tab
        homePage.clickOnComputerTab();
//Click on Desktops link
        computerPage.clickOnDesktopLink();
//Click on product name "Build your own computer"
        buildYourOwnComputerPage.clickOnBuildYourOwnComputer();
//Select processor "processor"
//Select RAM "ram"
//Select HDD "hdd"
//Select OS "os"
//Select Software "software"
        buildYourOwnComputerPage.selectFeaturesOfComputer(processor, ram, hdd, os, software);
        //Click on "ADD TO CART" Button
        buildYourOwnComputerPage.clickOnAddToCart();
//Verify message "The product has been added to your shopping cart"
     Assert.assertEquals(buildYourOwnComputerPage.verifyAddToShoppingCartMessage(),"The product has been added to your shopping cart");
    }


}

