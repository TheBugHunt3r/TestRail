package tests;

import dto.Project;
import dto.ProjectFactory;
import org.testng.annotations.Test;

public class ProjectTest extends BaseTest {

    @Test
    public void checkCreateProject() {
        Project project = ProjectFactory.createProject("Default Access");
        loginPage.open().LogIn("stasgolovnev22@gmail.com", "375333631462Stas!");
        mainPage.switchToProjectPage();
        projectPage.isPageOpened();
        projectPage.createProject(project, "Star");
    }

    @Test
    public void checkDeleteProject() {
        Project project = ProjectFactory.createProject("Default Access");
        checkCreateProject();
        projectPage.deleteProject(project,"Star");
    }
}
