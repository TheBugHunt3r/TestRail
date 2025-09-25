package pages;

import pages.base.BasePage;
import wrappers.Filters;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;
import static elements.ToDoPageElements.*;
import static org.testng.Assert.assertEquals;
import static wrappers.Filters.select;

public class ToDoPage extends BasePage {

    public ToDoPage openPage() {
        open(TO_DO_URL);
        return this;
    }

    public ToDoPage isPageOpened() {
        openPage();
        TO_DO_TITLE.shouldBe(visible);
        return this;
    }

    public TestRunPage openTestRun() {
        TEST_RUN.shouldBe(visible)
                .click();
        TESTS_RESULTS.shouldBe(visible);
        return new TestRunPage();
    }

    public ToDoPage openTestCasesTab() {
        TEST_CASES_TAB.click();
        return this;
    }

    public ToDoPage isTabSelected() {
        TEST_CASE_ID.shouldBe(visible);
        return this;
    }

    public ToDoPage chooseTestCase(String numTestCase) {
        $x("//tr[@class='odd case ']//following-sibling::td//a[@id='case-link-id-" + numTestCase + "']").click();
        return this;
    }

    public ToDoPage chooseTestRun(String testRunID) {
        $x("//a[@id='run-link-id-" + testRunID + "']")
                .shouldBe(visible).click();
        return this;
    }

    public ToDoPage isTestRunOpened() {
        TEST_RUN_LOGO.shouldBe(visible);
        return this;
    }

    public ToDoPage isTestCaseOpened() {
        NEXT_BUTTON.shouldBe(visible);
        return this;
    }


    public ToDoPage checkGroupTestCase(String menuName, String expectedTitle) {
        select();
        Filters.setOption(menuName);
        $x("//span[contains(text(), '" + menuName + "')]").shouldBe(visible);
        REMOVE_GROUP_BUTTON.click();
        return this;
    }

    public ToDoPage checkGroupTestRun(String menuName, String expectedTitle) {
        select();
        Filters.setOption(menuName);
        $x("//span[contains(text(), '" + menuName + "')]").shouldBe(visible);
        REMOVE_GROUP_BUTTON.click();
        return this;
    }

    public ToDoPage checkFilterTestRun(String filterName, String milestoneName) {
        FILTER_BUTTON.click();
        $x("//span[normalize-space()='" + filterName + "']").click();
        FILTER_INPUT.setValue(milestoneName);
        APPLY_FILTER_BUTTON.click();
        $x("//span[@id='filterByName'][contains(text(), '" + filterName + "')]").shouldBe(visible);
        return this;
    }

    public ToDoPage checkFilterTestCase(String filterName) {
        FILTER_BUTTON.click();
        $x("//span[normalize-space()='" + filterName + "']").click();
        APPLY_FILTER_BUTTON.click();
        $x("//span[@id='filterByName'][contains(text(), '" + filterName + "')]").shouldBe(visible);
        return this;
    }
}
