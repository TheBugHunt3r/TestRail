package tests.ui;

import io.qameta.allure.*;
import org.testng.annotations.Test;
import tests.base.BaseTest;
import utils.retry.RetryAnalyzer;

public class LoginTest extends BaseTest {

    @Owner("Alisa")
    @Description("Проверка авторизации с позитивными кредами")
    @Story("Тест авторизации")
    @Severity(SeverityLevel.CRITICAL)
    @Test(testName = "Тест авторизации", description = "Проверка авторизации с позитивными кредами",
            retryAnalyzer = RetryAnalyzer.class)
    public void checkLoginWithPositiveCred() {
        loginStep.testWithPositiveCred(user, password);
    }

    @Owner("Stanislaw")
    @Description("Проверка авторизации с пустой графой почты")
    @Story("Негативный тест авторизаци")
    @Severity(SeverityLevel.CRITICAL)
    @Test(testName = "Негативный тест авторизации", description = "Проверка авторизации с пустой графой почты",
            retryAnalyzer = RetryAnalyzer.class)
    public void checkLoginWithEmptyEmail() {
        loginStep.testWithEmptyEmail("", password);
    }

    @Owner("Stanislaw")
    @Description("Проверка авторизации с пустой графой пароля")
    @Story("Негативный тест авторизаци")
    @Severity(SeverityLevel.CRITICAL)
    @Test(testName = "Негативный тест авторизации", description = "Проверка авторизации с пустой графой пароля",
            retryAnalyzer = RetryAnalyzer.class)
    public void checkLoginWithEmptyPassword() {
        loginStep.testWithEmptyPassword(user, "");
    }

    @Owner("Stanislaw")
    @Description("Проверка авторизации с тестовыми кредами")
    @Story("Негативный тест авторизаци")
    @Severity(SeverityLevel.CRITICAL)
    @Test(testName = "Негативный тест авторизации", description = "Проверка авторизации с тестовыми кредами",
            retryAnalyzer = RetryAnalyzer.class)
    public void checkLoginWithTestCred() {
        loginStep.testWithTestCreds("test", "test1");
    }

    @Owner("Stanislaw")
    @Description("Проверка опции Keep Authorized")
    @Story("Тест авторизации")
    @Severity(SeverityLevel.CRITICAL)
    @Test(testName = "Тест авторизации", description = "Проверка опции Keep Authorized",
            retryAnalyzer = RetryAnalyzer.class)
    public void checkKeepingOfAuth() {
        loginStep.testKeepAuth(user, password);
    }
}
