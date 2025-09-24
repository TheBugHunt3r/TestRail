package steps;

import pages.TestCasesPage;

public class TestCaseStep {

    TestCasesPage testCasesPage;
    LoginStep loginStep;

    public TestCaseStep() {
        testCasesPage = new TestCasesPage();
        loginStep = new LoginStep();
    }

    public void isPageOpened() {
        loginStep.testWithPositiveCred("stasgolovnev22@gmail.com", "375333631462Stas!");
        testCasesPage.openPage()
                .isPageOpened();
    }

    public void sortTestCases(String title, String expTitle) {
        isPageOpened();
        testCasesPage.sortTestCases(title, expTitle);
    }
}
