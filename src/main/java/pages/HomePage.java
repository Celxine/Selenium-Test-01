package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;
    private By gitlearn= By.partialLinkText("Start Learning");

    public HomePage(WebDriver driver){
        this.driver= driver;
    }

    public EnrollPage clickEnroll(){
        clickLink("Enroll Yourself");
        return new EnrollPage(driver);
    }

    public TutorialDropdownPage clickTutorialDropDown(){
        clickLink("Tutorials");
        return new TutorialDropdownPage(driver);
    }

    public LearningResourcesPage clickGitLearningPage(){
        driver.findElement(gitlearn).click();
        return new LearningResourcesPage(driver);
    }

    public ReadMorePage clickReadMore(){
        driver.findElement(By.linkText("Read More")).click();
        return new ReadMorePage(driver);
    }
    public FeedbackPage clickFeedback() throws InterruptedException {
        TutorialDropdownPage tutorialPage = clickTutorialDropDown();
        return tutorialPage.clickFeedbackInDropdown();
    }

    private void clickLink(String linkText){
        driver.findElement(By.linkText(linkText)).click();
    }
}