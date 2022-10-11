import org.junit.jupiter.api.BeforeEach;
import Pages.*;

public class Pages extends TestBase {

    public MenuPage menuPage;
    public ProductListPage productListPage;
    public ProductPage productPage;
    public ProductPopupPage produckPopupPage;
    public ShoppingCartPage shoppingCartPage;

    @BeforeEach
    public void setupPages(){
        menuPage = new MenuPage(driver);
        productListPage = new ProductListPage(driver);
        productPage = new ProductPage(driver);
        produckPopupPage = new ProductPopupPage(driver);
        shoppingCartPage = new ShoppingCartPage(driver);
    }
}
