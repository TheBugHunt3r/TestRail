package pages;

import dto.Project;
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
import static wrappers.RadioButton.select;

public class ProjectPage extends BasePage {

    public final String PROJECT_URL = "https://saucedemo111234555.testrail.io/index.php?/admin/projects/add/1";


    public ProjectPage isPageOpened() {
        LOGO.shouldBe(visible).shouldHave(
                text("Add Project")
        );
        return this;
    }

    public ProjectPage openPage() {
        open(PROJECT_URL);
        return this;
    }

    public ProjectPage createProject(Project project, String projectName) {
        setNormalText("Name", projectName);
        TextArea.setText("Announcement", project.getAnnouncement());
        check("Show the announcement on the overview page");
        check("Enable Test Case Approvals");
        select("Use multiple test suites to manage cases");
        select("Use a single repository for all cases (recommended)");
        switchPage("Access");
        Picklist.select("Default Access", "Tester");
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

    public ProjectPage switchPage(String label) {
        $x("//div[@class='tab-header']//a[contains(text(), '" + label + "')]").click();
        return this;
    }

    public ProjectPage deleteProject(Project project, String projectName) {
        $x("//tr[@class='header']/following-sibling::tr[@class='odd hoverSensitive']" +
                "//td/child::a[contains(text(), '" + projectName + "')]//ancestor::tr" +
                "//a//div[@class='icon-small-delete']").click();
        DELETE_PROJECT_BUTTON.click();
        CONFIRM_DELETE_BUTTON.click();
        DELETE_LOGO.shouldBe(visible);
        return this;
    }
}
