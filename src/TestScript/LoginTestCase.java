package TestScript;

import PageObject.PageGeneratorManager;
import PageObject.SignUpSingIn.HomePageObject;
import PageObject.SignUpSingIn.LoginPageObjectEmail;
import PageObject.SignUpSingIn.LoginPageObjectPassword;
import PageObject.SignUpSingIn.SignUpPageObject;
import PageUIs.SignUpPageUI;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginTestCase {
    WebDriverWait explicitWait;
    private LoginPageObjectEmail loginPageObjectEmail;
    private LoginPageObjectPassword loginPageObjectPassword;
    private SignUpPageObject signUpPageObject;
    private HomePageObject homePageObject;
    private WebDriver driver;
    private String projectPath = System.getProperty("user.dir");
    private JavascriptExecutor jsExecutor;

    public LoginTestCase() {
    }

    @BeforeClass
    public void beforeClass() {
        System.setProperty("webdriver.gecko.driver", projectPath + "\\WebDriver\\geckodriver.exe");
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        loginPageObjectEmail = PageGeneratorManager.getloginPageEmail(driver);
    }

    @Test
    public void TC_01_Login_Success() {
        System.out.println("Start TC 01");
        //Should create a method to combine 2 below function
        loginPageObjectPassword = loginPageObjectEmail.LoginWithValidUserName();
        homePageObject = loginPageObjectPassword.LoginWithValidPassword();
        sleepInSecond(30);
        AssertJUnit.assertEquals(driver.getCurrentUrl(), "https://start.atlassian.com/");
    }

    @Test
    public void TC_02_Login_Without_Email_Address() {
        loginPageObjectEmail.GetLoginUrl();
        loginPageObjectEmail.ClickToContinueButton();
        AssertJUnit.assertEquals(loginPageObjectEmail.GetLoginErrorMessage(), "Nhập địa chỉ email");
    }

    @Test
    public void TC_03_Login_With_Invalid_Email_Address() {
        loginPageObjectEmail.GetLoginUrl();
        signUpPageObject = loginPageObjectEmail.LoginWithInvalidUserName();
        AssertJUnit.assertEquals(signUpPageObject.GetMessage(), SignUpPageUI.TEXT_MESSAGE);
    }

    @AfterClass
    public void afterClass() {
        driver.quit();
    }

    public void sleepInSecond(long time) {
        try {
            Thread.sleep(time * 1000L);
        } catch (InterruptedException var4) {
            var4.printStackTrace();
        }
    }
}