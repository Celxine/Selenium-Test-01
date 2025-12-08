package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ReadMorePage {
    private WebDriver driver;
    private By readMoreLink = By.linkText("Read More");

    public ReadMorePage(WebDriver driver) {
        this.driver = driver;
    }

    public ReadMorePage clickReadMoreButton() {
        driver.findElement(readMoreLink).click();
        return this;
    }

    public String getCurrentUrl() {
        return driver.getCurrentUrl();
    }
}