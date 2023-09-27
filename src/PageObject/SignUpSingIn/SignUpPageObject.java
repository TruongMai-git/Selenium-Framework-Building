package PageObject.SignUpSingIn;

import CommonFunctions.BasePage;
import PageUIs.SignUpPageUI;
import org.openqa.selenium.WebDriver;

public class SignUpPageObject extends BasePage {
    private static WebDriver driver;

    public SignUpPageObject(WebDriver driver) {
        this.driver = driver;
    }

    public String GetMessage() {
        waitForElementVisiable(driver, SignUpPageUI.MESSAGE);
        String message = getElementText(driver, SignUpPageUI.MESSAGE);
        return message;
    }

}
