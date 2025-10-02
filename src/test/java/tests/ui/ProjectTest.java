package tests.ui;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import io.qameta.allure.Story;
import org.testng.annotations.Test;
import tests.base.BaseTest;
import utils.retry.RetryAnalyzer;

public class ProjectTest extends BaseTest {

    @Owner("Alisa")
    @Description("Тест создания проекта")
    @Story("Проверка создания проекта")
    @Test(testName = "Проверка создания проекта", description = "Тест создания проекта",
            retryAnalyzer = RetryAnalyzer.class)
    public void checkCreateProject() {
        projectStep.isProjectCreated(user, password, "Star", "Tester", "Asana");
    }

    @Owner("Alisa")
    @Description("Тест удаления проекта")
    @Story("Проверка удаления проекта")
    @Test(testName = "Проверка удаления проекта", description = "Тест удаления проекта",
            retryAnalyzer = RetryAnalyzer.class)
    public void checkDeleteProject() {
        projectStep.isProjectDeleted(user, password, "Star", "Tester", "Asana");
    }
}
