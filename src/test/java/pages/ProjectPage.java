package pages;

import dto.Project;
import elements.ProjectPageElements;
import io.qameta.allure.Step;
import pages.base.BasePage;
import wrappers.*;

import static elements.MainPageElements.LOGO;
import static elements.ProjectPageElements.*;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;
import static wrappers.Checkbox.check;
import static wrappers.Input.*;
import static wrappers.IntegrationField.setOption;
import static wrappers.Picklist.selectOption;
import static wrappers.RadioButton.select;
import static wrappers.TextArea.setText;

public class ProjectPage extends BasePage {

    @Step("Проверка открытия страницы проекта")
    public ProjectPage isPageOpened() {
        logger.info("Проверка открытия страницы проекта");
        LOGO.shouldBe(visible).shouldHave(
                text("Add Project")
        );
        return this;
    }

    @Step("Создание проекта с названием '{projectName}'")
    public ProjectPage createProject(Project project, String projectName) {
        logger.info("Создание проекта с названием");
        setNormalText("Name", projectName);
        setText("Announcement", project.getAnnouncement());
        check("Show the announcement on the overview page");
        check("Enable Test Case Approvals");
        select("Use multiple test suites to manage cases");
        select("Use a single repository for all cases (recommended)");
        switchPage("Access");
        selectOption("Default Access", "Tester");
        switchPage("Defects");
        setOption("Defect Plugin", "Asana");
        setBugText("Defect View Url", project.getDefect_view_url());;
        setBugText("Defect Add Url", project.getDefect_add_url());
        switchPage("References");
        setOption("Reference Plugin", "Asana");
        setBugText("Reference View Url", project.getReference_view_url());
        setBugText("Reference Add Url", project.getReference_add_url());
        switchPage("User Variables");
        CREATE_BUTTON.shouldBe(visible);
        CREATE_BUTTON.click();
        COMPLETE_LOGO.shouldBe(visible);
        return this;
    }

    @Step("Переход на страницу '{label}'")
    public ProjectPage switchPage(String label) {
        logger.info("Переход на следующею страницу");
        switchPageButton(label).click();
        return this;
    }

    @Step("Удаление проекта с названием '{projectName}'")
    public ProjectPage deleteProject(Project project, String projectName) {
        logger.info("Удаление проекта с названием");
        deleteSmallButton(projectName).click();
        DELETE_PROJECT_BUTTON.click();
        CONFIRM_DELETE_BUTTON.click();
        DELETE_LOGO.shouldBe(visible);
        return this;
    }
}
