package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductPage extends BasePage {

    public ProductPage(WebDriver driver) {

        super(driver);
    }

    @FindBy(id = "quantity_wanted")
    private WebElement quantity;

    @FindBy(css = ".add-to-cart")
    private WebElement addToCart;

    public void setQuantity(int quantity) {
        sendKeysWithClear(this.quantity, String.valueOf(quantity));

        /*
            this.quantity.clear();
            this.quantity.sendKeys(String.valueOf(quantity));
        */

    }

    public void clickAddToCart() {
        click(addToCart);
        waitToBeVisible(By.cssSelector("#blockcart-modal"));

    }
}
