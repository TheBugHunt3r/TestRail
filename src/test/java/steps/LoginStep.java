package steps;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.LoginPage;
import pages.MainPage;

import static com.codeborne.selenide.Condition.visible;
import static elements.LoginPageElements.*;

public class LoginStep {

    public static final Logger logger = LoggerFactory.getLogger(LoginStep.class);

    LoginPage loginPage;
    MainPage mainPage;

    public LoginStep() {
        loginPage = new LoginPage();
        mainPage = new MainPage();
    }

    public void testWithPositiveCred(String user, String password) {
        logger.info("Проверка логина с позитивными кредами");
        loginPage.open()
                .logIn(user, password);
        mainPage.isPageOpened();
    }

    public void testWithEmptyEmail(String user, String password) {
        logger.info("Проверка логина с пустым email");
        loginPage.open()
                .logIn(user, password);
        loginPage.getErrorMessage(ERROR_TEXT);
    }

    public void testWithEmptyPassword(String user, String password) {
        logger.info("Проверка логина с пустым паролем");
        loginPage.open()
                .logIn(user, password);
        loginPage.getErrorMessage(ERROR_PASSWORD_TEXT);
    }

    public void testWithTestCreds(String user, String password) {
        logger.info("Проверка логина с тестовыми кредами");
        loginPage.open()
                .logIn(user, password);
        ERROR_POPUP.shouldBe(visible);
    }

    public void testKeepAuth(String user, String password) {
        logger.info("Проверка логина с Keep Authorized");
        loginPage.open();
        KEEP_AUTH.click();
        loginPage.logIn(user, password);
        loginPage.open();
        mainPage.isPageOpened();
    }
}
