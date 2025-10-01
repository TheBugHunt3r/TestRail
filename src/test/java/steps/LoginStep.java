package steps;

import pages.LoginPage;
import pages.MainPage;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.open;
import static elements.LoginPageElements.*;

public class LoginStep {

    LoginPage loginPage;
    MainPage mainPage;

    public LoginStep() {
       loginPage = new LoginPage();
       mainPage = new MainPage();
    }

    public void testWithPositiveCred(String user, String password) {
        loginPage.open()
                .logIn(user, password);
        mainPage.isPageOpened();
    }

    public void testWithEmptyEmail(String user, String password) {
        loginPage.open()
                .logIn(user, password);
        loginPage.getErrorMessage(ERROR_TEXT);
    }

    public void testWithEmptyPassword(String user, String password) {
        loginPage.open()
                .logIn(user, password);
        loginPage.getErrorMessage(ERROR_PASSWORD_TEXT);
    }

    public void testWithTestCreds(String user, String password) {
        loginPage.open()
                .logIn(user, password);
        ERROR_POPUP.shouldBe(visible);
    }

    public void testKeepAuth(String user, String password) {
        loginPage.open();
        KEEP_AUTH.click();
        loginPage.logIn(user, password);
        loginPage.open();
        mainPage.isPageOpened();
    }

}
