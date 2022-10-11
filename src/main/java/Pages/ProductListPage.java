package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ProductListPage extends BasePage {

    public ProductListPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = ".product-title")
    private List<WebElement> allProductNames;

    public void openProductWithName(String productName) {
        for (WebElement name : allProductNames) {
            if (name.getText().equals(productName)) {
                click(name);
                break;
            }
        }
    }
}
