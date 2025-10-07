package tests.ui;

import dto.NavigationData;
import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import io.qameta.allure.Story;
import org.testng.annotations.Test;
import tests.base.BaseTest;
import utils.retry.RetryAnalyzer;

public class ToDoTest extends BaseTest {

    @Owner("Alisa")
    @Description("Тест открытия страницы")
    @Story("Проверка открытия страницы")
    @Test(testName = "Проверка открытия страницы", description = "Тест открытия страницы",
            retryAnalyzer = RetryAnalyzer.class)
    public void checkPageIsOpened() {
        toDoStep.isPageOpened(user, password);
    }

    @Owner("Alisa")
    @Description("Тест открытия тест рана")
    @Story("Проверка открытия тест рана")
    @Test(testName = "Проверка открытия тест рана", description = "Тест открытия тест рана",
            retryAnalyzer = RetryAnalyzer.class)
    public void checkTestRunIsOpened() {
        toDoStep.isTestRunOpened(user, password);
    }

    @Owner("Alisa")
    @Description("Тест открытия вкладки тест кейсов")
    @Story("Проверка открытия вкладки тест кейсов")
    @Test(testName = "Проверка открытия вкладки тест кейсов", description = "Тест открытия вкладки тест кейсов",
            retryAnalyzer = RetryAnalyzer.class)
    public void checkTestCasesTabIsOpened() {
        toDoStep.isTubOpened(user, password);
    }

    @Owner("Stanislaw")
    @Description("Тест выбора тест кейса")
    @Story("Проверка выбора тест кейса")
    @Test(testName = "Проверка выбора тест кейса", description = "Тест выбора тест кейса",
            retryAnalyzer = RetryAnalyzer.class)
    public void checkChooseTestCase() {
        toDoStep.chooseTestCase(user, password, "5");
    }

    @Owner("Stanislaw")
    @Description("Тест открытия вкладки тест рана")
    @Story("Проверка открытия вкладки тест рана")
    @Test(testName = "Проверка открытия вкладки тест рана", description = "Тест открытия вкладки тест рана",
            retryAnalyzer = RetryAnalyzer.class)
    public void checkChooseTestRun() {
        toDoStep.chooseTestRun(user, password, "18");
    }

    @Owner("Stanislaw")
    @Description("Тест группировки тест кейсов")
    @Story("Проверка группировки тест кейсов")
    @Test(testName = "Проверка группировки тест кейсов", description = "Тест группировки тест кейсов",
            retryAnalyzer = RetryAnalyzer.class, dataProvider = "groupTestCase", dataProviderClass = NavigationData.class)
    public void checkTestCasesGroup(String menuName, String expectedTitle, String expectedFilter) {
        toDoStep.chooseTestCaseGroup(user, password, menuName, expectedTitle);
    }

    @Owner("Stanislaw")
    @Description("Тест группировки тест ранов")
    @Story("Проверка группировки тест ранов")
    @Test(testName = "Проверка группировки тест ранов", description = "Тест группировки тест ранов",
            retryAnalyzer = RetryAnalyzer.class, dataProvider = "groupTestRuns", dataProviderClass = NavigationData.class)
    public void checkTestRunsGroup(String menuName, String expectedTitle, String expectedFilter) {
        toDoStep.chooseTestRunsGroup(user, password, menuName, expectedTitle);
    }

    @Owner("Stanislaw")
    @Description("Тест фильтрации тест ранов")
    @Story("Проверка фильтрации тест ранов")
    @Test(testName = "Проверка фильтрации тест ранов", description = "Тест фильтрации тест ранов",
            retryAnalyzer = RetryAnalyzer.class)
    public void checkTestRunFilters() {
        toDoStep.useTestRunFilters(user, password, "Blocked", "Release 1.1");
    }

    @Owner("Stanislaw")
    @Description("Тест фильтрации тест кейсов")
    @Story("Проверка фильтрации тест кейсов")
    @Test(testName = "Проверка фильтрации тест кейсов", description = "Тест фильтрации тест кейсов",
            retryAnalyzer = RetryAnalyzer.class)
    public void checkTestCaseFilters() {
        toDoStep.useTestCaseFilter(user, password, "Design");
    }
}
