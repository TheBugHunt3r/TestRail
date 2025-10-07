package stepdefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.MainPage;
import steps.LoginStep;
import tests.base.BaseTest;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.executeJavaScript;
import static elements.MainPageElements.*;


public class TopSearchStep extends BaseTest {

    LoginStep loginStep = new LoginStep();
    MainPage mainPage = new MainPage();

    @Given("I am on the Main page")
    public void iAmOnTheMainPage() {
        loginStep.testWithPositiveCred(user, password);
    }

    @When("I click on the top search")
    public void iClickOnTheTopSearch() {
        TOP_SEARCH.shouldBe(visible).click();
        executeJavaScript(
                "document.getElementById('search_query').value='Алиса';" +
                        "document.getElementById('search_query').dispatchEvent(new Event('input'));"
        );
        TOP_SEARCH.sendKeys("a");
    }

    @Then("I should see the project and click on him")
    public void iShouldSeeTheProjectAndClickOnHim() {
        SEARCH_RESULT.click();
        PAGE_TITLE.shouldBe(visible);
    }
}
