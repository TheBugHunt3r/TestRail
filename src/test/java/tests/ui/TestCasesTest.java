package tests.ui;

import dto.NavigationData;
import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import io.qameta.allure.Story;
import org.testng.annotations.Test;
import tests.base.BaseTest;
import utils.retry.RetryAnalyzer;

public class TestCasesTest extends BaseTest {

    @Owner("Alisa")
    @Description("Тест открытия страницы")
    @Story("Проверка открытия страницы")
    @Test(testName = "Проверка открытия страницы", description = "Тест открытия страницы",
            retryAnalyzer = RetryAnalyzer.class)
    public void checkPageIsOpened() {
        testCaseStep.isPageOpened(user, password);
    }

    @Owner("Alisa")
    @Description("Тест сортировки тест кейсов")
    @Story("Проверка сортировки тест кейсов")
    @Test(testName = "Проверка сортировки тест кейсов", description = "Тест сортировки тест кейсов",
            retryAnalyzer = RetryAnalyzer.class, dataProvider = "sortTestCases", dataProviderClass = NavigationData.class)
    public void checkSortTestCases(String title, String expTitle, String expResults) {
        testCaseStep.sortTestCases(user, password, title, expTitle);
    }
}
