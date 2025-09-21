package pages;

import static com.codeborne.selenide.Condition.cssClass;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.files.DownloadActions.click;
import static dto.Elements.*;

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
}
