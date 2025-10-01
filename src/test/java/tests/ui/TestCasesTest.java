package tests.ui;

import dto.NavigationData;
import org.testng.annotations.Test;
import tests.base.BaseTest;

public class TestCasesTest extends BaseTest {

    @Test
    public void checkPageIsOpened() {
        testCaseStep.isPageOpened(user, password);
    }

    @Test(dataProvider = "sortTestCases", dataProviderClass = NavigationData.class)
    public void checkSortTestCases(String title, String expTitle, String expResults) {
        testCaseStep.sortTestCases(user, password, title, expTitle);
    }
}
