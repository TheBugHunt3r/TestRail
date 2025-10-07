package stepdefs;

import com.codeborne.selenide.SelenideElement;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lombok.extern.slf4j.Slf4j;
import steps.LoginStep;
import tests.base.BaseTest;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$x;
import static elements.MainPageElements.project;

@Slf4j
public class ReportSteps extends BaseTest {

    protected final static SelenideElement REPORT_TAB = $x("//a[@data-testid='navigateToReportsButton']");
    protected final static SelenideElement REPORT_PAGE_LOGO = $x("//div[@data-testid='testCaseContentHeaderTitle']");
    protected final static SelenideElement NOTIFICATION = $x("//div[@class='empty-title']");
    LoginStep loginStep = new LoginStep();

    @Given("I am on the Project page")
    public void iAmOnTheProjectPage() {
        loginStep.testWithPositiveCred(user, password);
        project("Алиса").click();
    }

    @When("I click on the Reports tab")
    public void iClickOnTheReportsTab() {
        REPORT_TAB.click();
    }

    @Then("I should be navigated to Reports tab")
    public void iShouldBeNavigatedToReportsTab() {
        REPORT_PAGE_LOGO.shouldBe(visible);
    }

    @Then("I should see notification")
    public void iShouldSeeNotification() {
        NOTIFICATION.shouldBe(visible);
    }
}
