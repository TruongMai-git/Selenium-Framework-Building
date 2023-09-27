package PageObject.Filters;

import CommonFunctions.BasePage;
import org.openqa.selenium.WebDriver;

public class OpenIssuesObject extends BasePage {
    private static WebDriver driver;

    public OpenIssuesObject(WebDriver driver) {
        this.driver = driver;
    }

}
