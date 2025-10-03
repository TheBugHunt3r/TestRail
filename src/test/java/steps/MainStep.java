package steps;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.LoginPage;
import pages.MainPage;
import pages.ProjectPage;

public class MainStep {

    public static final Logger logger = LoggerFactory.getLogger(MainStep.class);

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
        logger.info("Проверка поиска проекта");
        loginStep.testWithPositiveCred(user, password);
        mainPage.isPageOpened()
                .searchProject(projectName);
    }

    public void useTopSearch(String user, String password, String projectName) {
        logger.info("Проверка использования главной поисковой строки");
        loginStep.testWithPositiveCred(user, password);
        mainPage.isPageOpened()
                .useTopSearch(projectName);
    }

    public void clickAddProjectButton(String user, String password, String projectName) {
        logger.info("Проверка добавления проекта");
        loginStep.testWithPositiveCred(user, password);
        mainPage.isPageOpened()
                .switchToProjectPage();
    }

    public void isProjectVisible(String user, String password, String projectName) {
        logger.info("Проверка отображения проекта");
        loginStep.testWithPositiveCred(user, password);
        mainPage.isPageOpened()
                .isProjectVisible(projectName);
    }

    public void isProjectInFavorites(String user, String password, String projectName) {
        logger.info("Проверка добавления проекта в избранное");
        loginStep.testWithPositiveCred(user, password);
        mainPage.isPageOpened()
                .isProjectVisible(projectName)
                .isProjectInFavorites(projectName);
    }

    public void isProjectDeletedFromFavorites(String user, String password, String projectName) {
        logger.info("Проверка удаления проекта из избранного");
        loginStep.testWithPositiveCred(user, password);
        mainPage.isPageOpened()
                .isProjectVisible(projectName)
                .isProjectDeletedFromFavorites(projectName);
    }

    public void useCheckBoxes(String user, String password, String projectName,
                              String checkboxNameOne, String checkboxNameTwo, String checkboxNameThree) {
        logger.info("Проверка активации чек боксов");
        loginStep.testWithPositiveCred(user, password);
        mainPage.isPageOpened()
                .isCheckBoxesClickable(checkboxNameOne)
                .isCheckBoxesClickable(checkboxNameTwo)
                .isCheckBoxesClickable(checkboxNameThree);
    }

    public void areCheckBoxesRemoved(String user, String password, String projectName, String checkbox) {
        logger.info("Проверка удаления чекбоксов");
        loginStep.testWithPositiveCred(user, password);
        mainPage.isPageOpened()
                .isCheckBoxesClickable(checkbox)
                .checkRemoveOfCheckBoxes(checkbox);
    }

    public void useClearButton(String user, String password, String label) {
        logger.info("Проверка кнопки очищения");
        loginStep.testWithPositiveCred(user, password);
        mainPage.isPageOpened()
                .useClearButton(label);
    }

    public void useNavigation(String user, String password, String menuName, String expectedTitle, String expectedUrl) {
        logger.info("Проверка навигации");
        loginStep.testWithPositiveCred(user, password);
        mainPage.isPageOpened()
                .checkOfNavigation(menuName, expectedTitle, expectedUrl);
    }

    public void useShowMoreButton(String user, String password) {
        logger.info("Проверка кнопки 'Show more'");
        loginStep.testWithPositiveCred(user, password);
        mainPage.isPageOpened()
                .useShowMoreButton();
    }

    public void useSwitchToProjectPage(String user, String password) {
        logger.info("Проверка перехода на страницу проекта");
        loginStep.testWithPositiveCred(user, password);
        mainPage.isPageOpened()
                .moveToProjectPage();
        projectPage.isPageOpened();
    }
}
