package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.Random;

public class BasePage {
    public BasePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }

    public WebDriver driver;
    public WebDriverWait wait;

    public void click(WebElement element) {
        System.out.println("Clicking on: " + element.getText());
        element.click();
    }

    public void sendKeys(WebElement element, String textToSet) {
        System.out.println("Typing: " + textToSet);
        element.sendKeys(textToSet);
    }

    public void sendKeysWithClear(WebElement element, String textToSet) {
        System.out.println("clearing text");
        element.clear();
        sendKeys(element, textToSet);       // = System.out.println("Typing: " + textToSet);
                                            // element.sendKeys(textToSet);
    }

    public void waitToBeVisible(By by){
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }

    public WebElement getRandomElement(List<WebElement> elements) {
        Random random = new Random();
        int randomIndexFromList = random.nextInt(elements.size());
        return elements.get(randomIndexFromList);
    }
}
