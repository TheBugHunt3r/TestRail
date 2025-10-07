package steps;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.TestRunPage;

public class TestRunsStep {

    public static final Logger logger = LoggerFactory.getLogger(TestRunsStep.class);

    LoginStep loginStep;
    ProjectStep projectStep;
    TestRunPage testRunPage;

    public TestRunsStep() {
        loginStep = new LoginStep();
        projectStep = new ProjectStep();
        testRunPage = new TestRunPage();
    }

    public void isPageOpened(String user, String password) {
        logger.info("Проверка открытия страницы тест ранов");
        loginStep.testWithPositiveCred(user, password);
        testRunPage.openPage().isPageOpened();
    }

    public void addTestRunButton(String user, String password) {
        logger.info("Проверка кнопки добавления тест ранов");
        loginStep.testWithPositiveCred(user, password);
        testRunPage.openPage().isPageOpened();
        testRunPage.addTestRun();
    }

    public void addTestPlanButton(String user, String password) {
        logger.info("Проверка кнопки добавления тест планов");
        loginStep.testWithPositiveCred(user, password);
        testRunPage.openPage().isPageOpened();
        testRunPage.addTestPlan();
    }

    public void selectAllTestRuns(String user, String password) {
        logger.info("Проверка выбора всех тест ранов");
        loginStep.testWithPositiveCred(user, password);
        testRunPage.openPage().isPageOpened();
        testRunPage.selectAllTestRuns();
    }

    public void deleteTestRuns(String user, String password, String testRunName) {
        logger.info("Проверка удаления тест ранов");
        loginStep.testWithPositiveCred(user, password);
        testRunPage.openPage().isPageOpened();
        testRunPage.deleteTestRuns(testRunName);
    }
}
