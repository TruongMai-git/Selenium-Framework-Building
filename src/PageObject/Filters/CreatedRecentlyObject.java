package PageObject.Filters;

import CommonFunctions.BasePage;
import org.openqa.selenium.WebDriver;

public class CreatedRecentlyObject extends BasePage {
    private static WebDriver driver;

    public CreatedRecentlyObject(WebDriver driver) {
        this.driver = driver;
    }

}
