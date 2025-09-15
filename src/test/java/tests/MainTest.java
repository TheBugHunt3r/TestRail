package tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import java.awt.*;
import dto.NavigationData;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.webdriver;
import static com.codeborne.selenide.WebDriverConditions.urlContaining;

public class MainTest extends BaseTest{

    @Test
    public void checkIsPageOpened() {
        loginPage.open().LogIn("stasgolovnev22@gmail.com", "375333631462Stas!");
        mainPage.isPageOpened();
    }

    @Test
    public void checkFab() {
        loginPage.open().LogIn("stasgolovnev22@gmail.com", "375333631462Stas!");
        mainPage.isFabOpened();
    }

    @Test
    public void checkLogOut() {
        loginPage.open().LogIn("stasgolovnev22@gmail.com", "375333631462Stas!");
        mainPage.logOut();
    }

    @Test
    public void checkSearchProject() {
        loginPage.open().LogIn("stasgolovnev22@gmail.com", "375333631462Stas!");
        mainPage.isPageOpened()
                .searchProject("Алиса");
    }

    @SuppressWarnings("checkstyle:Indentation")
    @Test
    public void checkTopSearch() {
        loginPage.open().LogIn("stasgolovnev22@gmail.com", "375333631462Stas!");
        mainPage.isPageOpened()
                .useTopSearch("Алиса");
    }

    @Test
    public void checkAddProjectButton() {
        loginPage.open()
                .LogIn("stasgolovnev22@gmail.com", "375333631462Stas!");
        mainPage.isPageOpened()
                .switchToProjectPage();
    }

    @Test
    public void checkVisibilityOfProject() {
        loginPage.open()
                .LogIn("stasgolovnev22@gmail.com", "375333631462Stas!");
        mainPage.isPageOpened()
                .isProjectVisible("Алиса");
    }

    @Test
    public void checkProjectInFavorites() {
        loginPage.open()
                .LogIn("stasgolovnev22@gmail.com", "375333631462Stas!");
        mainPage.isPageOpened()
                .isProjectVisible("Алиса")
                .isProjectInFavorites("Алиса");
    }

    @Test
    public void checkProjectDeletedFromFavorites() {
        loginPage.open()
                .LogIn("stasgolovnev22@gmail.com", "375333631462Stas!");
        mainPage.isPageOpened()
                .isProjectVisible("Алиса")
                .isProjectInFavorites("Алиса")
                .isProjectDeletedFromFavorites("Алиса");
    }

    @Test
    public void checkOfCheckBoxes() {
        loginPage.open()
                .LogIn("stasgolovnev22@gmail.com", "375333631462Stas!");
        mainPage.isPageOpened()
                .isCheckBoxesClickable("Projects")
                .isCheckBoxesClickable("Test Cases")
                .isCheckBoxesClickable("Test Runs");
    }

    @Test
    public void checkOfRemovingCheckBoxes() {
        loginPage.open()
                .LogIn("stasgolovnev22@gmail.com", "375333631462Stas!");
        mainPage.isPageOpened()
                .isCheckBoxesClickable("Projects")
                .checkRemoveOfCheckBoxes("Projects");
    }

    @Test
    public void checkClearButton() {
        loginPage.open()
                .LogIn("stasgolovnev22@gmail.com", "375333631462Stas!");
        mainPage.isPageOpened()
                .checkClearButton("Projects");
    }

    @Test(dataProvider = "navigationData", dataProviderClass = NavigationData.class)
    public void checkOfNavigation(String menuName, String expectedTitle, String expectedUrl) {
        loginPage.open()
                .LogIn("stasgolovnev22@gmail.com", "375333631462Stas!");
        mainPage.isPageOpened()
                .checkOfNavigation(menuName, expectedTitle, expectedUrl);
    }

    @Test
    public void checkShowMoreButton() {
        loginPage.open()
                .LogIn("stasgolovnev22@gmail.com", "375333631462Stas!");
        mainPage.isPageOpened()
                .useShowMoreButton();
    }
    @Test
    public void checkOfSwitchToProjectPage() {
        loginPage.open()
                .LogIn("stasgolovnev22@gmail.com", "375333631462Stas!");
        mainPage.isPageOpened()
                .moveToProjectPage();
        projectPage.isPageOpened();
    }
}
