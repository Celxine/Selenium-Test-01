package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LearningResourcesPage {
    private WebDriver driver;
    private By gitText= By.cssSelector("body > div.container-fluid > div > div > div.col.flex-grow-1.article-body__content > section.article-meta-data > div.article-meta-data__title-and-statistics > h1");
    public LearningResourcesPage(WebDriver driver){
        this.driver= driver;
    }


    public String getGitLearningResource(){
      return driver.findElement(gitText).getText();
    }
}
