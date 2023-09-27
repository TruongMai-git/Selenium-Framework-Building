package PageObject.Filters;

import CommonFunctions.BasePage;
import org.openqa.selenium.WebDriver;

public class DoneIssuesObject extends BasePage {
    private static WebDriver driver;

    public DoneIssuesObject(WebDriver driver) {
        this.driver = driver;
    }

}
