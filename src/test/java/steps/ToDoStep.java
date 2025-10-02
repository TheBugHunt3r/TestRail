package steps;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.ToDoPage;
import pages.base.BasePage;

public class ToDoStep {

    public static final Logger logger = LoggerFactory.getLogger(ToDoStep.class);

    ToDoPage toDoPage;
    LoginStep loginStep;

    public ToDoStep() {
        toDoPage = new ToDoPage();
        loginStep = new LoginStep();
    }

    public void isPageOpened(String user, String password) {
        logger.info("Проверка открытия страницы To Do");
        loginStep.testWithPositiveCred(user, password);
        toDoPage.openPage()
                .isPageOpened();
    }

    public void isTestRunOpened(String user, String password) {
        logger.info("Проверка открытия тест рана");
        isPageOpened(user, password);
        toDoPage.openTestRun();
    }

    public void isTubOpened(String user, String password) {
        logger.info("Проверка открытия вкладки");
        isPageOpened(user, password);
        toDoPage.openTestCasesTab()
                .isTabSelected();
    }

    public void chooseTestCase(String user, String password, String numTestCase) {
        logger.info("Проверка выбора тест кейса");
        isPageOpened(user, password);
        toDoPage.openTestCasesTab()
                .chooseTestCase(numTestCase)
                .isTestCaseOpened();
    }

    public void chooseTestRun(String user, String password, String testRunID) {
        logger.info("Проверка выбора тест рана");
        isPageOpened(user, password);
        toDoPage.chooseTestRun(testRunID)
                .isTestRunOpened();
    }

    public void chooseTestCaseGroup(String user, String password, String menuName, String expectedTitle) {
        logger.info("Проверка группировки тест кейсов");
        isPageOpened(user, password);
        toDoPage
                .openTestCasesTab()
                .checkGroupTestCase(menuName);
    }

    public void chooseTestRunsGroup(String user, String password, String menuName, String expectedTitle) {
        logger.info("Проверка группировки тест ранов");
        isPageOpened(user, password);
        toDoPage
                .checkGroupTestRun(menuName, expectedTitle);
    }

    public void useTestRunFilters(String user, String password, String filterName, String milestoneName) {
        logger.info("Проверка фильтрации тест ранов");
        isPageOpened(user, password);
        toDoPage.checkFilterTestRun(filterName, milestoneName);
    }

    public void useTestCaseFilter(String user, String password, String filterName) {
        logger.info("Проверка фильтрации тест кейсов");
        isPageOpened(user, password);
        toDoPage.openTestCasesTab()
                .checkFilterTestCase(filterName);
    }
}
