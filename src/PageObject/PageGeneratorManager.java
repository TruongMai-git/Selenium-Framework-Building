package PageObject;

import PageObject.Filters.*;
import PageObject.SignUpSingIn.HomePageObject;
import PageObject.SignUpSingIn.LoginPageObjectEmail;
import PageObject.SignUpSingIn.LoginPageObjectPassword;
import PageObject.SignUpSingIn.SignUpPageObject;
import org.openqa.selenium.WebDriver;

public class PageGeneratorManager {
    public static LoginPageObjectEmail getloginPageEmail(WebDriver driver) {
        return new LoginPageObjectEmail(driver);
    }

    public static LoginPageObjectPassword getloginPagePassword(WebDriver driver) {
        return new LoginPageObjectPassword(driver);
    }

    public static SignUpPageObject getsignUpPage(WebDriver driver) {
        return new SignUpPageObject(driver);
    }

    public static HomePageObject getHomePageObject(WebDriver driver) {
        return new HomePageObject(driver);
    }

    public static BsfBoardObject getBsfBoardObject(WebDriver driver) {
        return new BsfBoardObject(driver);
    }

    public static FiltersPageObject getFilterPage(WebDriver driver) {
        return new FiltersPageObject(driver);
    }

    public static MyOpenIssuesObject getMyOpenIssues(WebDriver driver) {
        return new MyOpenIssuesObject(driver);
    }

    public static CreatedRecentlyObject getCreatedRecently(WebDriver driver) {
        return new CreatedRecentlyObject(driver);
    }

    public static DoneIssuesObject getDoneIssues(WebDriver driver) {
        return new DoneIssuesObject(driver);
    }

    public static OpenIssuesObject getOpenIssues(WebDriver driver) {
        return new OpenIssuesObject(driver);
    }

    public static ReportedByMeObject getReportedByMe(WebDriver driver) {
        return new ReportedByMeObject(driver);
    }

    public static ResolvedRecentlyObject getResolvedRecently(WebDriver driver) {
        return new ResolvedRecentlyObject(driver);
    }

    public static UpdatedRecentlyObject getUpdatedRecently(WebDriver driver) {
        return new UpdatedRecentlyObject(driver);
    }

    public static ViewedRecentlyObject getViewedRecently(WebDriver driver) {
        return new ViewedRecentlyObject(driver);
    }

    public static AllIssuesObject getAllIssues(WebDriver driver) {
        return new AllIssuesObject(driver);
    }


}
