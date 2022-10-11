package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MenuPage extends BasePage {

    public MenuPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "category-3")
    private WebElement clothesCategory;

    public void selectClothesCategory() {
        click(clothesCategory);
    }
}
