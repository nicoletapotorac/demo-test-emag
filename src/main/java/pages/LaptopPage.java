package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.PageBase;

public class LaptopPage extends PageBase {
    public LaptopPage(WebDriver driver){
        super(driver);
    }

    private static final int WAITING_TIME = 3000;

    @FindBy(css = ".yeahIWantThisProduct")
    private WebElement addToCart;
    @FindBy(css = ".ns-box-inner .close")
    private WebElement closeEmagOutletPopup;
    @FindBy(css = ".em.em-close.gtm_6046yfqs")
    private WebElement recomandariPopup;

    public void closeRecomandariPopup(){
        localWait(WAITING_TIME);
        recomandariPopup.click();
    }

    public void CloseEmagOutletPopup(){
        localWait(WAITING_TIME);
        closeEmagOutletPopup.click();

    }

    public void addToCart(){
        localWait(WAITING_TIME);
        addToCart.click();
        localWait(WAITING_TIME);
    }
}
