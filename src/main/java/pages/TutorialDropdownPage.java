package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class TutorialDropdownPage {
    private WebDriver driver;

    public TutorialDropdownPage(WebDriver driver) {
        this.driver = driver;
    }

    public void hoverMenu() {
        Actions action = new Actions(driver);
        WebElement menu = driver.findElement(By.linkText("Tutorials"));
        action.moveToElement(menu).perform();
    }

    public FeedbackPage clickFeedbackInDropdown(){
        hoverMenu();
        driver.findElement(By.linkText("Feedback")).click();
        return new FeedbackPage(driver);
    }

    public String getUrl() {
        return driver.getCurrentUrl();
    }
}