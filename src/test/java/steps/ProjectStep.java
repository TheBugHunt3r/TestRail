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

    public void isProjectCreated(String user, String password, String projectName) {
        Project project = ProjectFactory.createProject();
        loginStep.testWithPositiveCred(user, password);
        mainPage.switchToProjectPage();
        projectPage.isPageOpened();
        projectPage.createProject(project, projectName);
    }

    public void isProjectDeleted(String user, String password, String projectName) {
        Project project = ProjectFactory.createProject();
        isProjectCreated(user, password, projectName);
        projectPage.deleteProject(project,projectName);
    }
}
