package pages;

import io.qameta.allure.Step;
import pages.base.BasePage;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static elements.AddTestRunPageElements.ADD_TEST_RUN_LOGO;
import static elements.TestRunPageElements.TEST_RUN_LOGO;

public class AddTestRunPage extends BasePage {

    @Step("Проверка открытия страницы добавления тест рана")
    public AddTestRunPage isPageOpened() {
        logger.info("Проверка открытия страницы добавления тест рана");
        ADD_TEST_RUN_LOGO.shouldBe(visible).shouldHave(
                text("Add Test Run")
        );
        return this;
    }
}
