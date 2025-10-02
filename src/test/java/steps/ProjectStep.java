package steps;

import dto.Project;
import dto.ProjectFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.MainPage;
import pages.ProjectPage;
import pages.base.BasePage;

public class ProjectStep {

    public static final Logger logger = LoggerFactory.getLogger(ProjectStep.class);

    LoginStep loginStep;
    MainPage mainPage;
    ProjectPage projectPage;

    public ProjectStep() {
        projectPage = new ProjectPage();
        mainPage = new MainPage();
        loginStep = new LoginStep();
    }

    public void isProjectCreated(String user, String password, String projectName,  String select, String option) {
        logger.info("Проверка создания проекта");
        Project project = ProjectFactory.createProject();
        loginStep.testWithPositiveCred(user, password);
        mainPage.switchToProjectPage();
        projectPage.isPageOpened();
        projectPage.createProject(project, projectName, select, option);
    }

    public void isProjectDeleted(String user, String password, String projectName, String select, String option) {
        logger.info("Проверка удаления проекта");
        Project project = ProjectFactory.createProject();
        isProjectCreated(user, password, projectName, select, option);
        projectPage.deleteProject(project, projectName);
    }
}
