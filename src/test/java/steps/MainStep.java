package steps;

import pages.LoginPage;
import pages.MainPage;
import pages.ProjectPage;

public class MainStep {

    LoginPage loginPage;
    MainPage mainPage;
    ProjectPage projectPage;
    LoginStep loginStep;

    public MainStep() {
        loginPage = new LoginPage();
        projectPage = new ProjectPage();
        mainPage = new MainPage();
        loginStep = new LoginStep();
    }

    public void useSearchProject(String user, String password, String projectName) {
        loginStep.testWithPositiveCred(user, password);
        mainPage.isPageOpened()
                .searchProject(projectName);
    }

    public void useTopSearch(String user, String password, String projectName) {
        loginStep.testWithPositiveCred(user, password);
        mainPage.isPageOpened()
                .useTopSearch(projectName);
    }

    public void clickAddProjectButton(String user, String password, String projectName) {
        loginStep.testWithPositiveCred(user, password);
        mainPage.isPageOpened()
                .switchToProjectPage();
    }

    public void isProjectVisible(String user, String password, String projectName) {
        loginStep.testWithPositiveCred(user, password);
        mainPage.isPageOpened()
                .isProjectVisible(projectName);
    }

    public void isProjectInFavorites(String user, String password, String projectName) {
        loginStep.testWithPositiveCred(user, password);
        mainPage.isPageOpened()
                .isProjectVisible(projectName)
                .isProjectInFavorites(projectName);
    }

    public void isProjectDeletedFromFavorites(String user, String password, String projectName) {
        loginStep.testWithPositiveCred(user, password);
        mainPage.isPageOpened()
                .isProjectVisible(projectName)
                .isProjectDeletedFromFavorites(projectName);
    }

    public void useCheckBoxes(String user, String password, String projectName,
                              String checkboxNameOne, String checkboxNameTwo, String checkboxNameThree ) {
        loginStep.testWithPositiveCred(user, password);
        mainPage.isPageOpened()
                .isCheckBoxesClickable(checkboxNameOne)
                .isCheckBoxesClickable(checkboxNameTwo)
                .isCheckBoxesClickable(checkboxNameThree);
    }

    public void areCheckBoxesRemoved(String user, String password, String projectName, String checkbox) {
        loginStep.testWithPositiveCred(user, password);
        mainPage.isPageOpened()
                .isCheckBoxesClickable(checkbox)
                .checkRemoveOfCheckBoxes(checkbox);
    }

    public void useClearButton(String user, String password, String label) {
        loginStep.testWithPositiveCred(user, password);
        mainPage.isPageOpened()
                .checkClearButton(label);
    }

    public void useNavigation(String user, String password, String menuName, String expectedTitle, String expectedUrl) {
        loginStep.testWithPositiveCred(user, password);
        mainPage.isPageOpened()
                .checkOfNavigation(menuName, expectedTitle, expectedUrl);
    }

    public void useShowMoreButton(String user, String password) {
        loginStep.testWithPositiveCred(user, password);
        mainPage.isPageOpened()
                .useShowMoreButton();
    }

    public void useSwitchToProjectPage(String user, String password) {
        loginStep.testWithPositiveCred(user, password);
        mainPage.isPageOpened()
                .moveToProjectPage();
        projectPage.isPageOpened();
    }
}
