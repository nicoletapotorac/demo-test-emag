package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.PageBase;

public class HomePage extends PageBase {

    public HomePage(WebDriver driver) {
        super(driver);
        driver.get(readProperties.getBaseURL());
    }

    private static final int WAITING_TIME = 3000;

    @FindBy(css = ".em-burger")
    private WebElement mainMenu;
    @FindBy(css = ".user-sidebar-alldepartments")
    private WebElement toateProdusele;
    @FindBy(css = ".em-cart2.navbar-icon")
    private WebElement cart;


    public boolean isHomePageOpen() {
        localWait(WAITING_TIME);
        driver.getTitle().contains("eMAG.ro - Libertate în fiecare zi");
        return true;
    }

    public void expandMainMenu(){
        localWait(WAITING_TIME);
        mainMenu.click();
    }

    public ToateProduselePage navigateToToateProdusele() {
        waitUntilElementIsClickable(toateProdusele).click();
        return new ToateProduselePage(driver);
    }

    public CartPage navigateToCartPage(WebDriver driver){
        waitUntilElementIsClickable(cart).click();
        return new CartPage(driver);
    }

}
