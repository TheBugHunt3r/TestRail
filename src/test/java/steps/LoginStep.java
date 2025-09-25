package steps;

import pages.LoginPage;
import pages.MainPage;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.open;

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
        loginPage.getErrorMessage("Email/Login is required.");
    }

    public void testWithEmptyPassword(String user, String password) {
        loginPage.open()
                .logIn(user, password);
        loginPage.getErrorMessage("Password is required.");
    }

    public void testWithTestCreds(String user, String password) {
        loginPage.open()
                .logIn(user, password);
        $x("//span[@class='error-on-top']").shouldBe(visible);
    }

    public void testKeepAuth(String user, String password) {
        loginPage.open();
        $x("//span[@class='loginpage-checkmark']").click();
        loginPage.logIn(user, password);
        loginPage.open();
        mainPage.isPageOpened();
    }

}
