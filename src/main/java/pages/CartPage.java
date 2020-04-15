package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import utils.PageBase;

public class CartPage extends PageBase {

    public CartPage(WebDriver driver){
        super(driver);
    }

    @FindBy(css = ".gui-input.product-quantity-select")
    private WebElement cartItem;

    public String getCartValue() {
        Select select = new Select(cartItem);
        WebElement option = select.getFirstSelectedOption();
        String defaultItem = option.getText();
        return defaultItem;
    }
}
