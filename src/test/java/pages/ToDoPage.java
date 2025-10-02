package pages;

import io.qameta.allure.Step;
import pages.base.BasePage;
import wrappers.Filters;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;
import static elements.ToDoPageElements.*;
import static wrappers.Filters.select;

public class ToDoPage extends BasePage {

    @Step("Открытие страницы To Do")
    public ToDoPage openPage() {
        open(TO_DO_URL);
        return this;
    }

    @Step("Проверка открытия страницы To Do")
    public ToDoPage isPageOpened() {
        openPage();
        TO_DO_TITLE.shouldBe(visible);
        return this;
    }

    @Step("Открытие тест рана")
    public TestRunPage openTestRun() {
        TEST_RUN.shouldBe(visible)
                .click();
        TESTS_RESULTS.shouldBe(visible);
        return new TestRunPage();
    }

    @Step("Открытие вкладки тест кейсов")
    public ToDoPage openTestCasesTab() {
        TEST_CASES_TAB.click();
        return this;
    }

    @Step("Проверка открытия вкладки")
    public ToDoPage isTabSelected() {
        TEST_CASE_ID.shouldBe(visible);
        return this;
    }

    @Step("Выбор тест кейса '{numTestCase}'")
    public ToDoPage chooseTestCase(String numTestCase) {
        chooseTC(numTestCase).click();
        return this;
    }

    @Step("Выбор тест рана '{testRunID}'")
    public ToDoPage chooseTestRun(String testRunID) {
        chooseTR(testRunID)
                .shouldBe(visible).click();
        return this;
    }

    @Step("Проверка открытия тест рана")
    public ToDoPage isTestRunOpened() {
        TEST_RUN_LOGO.shouldBe(visible);
        return this;
    }

    @Step("Проверка открытия тест кейса")
    public ToDoPage isTestCaseOpened() {
        NEXT_BUTTON.shouldBe(visible);
        return this;
    }

    @Step("Группировка тест кейсов")
    public ToDoPage checkGroupTestCase(String menuName) {
        select();
        Filters.setOption(menuName);
        groupTC(menuName).shouldBe(visible);
        REMOVE_GROUP_BUTTON.click();
        return this;
    }

    @Step("Группировка тест ранов")
    public ToDoPage checkGroupTestRun(String menuName, String expectedTitle) {
        select();
        Filters.setOption(menuName);
        groupTR(menuName).shouldBe(visible);
        REMOVE_GROUP_BUTTON.click();
        return this;
    }

    @Step("Фильтрация тест ранов с использованием '{filterName}' и '{milestoneName}'")
    public ToDoPage checkFilterTestRun(String filterName, String milestoneName) {
        FILTER_BUTTON.click();
        filterTR(filterName).click();
        FILTER_INPUT.setValue(milestoneName);
        APPLY_FILTER_BUTTON.click();
        filterTRTitle(filterName).shouldBe(visible);
        return this;
    }

    @Step("Фильтрация тест ранов с использованием '{filterName}'")
    public ToDoPage checkFilterTestCase(String filterName) {
        FILTER_BUTTON.click();
        filterTC(filterName).click();
        APPLY_FILTER_BUTTON.click();
        filterTCTitle(filterName).shouldBe(visible);
        return this;
    }
}
