package pages;

import elements.TestCasesPageElements;
import io.qameta.allure.Step;
import pages.base.BasePage;
import wrappers.Filters;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.open;
import static elements.TestCasesPageElements.SORT_BUTTON;
import static elements.TestCasesPageElements.sortTitle;
import static elements.ToDoPageElements.SORT_TEST_CASES;
import static elements.ToDoPageElements.TEST_CASES_TITLE;

public class TestCasesPage extends BasePage {

    @Step("Открытие страницы тест кейсов")
    public TestCasesPage openPage() {
        logger.info("Открытие страницы тест кейсов");
        open(TEST_CASES_URL);
        return this;
    }

    @Step("Проверка открытия страницы тест кейсов")
    public TestCasesPage isPageOpened() {
        logger.info("Проверка открытия страницы тест кейсов");
        openPage();
        TEST_CASES_TITLE.shouldBe(visible);
        return this;
    }

    @Step("Сортировка проектов по '{title}'")
    public TestCasesPage sortTestCases(String title, String expTitle) {
        logger.info("Сортировка проектов по '{title}'");
        SORT_TEST_CASES.shouldBe(visible)
                .click();
        Filters.setOption(title);
        sortTitle(title).shouldBe(visible);
        SORT_BUTTON.click();
        return this;
    }
}
