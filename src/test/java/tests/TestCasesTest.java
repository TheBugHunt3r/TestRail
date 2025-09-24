package tests;

import dto.ui.NavigationData;
import org.testng.annotations.Test;
import tests.base.BaseTest;

public class TestCasesTest extends BaseTest {

    @Test
    public void checkPageIsOpened() {
        loginStep.testWithPositiveCred("stasgolovnev22@gmail.com", "375333631462Stas!");
        testCasesPage.openPage()
                .isPageOpened();
    }

    @Test(dataProvider = "sortTestCases", dataProviderClass = NavigationData.class)
    public void checkSortTestCases(String title, String expTitle, String expResults) {
        checkPageIsOpened();
        testCasesPage.sortTestCases(title, expTitle);
    }
}
