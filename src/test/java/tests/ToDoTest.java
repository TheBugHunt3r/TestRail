package tests;

import dto.ui.NavigationData;
import org.testng.annotations.Test;
import tests.base.BaseTest;

public class ToDoTest extends BaseTest {

    @Test
    public void checkPageIsOpened() {
        loginStep.testWithPositiveCred("stasgolovnev22@gmail.com", "375333631462Stas!");
        toDoPage.openPage()
                .isPageOpened();
    }

    @Test
    public void checkTestRunIsOpened() {
        checkPageIsOpened();
        toDoPage.openTestRun();
    }

    @Test
    public void checkTestCasesTabIsOpened() {
        checkPageIsOpened();
        toDoPage.openTestCasesTab()
                .isTabSelected();
    }

    @Test
    public void checkChooseTestCase() {
        checkPageIsOpened();
        toDoPage.openTestCasesTab()
                .chooseTestCase("5")
                .isTestCaseOpened();
    }

    @Test
    public void checkChooseTestRun() {
        checkPageIsOpened();
        toDoPage.chooseTestRun("15")
                .isTestRunOpened();
    }

    @Test(dataProvider = "groupTestCase", dataProviderClass = NavigationData.class)
    public void checkTestCasesGroup(String menuName, String expectedTitle, String expectedFilter) {
        checkPageIsOpened();
        toDoPage
                .openTestCasesTab()
                .checkGroupTestCase(menuName, expectedTitle);
    }

    @Test(dataProvider = "groupTestRuns", dataProviderClass = NavigationData.class)
    public void checkTestRunsGroup(String menuName, String expectedTitle, String expectedFilter) {
        checkPageIsOpened();
        toDoPage
                .checkGroupTestRun(menuName, expectedTitle);
    }

    @Test
    public void checkTestRunFilters() {
        checkPageIsOpened();
        toDoPage.checkFilterTestRun("Blocked", "Release 1.1");
    }

    @Test
    public void checkTestCaseFilters() {
        checkPageIsOpened();
        toDoPage.openTestCasesTab()
            .checkFilterTestCase("Design");
    }
}
