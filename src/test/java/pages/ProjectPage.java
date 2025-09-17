package pages;

import com.codeborne.selenide.SelenideElement;
import wrappers.Checkbox;
import wrappers.Input;
import wrappers.RadioButton;
import wrappers.TextArea;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

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
        Input.setText("Name", "stas");
        TextArea.setText("Announcement", "Project");
        Checkbox.check("Show the announcement on the overview page");
        Checkbox.check("Enable Test Case Approvals");
        RadioButton.select("Use multiple test suites to manage cases");
        RadioButton.select("Use a single repository for all cases (recommended)");
        return this;
    }
}
