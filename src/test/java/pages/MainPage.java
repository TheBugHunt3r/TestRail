package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.WebElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class MainPage extends BasePage {

    protected SelenideElement LOGO = $x("//div[@data-testid='testCaseContentHeaderTitle']");
    protected SelenideElement FAB = $x("//img[@class='_pendo-image _pendo-badge-image _pendo-resource-center-badge-image']");
    protected SelenideElement FAB_LOGO = $x("//h2[@class='bb-text _pendo-resource-center-home-title-text']");
    protected SelenideElement DROP_LINK = $x("//a[@id='navigation-user']");
    protected SelenideElement LOGOUT_BUTTON = $x("//a[@tooltip-text='Log Out']");
    protected SelenideElement SEARCH_PROJECT = $x("//input[@data-testid='searchProjectInput']");
    protected SelenideElement TOP_SEARCH = $x("(//input[@name='query'])");

    public MainPage isPageOpened() {
        LOGO.shouldBe(visible).shouldHave(
                text("Dashboard")
        );
        return this;
    }

    public MainPage isFabOpened() {
        FAB.shouldBe(visible)
                .click();
        FAB_LOGO.shouldBe(visible).shouldHave(
                text("Guides & Help")
        );
        return this;
    }

    public LoginPage logOut() {
        DROP_LINK.shouldBe(visible)
                .click();
        LOGOUT_BUTTON.shouldBe(visible)
                .click();
        return new LoginPage();
    }

    public MainPage searchProject(String projectName) {
        SEARCH_PROJECT.shouldBe(visible);
        SEARCH_PROJECT.setValue(projectName);
        $x("//a[contains(@class, 'dropdown-menu-link ') and contains(text(), '" + projectName + "')]").click();
        $x("//div[contains(@class, 'content-header-title page_title') and contains(text(), '" + projectName + "')]").shouldBe(visible);
        return this;
    }

    public MainPage useTopSearch(String projectName) {
        TOP_SEARCH.shouldBe(visible)
                .click();
        TOP_SEARCH.clear();
        //executeJavaScript("arguments[0].focus();", TOP_SEARCH);
        TOP_SEARCH.setValue(projectName);
        //$x("//strong[text()='P3']/../text()[contains(., '" + projectName + "')]").click();
        //$(byText(projectName)).click();
        return this;
    }
}
