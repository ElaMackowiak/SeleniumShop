package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;

public class ProductPopupPage extends BasePage {

    public ProductPopupPage(WebDriver driver) {

        super(driver);
    }

    @FindBy(css = ".modal-content .btn-primary")
    private WebElement proceedToCheckout;

    public void clickProceedToCheckout() {
        click(proceedToCheckout);
    }
}
