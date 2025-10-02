package tests.ui;

import io.qameta.allure.*;
import org.testng.annotations.Test;

import dto.NavigationData;
import tests.base.BaseTest;
import utils.retry.RetryAnalyzer;

import static com.codeborne.selenide.Selenide.$;

public class MainTest extends BaseTest {

    @Owner("Alisa")
    @Description("Тест открытия страницы")
    @Story("Проверка открытия страницы")
    @Severity(SeverityLevel.CRITICAL)
    @Test(testName = "Проверка открытия страницы", description = "Тест открытия страницы",
            retryAnalyzer = RetryAnalyzer.class)
    public void checkIsPageOpened() {
        loginStep.testWithPositiveCred(user, password);
        mainPage.isPageOpened();
    }

    @Owner("Alisa")
    @Description("Тест FAB")
    @Story("Проверка FAB")
    @Severity(SeverityLevel.NORMAL)
    @Test(testName = "Проверка FAB", description = "Тест FAB",
            retryAnalyzer = RetryAnalyzer.class)
    public void checkFab() {
        checkIsPageOpened();
        mainPage.isFabOpened();
    }

    @Owner("Alisa")
    @Description("Тест выхода из аккаунта")
    @Story("Проверка выхода из аккаунта")
    @Severity(SeverityLevel.CRITICAL)
    @Test(testName = "Проверка выхода из аккаунта", description = "Тест выхода из аккаунта",
            retryAnalyzer = RetryAnalyzer.class)
    public void checkLogOut() {
        loginStep.testWithPositiveCred(user, password);
        mainPage.logOut();
    }

    @Owner("Alisa")
    @Description("Тест поисковой строки")
    @Story("Проверка поисковой строки")
    @Severity(SeverityLevel.NORMAL)
    @Test(testName = "Проверка поисковой строки", description = "Тест поисковой строки",
            retryAnalyzer = RetryAnalyzer.class)
    public void checkSearchProject() {
        mainStep.useSearchProject(user, password, "Алиса");
    }

    @Owner("Alisa")
    @Description("Тест главной строки поиска")
    @Story("Проверка главной строки поиска")
    @Severity(SeverityLevel.NORMAL)
    @Test(testName = "Проверка главной строки поиска", description = "Тест главной строки поиска",
            retryAnalyzer = RetryAnalyzer.class)
    public void checkTopSearch() {
        mainStep.useTopSearch(user, password, "Алиса");
    }

    @Owner("Alisa")
    @Description("Тест кнопки добавления проекта")
    @Story("Проверка кнопки добавления проекта")
    @Test(testName = "Проверка кнопки добавления проекта", description = "Тест кнопки добавления проекта",
            retryAnalyzer = RetryAnalyzer.class)
    public void checkAddProjectButton() {
        mainStep.clickAddProjectButton(user, password, "Алиса");
    }

    @Owner("Alisa")
    @Description("Тест видимости проекта")
    @Story("Проверка видимости проекта")
    @Test(testName = "Проверка видимости проекта", description = "Тест видимости проекта",
            retryAnalyzer = RetryAnalyzer.class)
    public void checkVisibilityOfProject() {
        mainStep.isProjectVisible(user, password, "Алиса");
    }

    @Owner("Alisa")
    @Description("Тест добавления в избранное")
    @Story("Проверка добавления в избранное")
    @Test(testName = "Проверка добавления в избранное", description = "Тест добавления в избранное",
            retryAnalyzer = RetryAnalyzer.class)
    public void checkProjectInFavorites() {
        mainStep.isProjectInFavorites(user, password, "Алиса");
    }

    @Owner("Alisa")
    @Description("Тест удаления из избранного")
    @Story("Проверка удаления из избранного")
    @Test(testName = "Проверка удаления из избранного", description = "Тест удаления из избранного",
            retryAnalyzer = RetryAnalyzer.class)
    public void checkProjectDeletedFromFavorites() {
        mainStep.isProjectDeletedFromFavorites(user, password, "Алиса");
    }

    @Owner("Stanislaw")
    @Description("Тест выбора чекбоксов")
    @Story("Проверка выбора чекбоксов")
    @Test(testName = "Проверка выбора чекбоксов", description = "Тест выбора чекбоксов",
            retryAnalyzer = RetryAnalyzer.class)
    public void checkCheckBoxes() {
        mainStep.useCheckBoxes(user, password, "Алиса", "Projects",
                "Test Cases", "Test Runs");
    }

    @Owner("Stanislaw")
    @Description("Тест снятия чекбоксов")
    @Story("Проверка снятия чекбоксов")
    @Test(testName = "Проверка снятия чекбоксов", description = "Тест снятия чекбоксов",
            retryAnalyzer = RetryAnalyzer.class)
    public void checkRemovingCheckBoxes() {
        mainStep.areCheckBoxesRemoved(user, password, "Алиса", "Projects");
    }

    @Owner("Stanislaw")
    @Description("Тест кнопки 'ClearAll")
    @Story("Проверка кнопки 'Clear All'")
    @Test(testName = "Проверка кнопки 'Clear All'", description = "Тест кнопки 'ClearAll",
            retryAnalyzer = RetryAnalyzer.class)
    public void checkClearButton() {
        mainStep.useClearButton(user, password, "Projects");
    }

    @Owner("Stanislaw")
    @Description("Тест кнопок навигации")
    @Story("Проверка кнопок навигации")
    @Test(testName = "Проверка кнопок навигации", description = "Тест кнопок навигации",
            retryAnalyzer = RetryAnalyzer.class, dataProvider = "navigationData", dataProviderClass = NavigationData.class)
    public void checkNavigation(String menuName, String expectedTitle, String expectedUrl) {
        mainStep.useNavigation(user, password, menuName, expectedTitle, expectedUrl);
    }

    @Owner("Stanislaw")
    @Description("Тест кнопки 'Show More'")
    @Story("Проверка кнопки 'Show More'")
    @Test(testName = "Проверка кнопки 'Show More'", description = "Тест кнопки 'Show More'",
            retryAnalyzer = RetryAnalyzer.class)
    public void checkShowMoreButton() {
        mainStep.useShowMoreButton(user, password);
    }

    @Owner("Stanislaw")
    @Description("Тест перехода на страницу проектов")
    @Story("Проверка перехода на страницу проектов")
    @Test(testName = "Проверка перехода на страницу проектов", description = "Тест перехода на страницу проектов",
            retryAnalyzer = RetryAnalyzer.class)
    public void checkSwitchToProjectPage() {
        mainStep.useSwitchToProjectPage(user, password);
    }
}
