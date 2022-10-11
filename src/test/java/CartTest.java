import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

public class CartTest extends Pages {

    @Test
    public void verifyCartCalculations() {
        menuPage.selectClothesCategory();

        productListPage.openProductWithName("HUMMINGBIRD T-SHIRT");

        productPage.setQuantity(3);
        productPage.clickAddToCart();

        produckPopupPage.clickProceedToCheckout();

        Assertions.assertEquals("HUMMINGBIRD T-SHIRT", shoppingCartPage.getProductInfo());
        Assertions.assertEquals("$19.12", shoppingCartPage.getPrice());
        Assertions.assertEquals("3", shoppingCartPage.getQuantityInCart());
        Assertions.assertEquals("$57.36", shoppingCartPage.getTotalPrice());

        shoppingCartPage.clickOnDelete();

        Assertions.assertEquals("There are no more items in your cart", shoppingCartPage.getEmptyCartMessage());
    }
}
