package tests.ui;

import dto.NavigationData;
import org.testng.annotations.Test;
import tests.base.BaseTest;

public class ToDoTest extends BaseTest {

    @Test
    public void checkPageIsOpened() {
        toDoStep.isPageOpened(user, password);
    }

    @Test
    public void checkTestRunIsOpened() {
        toDoStep.isTestRunOpened(user, password);
    }

    @Test
    public void checkTestCasesTabIsOpened() {
        toDoStep.isTubOpened(user, password);
    }

    @Test
    public void checkChooseTestCase() {
        toDoStep.chooseTestCase(user, password, "5");
    }

    @Test
    public void checkChooseTestRun() {
        toDoStep.chooseTestRun(user, password, "13");
    }

    @Test(dataProvider = "groupTestCase", dataProviderClass = NavigationData.class)
    public void checkTestCasesGroup(String menuName, String expectedTitle, String expectedFilter) {
        toDoStep.chooseTestCaseGroup(user, password, menuName,expectedTitle);
    }

    @Test(dataProvider = "groupTestRuns", dataProviderClass = NavigationData.class)
    public void checkTestRunsGroup(String menuName, String expectedTitle, String expectedFilter) {
        toDoStep.chooseTestRunsGroup(user, password, menuName, expectedTitle);
    }

    @Test
    public void checkTestRunFilters() {
        toDoStep.useTestRunFilters(user, password, "Blocked", "Release 1.1");
    }

    @Test
    public void checkTestCaseFilters() {
        toDoStep.useTestCaseFilter(user, password, "Design");
    }
}
