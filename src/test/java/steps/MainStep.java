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

    public void useSearchProject() {
        loginStep.testWithPositiveCred("stasgolovnev22@gmail.com", "375333631462Stas!");
        mainPage.isPageOpened()
                .searchProject("Алиса");
    }

    public void useTopSearch() {
        loginStep.testWithPositiveCred("stasgolovnev22@gmail.com", "375333631462Stas!");
        mainPage.isPageOpened()
                .useTopSearch("Алиса");
    }

    public void clickAddProjectButton() {
        loginStep.testWithPositiveCred("stasgolovnev22@gmail.com", "375333631462Stas!");
        mainPage.isPageOpened()
                .switchToProjectPage();
    }

    public void isProjectVisible() {
        loginStep.testWithPositiveCred("stasgolovnev22@gmail.com", "375333631462Stas!");
        mainPage.isPageOpened()
                .isProjectVisible("Алиса");
    }

    public void isProjectInFavorites() {
        loginStep.testWithPositiveCred("stasgolovnev22@gmail.com", "375333631462Stas!");
        mainPage.isPageOpened()
                .isProjectVisible("Алиса")
                .isProjectInFavorites("Алиса");
    }

    public void isProjectDeletedFromFavorites() {
        loginStep.testWithPositiveCred("stasgolovnev22@gmail.com", "375333631462Stas!");
        mainPage.isPageOpened()
                .isProjectVisible("Алиса")
                .isProjectInFavorites("Алиса")
                .isProjectDeletedFromFavorites("Алиса");
    }

    public void useCheckBoxes() {
        loginStep.testWithPositiveCred("stasgolovnev22@gmail.com", "375333631462Stas!");
        mainPage.isPageOpened()
                .isCheckBoxesClickable("Projects")
                .isCheckBoxesClickable("Test Cases")
                .isCheckBoxesClickable("Test Runs");
    }

    public void areCheckBoxesRemoved() {
        loginStep.testWithPositiveCred("stasgolovnev22@gmail.com", "375333631462Stas!");
        mainPage.isPageOpened()
                .isCheckBoxesClickable("Projects")
                .checkRemoveOfCheckBoxes("Projects");
    }

    public void useClearButton() {
        loginStep.testWithPositiveCred("stasgolovnev22@gmail.com", "375333631462Stas!");
        mainPage.isPageOpened()
                .checkClearButton("Projects");
    }

    public void useNavigation(String menuName, String expectedTitle, String expectedUrl) {
        loginStep.testWithPositiveCred("stasgolovnev22@gmail.com", "375333631462Stas!");
        mainPage.isPageOpened()
                .checkOfNavigation(menuName, expectedTitle, expectedUrl);
    }

    public void useShowMoreButton() {
        loginStep.testWithPositiveCred("stasgolovnev22@gmail.com", "375333631462Stas!");
        mainPage.isPageOpened()
                .useShowMoreButton();
    }

    public void useSwitchToProjectPage() {
        loginStep.testWithPositiveCred("stasgolovnev22@gmail.com", "375333631462Stas!");
        mainPage.isPageOpened()
                .moveToProjectPage();
        projectPage.isPageOpened();
    }
}
