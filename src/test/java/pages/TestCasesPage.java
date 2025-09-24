package pages;

import wrappers.Filters;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.open;
import static dto.ui.Elements.*;

public class TestCasesPage extends BasePage{

    public TestCasesPage openPage() {
        open(TEST_CASES_URL);
        return this;
    }

    public TestCasesPage isPageOpened() {
        openPage();
        TEST_CASES_TITLE.shouldBe(visible);
        return this;
    }

    public TestCasesPage sortTestCases(String title, String expTitle) {
        SORT_TEST_CASES.shouldBe(visible)
                .click();
        Filters.setOption(title);
        $x("//span[@id='orderByName'][contains(text(), '" + title + "')]").shouldBe(visible);
        $x("//span[@id='orderByReset']//div[@class='icon-orderreset']").click();
        return this;
    }
}
