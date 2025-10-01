package steps;

import pages.TestCasesPage;

public class TestCaseStep {

    TestCasesPage testCasesPage;
    LoginStep loginStep;

    public TestCaseStep() {
        testCasesPage = new TestCasesPage();
        loginStep = new LoginStep();
    }

    public void isPageOpened(String user, String password) {
        loginStep.testWithPositiveCred(user, password);
        testCasesPage.openPage()
                .isPageOpened();
    }

    public void sortTestCases(String user, String password, String title, String expTitle) {
        isPageOpened(user, password);
        testCasesPage.sortTestCases(title, expTitle);
    }
}
