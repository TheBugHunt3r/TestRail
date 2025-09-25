package steps;

import dto.Project;
import dto.ProjectFactory;
import pages.MainPage;
import pages.ProjectPage;

public class ProjectStep {

    LoginStep loginStep;
    MainPage mainPage;
    ProjectPage projectPage;

    public ProjectStep() {
        projectPage = new ProjectPage();
        mainPage = new MainPage();
        loginStep = new LoginStep();
    }

    public void isProjectCreated() {
        Project project = ProjectFactory.createProject("Default Access");
        loginStep.testWithPositiveCred("stasgolovnev22@gmail.com", "375333631462Stas!");
        mainPage.switchToProjectPage();
        projectPage.isPageOpened();
        projectPage.createProject(project, "Star");
    }

    public void isProjectDeleted() {
        Project project = ProjectFactory.createProject("Default Access");
        isProjectCreated();
        projectPage.deleteProject(project,"Star");
    }
}
