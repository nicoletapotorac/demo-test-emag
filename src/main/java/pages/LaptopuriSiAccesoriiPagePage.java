package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.PageBase;

public class LaptopuriSiAccesoriiPagePage extends PageBase {

    public LaptopuriSiAccesoriiPagePage(WebDriver driver){
        super(driver);
    }

    @FindBy(css = "#landing-categories li li:nth-of-type(1)")
    private WebElement laptopuri;

    public LaptopuriPage navigateToLaptopuriPage(){
        waitUntilElementIsClickable(laptopuri).click();
        return new LaptopuriPage(driver);
    }
}
