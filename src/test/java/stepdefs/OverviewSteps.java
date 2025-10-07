package stepdefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.OverviewPage;
import steps.LoginStep;
import tests.base.BaseTest;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$x;

public class OverviewSteps extends BaseTest {

    LoginStep loginStep = new LoginStep();
    OverviewPage overviewPage = new OverviewPage();

    @Given("I am on the Overview page")
    public void iAmOnTheOverviewPage() {
        loginStep.testWithPositiveCred(user, password);
        overviewPage.openPage();
    }

    @When("I click on the tab")
    public void iClickOnTheTab() {
        overviewPage.clickActivity();
    }

    @Then("I should be navigated to the section")
    public void iShouldBeNavigatedToTheSection() {
        $x("//h1[@class='top']").shouldBe(visible);
    }
}
