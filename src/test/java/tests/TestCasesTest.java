package tests;

import dto.NavigationData;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestCasesTest extends BaseTest {

    @Test
    public void checkPageIsOpened() {
        loginPage.open()
                .logIn("stasgolovnev22@gmail.com", "375333631462Stas!");
        testCasesPage.openPage()
                .isPageOpened();
    }

    @Test(dataProvider = "sortTestCases", dataProviderClass = NavigationData.class)
    public void checkSortTestCases(String title, String expTitle, String expResults) {
        checkPageIsOpened();
        testCasesPage.sortTestCases(title, expTitle);
    }
}
