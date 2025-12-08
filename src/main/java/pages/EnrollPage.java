package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EnrollPage {
    private WebDriver driver;

    public EnrollPage(WebDriver driver) {
        this.driver = driver;
    }

    public void typeFirstName(String name) {
        driver.findElement(By.id("First Name")).sendKeys(name);
    }
    public void typeLastName(String name) {
        driver.findElement(By.id("Last Name")).sendKeys(name);
    }
    public void typeEmail(String email) {
        driver.findElement(By.id("Email")).sendKeys(email);
    }
    public void clickSend() {
        driver.findElement(By.id("Send")).click();
    }


}
