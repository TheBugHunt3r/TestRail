package tests;

import org.testng.annotations.Test;

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
    public void checkTopSearch() throws InterruptedException {
        loginPage.open().LogIn("stasgolovnev22@gmail.com", "375333631462Stas!");
        mainPage.isPageOpened()
                .useTopSearch("Алиса");
        Thread.sleep(2000);
    }
}
