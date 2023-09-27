package PageObject;

import CommonFunctions.BasePage;
import PageUIs.BsfBoardUI;
import org.openqa.selenium.WebDriver;

public class BsfBoardObject extends BasePage {
    private static WebDriver driver;

    public BsfBoardObject(WebDriver driver) {
        this.driver = driver;
    }

    public FiltersPageObject clickOnAllIssues() {
        waitForElementClickable(driver, BsfBoardUI.FILTERS_DROPDOWN);
        selectItemInCustomDropdown(driver, BsfBoardUI.FILTERS_DROPDOWN, BsfBoardUI.All_ISSUE_IN_DROPDOWN, "View all issues");
        return PageGeneratorManager.getFilterPage(driver);
    }
}
