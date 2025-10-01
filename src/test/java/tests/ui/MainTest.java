package tests.ui;

import org.testng.annotations.Test;

import dto.NavigationData;
import tests.base.BaseTest;

import static com.codeborne.selenide.Selenide.$;

public class MainTest extends BaseTest {

    @Test
    public void checkIsPageOpened() {
        loginStep.testWithPositiveCred(user, password);
        mainPage.isPageOpened();
    }

    @Test
    public void checkFab() {
        checkIsPageOpened();
        mainPage.isFabOpened();
    }

    @Test
    public void checkLogOut() {
        loginStep.testWithPositiveCred(user, password);
        mainPage.logOut();
    }

    @Test
    public void checkSearchProject() {
       mainStep.useSearchProject(user, password, "Алиса");
    }

    @Test
    public void checkTopSearch() {
        mainStep.useTopSearch(user, password, "Алиса");
    }

    @Test
    public void checkAddProjectButton() {
        mainStep.clickAddProjectButton(user, password, "Алиса");
    }

    @Test
    public void checkVisibilityOfProject() {
        mainStep.isProjectVisible(user, password, "Алиса");
    }

    @Test
    public void checkProjectInFavorites() {
        mainStep.isProjectInFavorites(user, password, "Алиса");
    }

    @Test
    public void checkProjectDeletedFromFavorites() {
        mainStep.isProjectDeletedFromFavorites(user, password, "Алиса");
    }

    @Test
    public void checkCheckBoxes() {
       mainStep.useCheckBoxes(user, password, "Алиса", "Projects",
               "Test Cases", "Test Runs");
    }

    @Test
    public void checkRemovingCheckBoxes() {
        mainStep.areCheckBoxesRemoved(user, password, "Алиса", "Projects");
    }

    @Test
    public void checkClearButton() {
       mainStep.useClearButton(user, password, "Projects");
    }

    @Test(dataProvider = "navigationData", dataProviderClass = NavigationData.class)
    public void checkNavigation(String menuName, String expectedTitle, String expectedUrl) {
        mainStep.useNavigation(user, password, menuName, expectedTitle, expectedUrl);
    }

    @Test
    public void checkShowMoreButton() {
        mainStep.useShowMoreButton(user, password);
    }
    @Test
    public void checkSwitchToProjectPage() {
        mainStep.useSwitchToProjectPage(user, password);
    }
}
