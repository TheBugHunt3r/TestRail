package tests;

import org.testng.annotations.Test;

import dto.NavigationData;

import static com.codeborne.selenide.Selenide.$;

public class MainTest extends BaseTest{

    @Test
    public void checkIsPageOpened() {
        loginPage.open().logIn("stasgolovnev22@gmail.com", "375333631462Stas!");
        mainPage.isPageOpened();
    }

    @Test
    public void checkFab() {
        loginPage.open().logIn("stasgolovnev22@gmail.com", "375333631462Stas!");
        mainPage.isFabOpened();
    }

    @Test
    public void checkLogOut() {
        loginPage.open().logIn("stasgolovnev22@gmail.com", "375333631462Stas!");
        mainPage.logOut();
    }

    @Test
    public void checkSearchProject() {
        loginPage.open().logIn("stasgolovnev22@gmail.com", "375333631462Stas!");
        mainPage.isPageOpened()
                .searchProject("Алиса");
    }

    @Test
    public void checkTopSearch() {
        loginPage.open().logIn("stasgolovnev22@gmail.com", "375333631462Stas!");
        mainPage.isPageOpened()
                .useTopSearch("Алиса");
    }

    @Test
    public void checkAddProjectButton() {
        loginPage.open()
                .logIn("stasgolovnev22@gmail.com", "375333631462Stas!");
        mainPage.isPageOpened()
                .switchToProjectPage();
    }

    @Test
    public void checkVisibilityOfProject() {
        loginPage.open()
                .logIn("stasgolovnev22@gmail.com", "375333631462Stas!");
        mainPage.isPageOpened()
                .isProjectVisible("Алиса");
    }

    @Test
    public void checkProjectInFavorites() {
        loginPage.open()
                .logIn("stasgolovnev22@gmail.com", "375333631462Stas!");
        mainPage.isPageOpened()
                .isProjectVisible("Алиса")
                .isProjectInFavorites("Алиса");
    }

    @Test
    public void checkProjectDeletedFromFavorites() {
        loginPage.open()
                .logIn("stasgolovnev22@gmail.com", "375333631462Stas!");
        mainPage.isPageOpened()
                .isProjectVisible("Алиса")
                .isProjectInFavorites("Алиса")
                .isProjectDeletedFromFavorites("Алиса");
    }

    @Test
    public void checkCheckBoxes() {
        loginPage.open()
                .logIn("stasgolovnev22@gmail.com", "375333631462Stas!");
        mainPage.isPageOpened()
                .isCheckBoxesClickable("Projects")
                .isCheckBoxesClickable("Test Cases")
                .isCheckBoxesClickable("Test Runs");
    }

    @Test
    public void checkRemovingCheckBoxes() {
        loginPage.open()
                .logIn("stasgolovnev22@gmail.com", "375333631462Stas!");
        mainPage.isPageOpened()
                .isCheckBoxesClickable("Projects")
                .checkRemoveOfCheckBoxes("Projects");
    }

    @Test
    public void checkClearButton() {
        loginPage.open()
                .logIn("stasgolovnev22@gmail.com", "375333631462Stas!");
        mainPage.isPageOpened()
                .checkClearButton("Projects");
    }

    @Test(dataProvider = "navigationData", dataProviderClass = NavigationData.class)
    public void checkNavigation(String menuName, String expectedTitle, String expectedUrl) {
        loginPage.open()
                .logIn("stasgolovnev22@gmail.com", "375333631462Stas!");
        mainPage.isPageOpened()
                .checkOfNavigation(menuName, expectedTitle, expectedUrl);
    }

    @Test
    public void checkShowMoreButton() {
        loginPage.open()
                .logIn("stasgolovnev22@gmail.com", "375333631462Stas!");
        mainPage.isPageOpened()
                .useShowMoreButton();
    }
    @Test
    public void checkSwitchToProjectPage() {
        loginPage.open()
                .logIn("stasgolovnev22@gmail.com", "375333631462Stas!");
        mainPage.isPageOpened()
                .moveToProjectPage();
        projectPage.isPageOpened();
    }
}
