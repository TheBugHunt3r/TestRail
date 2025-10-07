package tests.ui;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import io.qameta.allure.Story;
import org.testng.annotations.Test;
import tests.base.BaseTest;
import utils.retry.RetryAnalyzer;

public class MilestoneTest extends BaseTest {

    @Owner("Stanislaw")
    @Description("Тест открытия страницы milestones")
    @Story("Проверка открытия страницы milestones")
    @Test(testName = "Проверка открытия страницы тест рана", description = "Тест открытия страницы milestones",
            retryAnalyzer = RetryAnalyzer.class)
    public void checkOpenMilestones() {
        milestoneStep.isPageOpened(user, password);
    }

    @Owner("Stanislaw")
    @Description("Тест кнопки добавления milestones")
    @Story("Проверка кнопки добавления milestones")
    @Test(testName = "Проверка кнопки добавления milestones", description = "Тест кнопки добавления milestones",
            retryAnalyzer = RetryAnalyzer.class)
    public void checkAddMilestoneButton() {
        milestoneStep.addMilestone(user, password);
    }

    @Owner("Stanislaw")
    @Description("Тест выбора всех milestones")
    @Story("Проверка выбора всех milestones")
    @Test(testName = "Проверка выбора всех milestones", description = "Тест выбора всех milestones",
            retryAnalyzer = RetryAnalyzer.class)
    public void checkSelectAllMilestones() {
        milestoneStep.selectAllMilestones(user, password);
    }

//    @Owner("Stanislaw")
//    @Description("Тест удаления milestone")
//    @Story("Проверка удаления milestone")
//    @Test(testName = "Проверка удаления milestone", description = "Тест удаления milestone",
//            retryAnalyzer = RetryAnalyzer.class)
//    public void checkDeleteMilestone() {
//        milestoneStep.deleteMilestones(user, password, "Release 1.1");
//    }
}
