package pages;

import io.qameta.allure.Step;
import pages.base.BasePage;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.open;
import static elements.AddTestPlanPageElements.ADD_TEST_PLAN_LOGO;
import static elements.AddTestRunPageElements.ADD_TEST_RUN_LOGO;
import static elements.TestRunPageElements.*;

public class TestRunPage extends BasePage {

    @Step("Открытия страницы тест рана")
    public TestRunPage openPage() {
        logger.info("Открытия страницы тест рана");
        open(TEST_RUNS_URL);
        return this;
    }

    @Step("Проверка открытия страницы тест рана")
    public TestRunPage isPageOpened() {
        logger.info("Проверка открытия страницы тест рана");
        TEST_RUN_LOGO.shouldBe(visible).shouldHave(
                text("Test Runs & Results")
        );
        return this;
    }

    @Step("Добавление тест рана")
    public AddTestRunPage addTestRun() {
        logger.info("Добавление тест рана");
        ADD_TEST_RUN_BUTTON.shouldBe(visible).click();
        ADD_TEST_RUN_LOGO.shouldBe(visible);
        return new AddTestRunPage();
    }

    @Step("Добавление тест плана")
    public AddTestPlanPage addTestPlan() {
        logger.info("Добавление тест плана");
        ADD_TEST_PLAN_BUTTON.shouldBe(visible).click();
        ADD_TEST_PLAN_LOGO.shouldBe(visible);
        return new AddTestPlanPage();
    }

    @Step("Выбор всех тест ранов")
    public TestRunPage selectAllTestRuns() {
        logger.info("Выбор всех тест ранов");
        SELECT_ALL_CHECKBOX.shouldBe(visible).click();
        SELECT_ALL_CHECKBOX.isSelected();
        return this;
    }

    @Step("Удаление тест рана")
    public TestRunPage deleteTestRuns(String testRunName) {
        logger.info("Удаление тест рана");
        deleteSmallButton(testRunName).shouldBe(visible).click();
        DELETE_OK_BUTTON.shouldBe(visible).click();
        DELETE_MESSAGE.shouldBe(visible);
        return this;
    }
}
