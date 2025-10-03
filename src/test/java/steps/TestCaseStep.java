package steps;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.TestCasesPage;

public class TestCaseStep {

    public static final Logger logger = LoggerFactory.getLogger(TestCaseStep.class);

    TestCasesPage testCasesPage;
    LoginStep loginStep;

    public TestCaseStep() {
        testCasesPage = new TestCasesPage();
        loginStep = new LoginStep();
    }

    public void isPageOpened(String user, String password) {
        logger.info("Проверка открытия страницы тест кейсов");
        loginStep.testWithPositiveCred(user, password);
        testCasesPage.openPage()
                .isPageOpened();
    }

    public void sortTestCases(String user, String password, String title, String expTitle) {
        logger.info("Проверка сортировки тест кейсов");
        isPageOpened(user, password);
        testCasesPage.sortTestCases(title, expTitle);
    }
}
