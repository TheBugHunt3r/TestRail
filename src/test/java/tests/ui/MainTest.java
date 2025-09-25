package tests.ui;

import org.testng.annotations.Test;

import dto.NavigationData;
import tests.base.BaseTest;

import static com.codeborne.selenide.Selenide.$;

public class MainTest extends BaseTest {

    @Test
    public void checkIsPageOpened() {
        loginStep.testWithPositiveCred("stasgolovnev22@gmail.com", "375333631462Stas!");
        mainPage.isPageOpened();
    }

    @Test
    public void checkFab() {
        checkIsPageOpened();
        mainPage.isFabOpened();
    }

    @Test
    public void checkLogOut() {
        loginStep.testWithPositiveCred("stasgolovnev22@gmail.com", "375333631462Stas!");
        mainPage.logOut();
    }

    @Test
    public void checkSearchProject() {
       mainStep.useSearchProject();
    }

    @Test
    public void checkTopSearch() {
        mainStep.useTopSearch();
    }

    @Test
    public void checkAddProjectButton() {
        mainStep.clickAddProjectButton();
    }

    @Test
    public void checkVisibilityOfProject() {
        mainStep.isProjectVisible();
    }

    @Test
    public void checkProjectInFavorites() {
        mainStep.isProjectInFavorites();
    }

    @Test
    public void checkProjectDeletedFromFavorites() {
        mainStep.isProjectDeletedFromFavorites();
    }

    @Test
    public void checkCheckBoxes() {
       mainStep.useCheckBoxes();
    }

    @Test
    public void checkRemovingCheckBoxes() {
        mainStep.areCheckBoxesRemoved();
    }

    @Test
    public void checkClearButton() {
       mainStep.useClearButton();
    }

    @Test(dataProvider = "navigationData", dataProviderClass = NavigationData.class)
    public void checkNavigation(String menuName, String expectedTitle, String expectedUrl) {
        mainStep.useNavigation(menuName, expectedTitle, expectedUrl);
    }

    @Test
    public void checkShowMoreButton() {
        mainStep.useShowMoreButton();
    }
    @Test
    public void checkSwitchToProjectPage() {
        mainStep.useSwitchToProjectPage();
    }
}
