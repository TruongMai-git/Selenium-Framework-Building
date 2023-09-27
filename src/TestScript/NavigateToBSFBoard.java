package TestScript;

import PageObject.BsfBoardObject;
import PageObject.Filters.*;
import PageObject.FiltersPageObject;
import PageObject.PageGeneratorManager;
import PageObject.SignUpSingIn.HomePageObject;
import PageObject.SignUpSingIn.LoginPageObjectEmail;
import PageObject.SignUpSingIn.LoginPageObjectPassword;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class NavigateToBSFBoard {
    private final String projectPath = System.getProperty("user.dir");
    WebDriverWait explicitWait;
    private LoginPageObjectEmail loginPageObjectEmail;
    private LoginPageObjectPassword loginPageObjectPassword;
    private BsfBoardObject bsfPage;
    private HomePageObject homePageObject;
    private FiltersPageObject filtersPageObject;
    private AllIssuesObject allIssues;
    private CreatedRecentlyObject createdRecently;
    private DoneIssuesObject doneIssues;
    private MyOpenIssuesObject myOpenIssues;
    private OpenIssuesObject openIssues;
    private ReportedByMeObject reportedbyMe;
    private ResolvedRecentlyObject resolvedRecently;
    private UpdatedRecentlyObject updatedRecently;
    private ViewedRecentlyObject viewedRecently;
    private WebDriver driver;
    private JavascriptExecutor jsExecutor;

    public NavigateToBSFBoard() {
    }

    @BeforeClass
    public void beforeClass() {
        System.setProperty("webdriver.gecko.driver", projectPath + "\\WebDriver\\geckodriver.exe");
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        loginPageObjectEmail = PageGeneratorManager.getloginPageEmail(driver);
    }

    @Test
    public void TC_01_NaviagatesToAllIssueFilter() {
        loginPageObjectPassword = loginPageObjectEmail.LoginWithValidUserName();
        homePageObject = loginPageObjectPassword.LoginWithValidPassword();
        bsfPage = homePageObject.clickOnBsfProject();
        filtersPageObject = bsfPage.clickOnAllIssues();
            Assert.assertEquals(driver.findElement(By.xpath("//li/button[@original-title='Search for issues']")).getText(), "Search");
    }

    @Test
    public void TC_02_NavigatesToEachFilter() {
        myOpenIssues = (MyOpenIssuesObject) filtersPageObject.openWishPage(driver, "My open issues");
        System.out.println(driver.getTitle());
        reportedbyMe = (ReportedByMeObject) filtersPageObject.openWishPage(driver, "Reported by me");
        System.out.println(driver.getTitle());
        allIssues = (AllIssuesObject) filtersPageObject.openWishPage(driver, "All issues");
        System.out.println(driver.getTitle());
        openIssues = (OpenIssuesObject) filtersPageObject.openWishPage(driver, "Open issues");
        System.out.println(driver.getTitle());
        doneIssues = (DoneIssuesObject) filtersPageObject.openWishPage(driver, "Done issues");
        System.out.println(driver.getTitle());
        viewedRecently = (ViewedRecentlyObject) filtersPageObject.openWishPage(driver, "Viewed recently");
        System.out.println(driver.getTitle());
        createdRecently = (CreatedRecentlyObject) filtersPageObject.openWishPage(driver, "Created recently");
        System.out.println(driver.getTitle());
        resolvedRecently = (ResolvedRecentlyObject) filtersPageObject.openWishPage(driver, "Resolved recently");
        System.out.println(driver.getTitle());
        updatedRecently = (UpdatedRecentlyObject) filtersPageObject.openWishPage(driver, "Updated recently");
        System.out.println(driver.getTitle());
    }

    /*@Test
    public void TC_03_Login_With_Invalid_Email_Address() {

    }*/

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