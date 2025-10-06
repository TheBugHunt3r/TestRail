package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import pages.base.BasePage;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static elements.AddTestPlanPageElements.ADD_TEST_PLAN_LOGO;
import static elements.AddTestRunPageElements.ADD_TEST_RUN_LOGO;

public class AddTestPlanPage extends BasePage {

    @Step("Проверка открытия страницы добавления тест плана")
    public AddTestPlanPage isPageOpened() {
        logger.info("Проверка открытия страницы добавления тест плана");
        ADD_TEST_PLAN_LOGO.shouldBe(visible).shouldHave(
                text("Add Test Plan")
        );
        return this;
    }


}
