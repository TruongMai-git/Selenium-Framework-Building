package PageObject.Filters;

import CommonFunctions.BasePage;
import org.openqa.selenium.WebDriver;

public class MyOpenIssuesObject extends BasePage {
    private static WebDriver driver;

    public MyOpenIssuesObject(WebDriver driver) {
        this.driver = driver;
    }

}
