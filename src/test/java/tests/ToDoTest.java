package tests;

import org.testng.annotations.Test;

public class ToDoTest extends BaseTest {

    @Test
    public void checkPageIsOpened() {
        loginPage.open()
                .logIn("stasgolovnev22@gmail.com", "375333631462Stas!");
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
}
