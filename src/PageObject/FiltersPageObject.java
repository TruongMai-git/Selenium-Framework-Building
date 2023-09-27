package PageObject;

import CommonFunctions.BasePage;
import org.openqa.selenium.WebDriver;

public class FiltersPageObject extends BasePage {
    private static WebDriver driver;

    public FiltersPageObject(WebDriver driver) {
        this.driver = driver;
    }

}
