package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.PageBase;

public class LaptopuriPage extends PageBase {

    public LaptopuriPage(WebDriver driver){
        super(driver);
    }

    @FindBy(css = "#card_grid .card-item:nth-of-type(1)")
    private WebElement firstProduct;

    public LaptopPage navigateToLaptopPage(){
        waitUntilElementIsClickable(firstProduct).click();
        return new LaptopPage(driver);
    }
}
