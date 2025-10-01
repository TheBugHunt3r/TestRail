package steps;

import pages.ToDoPage;

public class ToDoStep {

    ToDoPage toDoPage;
    LoginStep loginStep;

    public ToDoStep() {
        toDoPage = new ToDoPage();
        loginStep = new LoginStep();
    }

    public void isPageOpened(String user, String password) {
        loginStep.testWithPositiveCred(user, password);
        toDoPage.openPage()
                .isPageOpened();
    }
    public void isTestRunOpened(String user, String password) {
        isPageOpened(user, password);
        toDoPage.openTestRun();
    }

    public void isTubOpened(String user, String password) {
        isPageOpened(user, password);
        toDoPage.openTestCasesTab()
                .isTabSelected();
    }

    public void chooseTestCase(String user, String password, String numTestCase) {
        isPageOpened(user, password);
        toDoPage.openTestCasesTab()
                .chooseTestCase(numTestCase)
                .isTestCaseOpened();
    }

    public void chooseTestRun(String user, String password, String testRunID) {
        isPageOpened(user, password);
        toDoPage.chooseTestRun(testRunID)
                .isTestRunOpened();
    }

    public void chooseTestCaseGroup(String user, String password, String menuName, String expectedTitle) {
        isPageOpened(user, password);
        toDoPage
                .openTestCasesTab()
                .checkGroupTestCase(menuName);
    }

    public void chooseTestRunsGroup(String user, String password, String menuName, String expectedTitle) {
        isPageOpened(user, password);
        toDoPage
                .checkGroupTestRun(menuName, expectedTitle);
    }
    public void useTestRunFilters(String user, String password, String filterName, String milestoneName) {
        isPageOpened(user, password);
        toDoPage.checkFilterTestRun(filterName, milestoneName);
    }

    public void useTestCaseFilter(String user, String password, String filterName) {
        isPageOpened(user, password);
        toDoPage.openTestCasesTab()
                .checkFilterTestCase(filterName);
    }
}
