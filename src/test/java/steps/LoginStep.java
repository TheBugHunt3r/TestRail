package steps;

import dto.Account;
import pages.LoginPage;
import pages.MainPage;

import static com.codeborne.selenide.Condition.text;
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

    public void testWithPositiveCred(String email, String password) {
        loginPage.open()
                .LogIn(email, password);
        mainPage.isPageOpened();
    }

    public void testWithEmptyEmail(String email, String password) {
        loginPage.open()
                .LogIn(email, password);
        loginPage.getErrorMessage("Email/Login is required.");
    }

    public void testWithEmptyPassword(String email, String password) {
        loginPage.open()
                .LogIn(email, password);
        loginPage.getErrorMessage("Password is required.");
    }

    public void testWithTestCreds(String email, String password) {
        loginPage.open()
                .LogIn(email, password);
        $x("//span[@class='error-on-top']").shouldBe(visible);
    }

    public void testOfKeepAuth(String email, String password) {
        loginPage.open();
        $x("//span[@class='loginpage-checkmark']").click();
        loginPage.LogIn(email, password);
        loginPage.open();
        mainPage.isPageOpened();
    }

}
