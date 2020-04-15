package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.PageBase;

public class ToateProduselePage extends PageBase {

    public ToateProduselePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "menu-item-1")
    private WebElement laptopTableteTelefoane;

    @FindBy(id = "c2")
    private WebElement laptopuriSiAccesorii;

    public LaptopuriSiAccesoriiPagePage navigateTolaptopuriSiAccesorii() {
        waitUntilElementIsClickable(laptopTableteTelefoane).click();
        waitUntilElementIsClickable(laptopuriSiAccesorii).click();
        return new LaptopuriSiAccesoriiPagePage(driver);
    }
}
