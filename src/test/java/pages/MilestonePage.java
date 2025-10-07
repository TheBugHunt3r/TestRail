package pages;

import io.qameta.allure.Step;
import pages.base.BasePage;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.open;
import static elements.MilestonePageElements.*;
import static elements.TestRunPageElements.*;

public class MilestonePage extends BasePage {

    @Step("Открытия страницы milestone")
    public MilestonePage openPage() {
        logger.info("Открытия страницы milestone");
        open(MILESTONE_URL);
        return this;
    }

    @Step("Проверка открытия страницы milestone")
    public MilestonePage isPageOpened() {
        logger.info("Проверка открытия страницы milestone");
        TEST_RUN_LOGO.shouldBe(visible).shouldHave(
                text("Milestones")
        );
        return this;
    }

    @Step("Выбор всех milestones")
    public MilestonePage selectAllMilestones() {
        logger.info("Выбор всех тест ранов");
        SELECT_ALL_CHECKBOX.shouldBe(visible).click();
        SELECT_ALL_CHECKBOX.isSelected();
        return this;
    }

    @Step("Нажатие на кнопку добавления milestones")
    public MilestonePage addMilestone() {
        logger.info("Нажатие на кнопку добавления milestone");
        ADD_MILESTONE.shouldBe(visible).click();
        ADD_MILESTONE_TITTLE.shouldBe(visible);
        return this;
    }

    @Step("Удаление milestones")
    public MilestonePage deleteMilestones(String milestoneName) {
        logger.info("Удаление milestone");
        deleteMilestone(milestoneName).shouldBe(visible).click();
        DELETE_OK_BUTTON.shouldBe(visible).click();
        DELETE_MESSAGE.shouldBe(visible);
        return this;
    }
}
