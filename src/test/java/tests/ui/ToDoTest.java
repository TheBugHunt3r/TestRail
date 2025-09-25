package tests.ui;

import dto.NavigationData;
import org.testng.annotations.Test;
import tests.base.BaseTest;

public class ToDoTest extends BaseTest {

    @Test
    public void checkPageIsOpened() {
        toDoStep.isPageOpened();
    }

    @Test
    public void checkTestRunIsOpened() {
        toDoStep.isTestRunOpened();
    }

    @Test
    public void checkTestCasesTabIsOpened() {
        toDoStep.isTubOpened();
    }

    @Test
    public void checkChooseTestCase() {
        toDoStep.chooseTestCase("5");
    }

    @Test
    public void checkChooseTestRun() {
        toDoStep.chooseTestRun("15");
    }

    @Test(dataProvider = "groupTestCase", dataProviderClass = NavigationData.class)
    public void checkTestCasesGroup(String menuName, String expectedTitle, String expectedFilter) {
        toDoStep.chooseTestCaseGroup(menuName,expectedTitle);
    }

    @Test(dataProvider = "groupTestRuns", dataProviderClass = NavigationData.class)
    public void checkTestRunsGroup(String menuName, String expectedTitle, String expectedFilter) {
        toDoStep.chooseTestRunsGroup(menuName, expectedTitle);
    }

    @Test
    public void checkTestRunFilters() {
        toDoStep.useTestRunFilters("Blocked", "Release 1.1");
    }

    @Test
    public void checkTestCaseFilters() {
        toDoStep.useTestCaseFilter("Design");
    }
}
