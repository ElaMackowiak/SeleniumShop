package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShoppingCartPage extends BasePage {

    public ShoppingCartPage(WebDriver driver) {

        super(driver);
    }

    @FindBy(css = ".product-line-info a")
    private WebElement productInfo;

    @FindBy(css = ".cart-items .current-price .price")
    private WebElement price;

    @FindBy(css = ".js-cart-line-product-quantity")
    private WebElement quantityInCart;

    @FindBy(css = ".col-md-6.col-xs-2.price .product-price")
    private WebElement totalPrice;

    @FindBy(css = ".remove-from-cart")
    private WebElement deleteProducts;

    @FindBy(css = ".no-items")
    private WebElement noItems;

    public String getProductInfo() {
        return productInfo.getText();
    }

    public String getPrice(){
        return price.getText();
    }

    public String getQuantityInCart(){
        return quantityInCart.getAttribute("value");
    }

    public String getTotalPrice(){
        return totalPrice.getText();
    }

    public void clickOnDelete(){
        click(deleteProducts);
    }

    public String getEmptyCartMessage() {
        waitToBeVisible(By.cssSelector(".no-items"));
        return noItems.getText();

    }
}
