package tests.ui;

import org.testng.annotations.Test;
import tests.base.BaseTest;
import utils.retry.RetryAnalyzer;

public class LoginTest extends BaseTest {

    @Test(testName = "Тест авторизации", description = "Проверка авторизации с позитивными кредами",
            retryAnalyzer = RetryAnalyzer.class)
    public void checkLoginWithPositiveCred() {
        loginStep.testWithPositiveCred(user, password);
    }

    @Test(testName = "Негативный тест авторизации", description = "Проверка авторизации с пустой графой почты",
            retryAnalyzer = RetryAnalyzer.class)
    public void checkLoginWithEmptyEmail() {
        loginStep.testWithEmptyEmail("", password);
    }

    @Test(testName = "Негативный тест авторизации", description = "Проверка авторизации с пустой графой пароля",
            retryAnalyzer = RetryAnalyzer.class)
    public void checkLoginWithEmptyPassword() {
        loginStep.testWithEmptyPassword(user, "");
    }

    @Test(testName = "Негативный тест авторизации", description = "Проверка авторизации с тестовыми кредами",
            retryAnalyzer = RetryAnalyzer.class)
    public void checkLoginWithTestCred() {
        loginStep.testWithTestCreds("test", "test1");
    }

    @Test(testName = "Тест авторизации", description = "Проверка опции Keep Authorized",
            retryAnalyzer = RetryAnalyzer.class)
    public void checkKeepingOfAuth() {
        loginStep.testKeepAuth(user, password);
    }

}
