package tests;

import org.testng.annotations.Test;

public class ProjectTest extends BaseTest {

    @Test
    public void checkCreateProject() throws InterruptedException {
        loginPage.open().LogIn("stasgolovnev22@gmail.com", "375333631462Stas!");
        mainPage.switchToProjectPage();
        projectPage.isPageOpened();
        projectPage.createProject();
        Thread.sleep(30000);
    }
}
