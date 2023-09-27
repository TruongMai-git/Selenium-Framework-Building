package PageObject.SignUpSingIn;

import CommonFunctions.BasePage;
import PageObject.BsfBoardObject;
import PageObject.PageGeneratorManager;
import PageUIs.HomePageUI;
import org.openqa.selenium.WebDriver;

public class HomePageObject extends BasePage {
    private static WebDriver driver;

    public HomePageObject(WebDriver driver) {
        this.driver = driver;
    }

    public BsfBoardObject clickOnBsfProject() {
        waitForElementClickable(driver, HomePageUI.BSF_BOARD);
        clickToElement(driver, HomePageUI.BSF_BOARD);
        return PageGeneratorManager.getBsfBoardObject(driver);
    }

}
