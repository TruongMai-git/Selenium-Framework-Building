package PageObject.Filters;

import CommonFunctions.BasePage;
import org.openqa.selenium.WebDriver;

public class AllIssuesObject extends BasePage {
    private static WebDriver driver;

    public AllIssuesObject(WebDriver driver) {
        this.driver = driver;
    }

}
