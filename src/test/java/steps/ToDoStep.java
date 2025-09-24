package steps;

import pages.ToDoPage;

public class ToDoStep {

    ToDoPage toDoPage;
    LoginStep loginStep;

    public ToDoStep() {
        toDoPage = new ToDoPage();
        loginStep = new LoginStep();
    }

    public void isPageOpened() {
        loginStep.testWithPositiveCred("stasgolovnev22@gmail.com", "375333631462Stas!");
        toDoPage.openPage()
                .isPageOpened();
    }
    public void isTestRunOpened() {
        isPageOpened();
        toDoPage.openTestRun();
    }

    public void isTubOpened() {
        isPageOpened();
        toDoPage.openTestCasesTab()
                .isTabSelected();
    }

    public void chooseTestCase(String numTestCase) {
        isPageOpened();
        toDoPage.openTestCasesTab()
                .chooseTestCase(numTestCase)
                .isTestCaseOpened();
    }

    public void chooseTestRun(String testRunID) {
        isPageOpened();
        toDoPage.chooseTestRun(testRunID)
                .isTestRunOpened();
    }

    public void chooseTestCaseGroup(String menuName, String expectedTitle) {
        isPageOpened();
        toDoPage
                .openTestCasesTab()
                .checkGroupTestCase(menuName, expectedTitle);
    }

    public void chooseTestRunsGroup(String menuName, String expectedTitle) {
        isPageOpened();
        toDoPage
                .checkGroupTestRun(menuName, expectedTitle);
    }
    public void useTestRunFilters(String filterName, String milestoneName) {
        isPageOpened();
        toDoPage.checkFilterTestRun(filterName, milestoneName);
    }

    public void useTestCaseFilter(String filterName) {
        isPageOpened();
        toDoPage.openTestCasesTab()
                .checkFilterTestCase(filterName);
    }
}
