package tests;

import dto.ui.NavigationData;
import org.testng.annotations.Test;
import steps.TestCaseStep;
import tests.base.BaseTest;

public class TestCasesTest extends BaseTest {

    @Test
    public void checkPageIsOpened() {
        testCaseStep.isPageOpened();
    }

    @Test(dataProvider = "sortTestCases", dataProviderClass = NavigationData.class)
    public void checkSortTestCases(String title, String expTitle, String expResults) {
        testCaseStep.sortTestCases(title, expTitle);
    }
}
