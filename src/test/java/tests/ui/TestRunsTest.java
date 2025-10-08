package tests.ui;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import io.qameta.allure.Story;
import org.testng.annotations.Test;
import tests.base.BaseTest;
import utils.retry.RetryAnalyzer;

public class TestRunsTest extends BaseTest {

    @Owner("Alisa")
    @Description("Тест открытия страницы тест рана")
    @Story("Проверка открытия страницы тест рана")
    @Test(testName = "Проверка открытия страницы тест рана", description = "Тест открытия страницы тест рана",
            retryAnalyzer = RetryAnalyzer.class)
    public void checkOpenTestRunsPage() {
        testRunsStep.isPageOpened(user, password);
    }

    @Owner("Alisa")
    @Description("Тест кнопки добавления тест рана")
    @Story("Проверка кнопки добавления тест ранов")
    @Test(testName = "Проверка кнопки добавления тест ранов", description = "Тест кнопки добавления тест рана",
            retryAnalyzer = RetryAnalyzer.class)
    public void checkAddTestRunButton() {
        testRunsStep.addTestRunButton(user, password);
    }

    @Owner("Alisa")
    @Description("Тест кнопки добавления тест плана")
    @Story("Проверка кнопки добавления тест планов")
    @Test(testName = "Проверка кнопки добавления тест планов", description = "Тест кнопки добавления тест плана",
            retryAnalyzer = RetryAnalyzer.class)
    public void checkTestPlanButton() {
        testRunsStep.addTestPlanButton(user, password);
    }

    @Owner("Alisa")
    @Description("Тест выбора всех тест планов")
    @Story("Проверка выбора всех тест планов")
    @Test(testName = "Проверка выбора всех тест планов", description = "Тест выбора всех тест планов",
            retryAnalyzer = RetryAnalyzer.class)
    public void checkSelectAllTestRuns() {
        testRunsStep.selectAllTestRuns(user, password);
    }
}
