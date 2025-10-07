package steps;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.MilestonePage;

public class MilestoneStep {

    public static final Logger logger = LoggerFactory.getLogger(MilestoneStep.class);

    LoginStep loginStep;
    MilestonePage milestonePage;

    public MilestoneStep() {
        loginStep = new LoginStep();
        milestonePage = new MilestonePage();
    }

    public void isPageOpened(String user, String password) {
        logger.info("Проверка открытия страницы milestones");
        loginStep.testWithPositiveCred(user, password);
        milestonePage.openPage().isPageOpened();
    }

    public void addMilestone(String user, String password) {
        logger.info("Проверка кнопки добавления milestone");
        loginStep.testWithPositiveCred(user, password);
        milestonePage.openPage().isPageOpened();
        milestonePage.addMilestone();
    }

    public void selectAllMilestones(String user, String password) {
        logger.info("Проверка выбора всех тест ранов");
        loginStep.testWithPositiveCred(user, password);
        milestonePage.openPage().isPageOpened();
        milestonePage.selectAllMilestones();
    }

    public void deleteMilestones(String user, String password, String testRunName) {
        logger.info("Проверка удаления тест ранов");
        loginStep.testWithPositiveCred(user, password);
        milestonePage.openPage().isPageOpened();
        milestonePage.deleteMilestones(testRunName);
    }
}
