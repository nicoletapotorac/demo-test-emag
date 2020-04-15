package tests;

import common.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.*;

import java.io.IOException;
import java.util.logging.Logger;

public class AddToCartItems extends TestBase {
    private static Logger log = Logger.getLogger(AddToCartItems.class.getName());

    @Test
    public void AddToCartLaptops() throws IOException {
        HomePage homePage = new HomePage(driver);
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(homePage.isHomePageOpen(), "Home page is not open.");
        log.info("Home page is open.");

        homePage.expandMainMenu();
        ToateProduselePage toateProduselePage = homePage.navigateToToateProdusele();
        LaptopuriSiAccesoriiPagePage laptopuriSiAccesoriiPage = toateProduselePage.navigateTolaptopuriSiAccesorii();
        LaptopuriPage laptopuriPage = laptopuriSiAccesoriiPage.navigateToLaptopuriPage();
        LaptopPage laptopPage = laptopuriPage.navigateToLaptopPage();
        laptopPage.CloseEmagOutletPopup();
        laptopPage.addToCart();
        laptopPage.closeRecomandariPopup();
        CartPage cartPage = homePage.navigateToCartPage(driver);
        Assert.assertEquals(cartPage.getCartValue(),"1","CartPage is empty.");
        log.info("Item added to cart.");
    }
}
