package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.WebElement;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverConditions.urlContaining;

public class MainPage extends BasePage {

    protected SelenideElement LOGO = $x("//div[@data-testid='testCaseContentHeaderTitle']");
    protected SelenideElement FAB = $x("//img[@class='_pendo-image _pendo-badge-image _pendo-resource-center-badge-image']");
    protected SelenideElement FAB_LOGO = $x("//h2[@class='bb-text _pendo-resource-center-home-title-text']");
    protected SelenideElement DROP_LINK = $x("//a[@id='navigation-user']");
    protected SelenideElement LOGOUT_BUTTON = $x("//a[@tooltip-text='Log Out']");
    protected SelenideElement SEARCH_PROJECT = $x("//input[@data-testid='searchProjectInput']");
    protected SelenideElement TOP_SEARCH = $x("//input[@name='query']");
    protected SelenideElement ADD_PROJECT_BUTTON = $x("//a[@data-testid='sidebarProjectsAddButton']");
    protected SelenideElement ADD_PROJECT_TITLE = $x("//div[@data-testid='testCaseContentHeaderTitle']");
    protected SelenideElement CLEAR_BUTTON = $x("");
    protected SelenideElement SHOW_MORE_BUTTON = $x("//div[@id='filterNewSearchContent']//a[@id='category_show_more']");

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
        TOP_SEARCH.setValue(projectName);
        $x("//div[@id='newSearchResultsContent']//p[1]").click();
        $x("//div[@class='content-header-title page_title']").shouldBe(visible);
        return this;
    }

    public ProjectPage switchToProjectPage() {
        ADD_PROJECT_BUTTON.shouldBe(visible)
                .click();
        ADD_PROJECT_TITLE.shouldBe(visible);
        return new ProjectPage();
    }

    public MainPage isProjectVisible(String projectName) {
        $x("//div[@class='summary-title text-ppp']//a[contains(text(),'" + projectName + "')]").shouldBe(visible);
        return this;
    }

    public MainPage isProjectInFavorites(String projectName) {
        $x("//div[@id='project-3']//a[contains(text(),'" + projectName + "')]").shouldBe(visible);
        $x("//a[@tooltip-text='Mark as project favorite.']").click();
        $x("//h2[@id='activeHeader']").shouldBe(visible);
        return this;
    }

    public MainPage isProjectDeletedFromFavorites(String projectName) {
        $x("//div[@id='project-3']//a[contains(text(),'" + projectName + "')]").shouldBe(visible);
        $x("//a[@id='project-starred-3']").shouldBe(visible).click();
        $x("//h2[@id='activeHeader']").shouldNotBe(visible);
        return this;
    }
    public MainPage isCheckBoxesClickable(String label) {
        TOP_SEARCH.shouldBe(visible)
                .click();
        $x("//label[normalize-space()='"+label+"']").click();
        $x("//label[normalize-space()='"+label+"']").isSelected();
        return this;
    }

    public MainPage checkRemoveOfCheckBoxes(String label) {
        TOP_SEARCH.shouldBe(visible)
                .click();
        $x("//label[normalize-space()='"+label+"']").click();
        $x("//label[normalize-space()='"+label+"']").shouldNotBe(selected);
        return this;
    }

    public MainPage checkClearButton(String label) {
        TOP_SEARCH.shouldBe(visible)
                .click();
        $x("//label[normalize-space()='"+label+"']").click();
        $x("//label[normalize-space()='"+label+"']").isSelected();
        $x("//div[@id='filter-category']//span[@class='search-filter-clear-button']" +
                "[normalize-space()='Clear']").click();
        $x("//label[normalize-space()='"+label+"']").shouldNotBe(selected);
        return this;
    }
    public MainPage checkOfNavigation(String menuName, String expectedTitle, String expectedUrl) {
        TOP_SEARCH.shouldBe(visible)
                .click();
        $x("//a[normalize-space()='"+ menuName +"']").click();
        webdriver().shouldHave(urlContaining(expectedUrl));
        return this;
    }
    public MainPage useShowMoreButton() {
        TOP_SEARCH.shouldBe(visible)
                .click();
        SHOW_MORE_BUTTON.click();
        $x("//div[@id='searchFilterOption_category_4']").shouldBe(visible);
        return this;
    }
    public ProjectPage moveToProjectPage() {
        ADD_PROJECT_BUTTON.click();
        return new ProjectPage();
    }
}
