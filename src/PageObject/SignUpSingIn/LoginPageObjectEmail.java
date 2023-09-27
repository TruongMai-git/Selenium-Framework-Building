package PageObject.SignUpSingIn;

import CommonFunctions.BasePage;
import Configuation.GlobalConstants;
import PageObject.PageGeneratorManager;
import PageUIs.LoginPageUIEmail;
import org.openqa.selenium.WebDriver;

public class LoginPageObjectEmail extends BasePage {
    private static WebDriver driver;

    public LoginPageObjectEmail(WebDriver driver) {
        this.driver = driver;
    }

    public LoginPageObjectPassword LoginWithValidUserName() {
        GetLoginUrl();
        InputValidEmailAddress();
        ClickToContinueButton();
        return PageGeneratorManager.getloginPagePassword(driver);
    }

    public SignUpPageObject LoginWithInvalidUserName() {
        GetLoginUrl();
        InputInValidEmailAddress();
        ClickToContinueButton();
        return PageGeneratorManager.getsignUpPage(driver);
    }

    public void GetLoginUrl() {
        openPageUrl(driver, GlobalConstants.LOGIN_PAGE_URL);
    }

    public void ClickToContinueButton() {
        waitForElementClickable(driver, LoginPageUIEmail.CONTINUE_BUTTON);
        clickToElement(driver, LoginPageUIEmail.CONTINUE_BUTTON);
    }

    public String GetLoginErrorMessage() {
        waitForElementVisiable(driver, LoginPageUIEmail.LOGIN_ERROR_MESSAGE);
        return getElementText(driver, LoginPageUIEmail.LOGIN_ERROR_MESSAGE);
    }

    public void ClickToSignUpLink() {
        waitForElementClickable(driver, LoginPageUIEmail.SIGN_UP_LINK);
        clickToElement(driver, LoginPageUIEmail.SIGN_UP_LINK);
    }

    public void ClickToResetPasswrod() {
        waitForElementClickable(driver, LoginPageUIEmail.RESET_PASSWORD);
        clickToElement(driver, LoginPageUIEmail.RESET_PASSWORD);
    }

    public void InputValidEmailAddress() {
        waitForElementVisiable(driver, LoginPageUIEmail.EMAIL_TEXTBOX);
        senKeyToElement(driver, LoginPageUIEmail.EMAIL_TEXTBOX, GlobalConstants.VALID_EMAIL);
    }

    public void InputInValidEmailAddress() {
        waitForElementVisiable(driver, LoginPageUIEmail.EMAIL_TEXTBOX);
        senKeyToElement(driver, LoginPageUIEmail.EMAIL_TEXTBOX, GlobalConstants.INVALID_EMAIL);
    }
}
