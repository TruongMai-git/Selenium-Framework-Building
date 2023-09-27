package PageObject.SignUpSingIn;

import CommonFunctions.BasePage;
import Configuation.GlobalConstants;
import PageObject.PageGeneratorManager;
import PageUIs.LoginPageUIPassword;
import org.openqa.selenium.WebDriver;

public class LoginPageObjectPassword extends BasePage {
    private static WebDriver driver;

    public LoginPageObjectPassword(WebDriver driver) {
        this.driver = driver;
    }

    public HomePageObject LoginWithValidPassword() {
        InputValidPassword();
        ClickToContinueButton();
        return PageGeneratorManager.getHomePageObject(driver);
    }

    public void InputValidPassword() {
        waitForElementVisiable(driver, LoginPageUIPassword.PASS_TEXTBOX);
        senKeyToElement(driver, LoginPageUIPassword.PASS_TEXTBOX, GlobalConstants.VALID_PASS);
    }

    public HomePageObject ClickToContinueButton() {
        waitForElementClickable(driver, LoginPageUIPassword.CONTINUE_BUTTON);
        clickToElement(driver, LoginPageUIPassword.CONTINUE_BUTTON);
        return PageGeneratorManager.getHomePageObject(driver);
    }

    public String GetInputEmailAddress() {
        waitForElementVisiable(driver, LoginPageUIPassword.INPUTEMAIL);
        return getElementText(driver, LoginPageUIPassword.INPUTEMAIL);
    }
}
