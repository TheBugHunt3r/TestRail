package pages;

import com.codeborne.selenide.SelenideElement;
import dto.Elements;
import wrappers.*;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static wrappers.Checkbox.check;
import static wrappers.Input.*;
import static wrappers.IntegrationField.setOption;
import static wrappers.RadioButton.select;

public class ProjectPage extends BasePage{

    protected SelenideElement LOGO = $x("//div[@data-testid='testCaseContentHeaderTitle']");
    protected SelenideElement ADD_PROJECT_BUTTON = $x("//a[@data-testid='sidebarProjectsAddButton']");
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

    public ProjectPage createProject() {
        setNormalText("Name", "stas");
        TextArea.setText("Announcement", "Project");
        check("Show the announcement on the overview page");
        check("Enable Test Case Approvals");
        select("Use multiple test suites to manage cases");
        select("Use a single repository for all cases (recommended)");
        switchPage("Access");
        Picklist.select("Default Access", "Tester");
        switchPage("Defects");
        setOption("Defect Plugin", "Asana");
        setBugText("Defect View Url", "https://saucedemo111234555.testrail.io/index.php?/admin/projects/add/%id%");;
        setBugText("Defect Add Url", "https://saucedemo111234555.testrail.io/index.php?/admin/projects/add/1");
        switchPage("References");
        setOption("Reference Plugin", "Asana");
        setBugText("Reference View Url", "https://saucedemo111234555.testrail.io/index.php?/admin/projects/add/%id%");
        setBugText("Reference Add Url", "https://saucedemo111234555.testrail.io/index.php?/admin/projects/add/1");
        switchPage("User Variables");
        Elements.ADD_PROJECT_BUTTON.shouldBe(visible);
        Elements.ADD_PROJECT_BUTTON.click();
        $x("//div[@class='message message-success']").shouldBe(visible);
        return this;
    }

    public ProjectPage switchPage(String label) {
        $x("//div[@class='tab-header']//a[contains(text(), '" + label + "')]").click();
        return this;
    }
}
