package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.WebElement;
import dto.Elements;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverConditions.urlContaining;
import static dto.Elements.*;

public class MainPage extends BasePage {

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
        SEARCH_RESULT.click();
        PAGE_TITLE.shouldBe(visible);
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
        ADD_TO_FAVORITES.click();
        ACTIVE_PROJECTS.shouldBe(visible);
        return this;
    }

    public MainPage isProjectDeletedFromFavorites(String projectName) {
        $x("//div[@id='project-3']//a[contains(text(),'" + projectName + "')]").shouldBe(visible);
        DELETE_FROM_FAVORITE.shouldBe(visible).click();
        ACTIVE_PROJECTS.shouldNotBe(visible);
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
        CLEAR_BUTTON.click();
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
       TEST_CHECKBOX.shouldBe(visible);
        return this;
    }
    public ProjectPage moveToProjectPage() {
        ADD_PROJECT_BUTTON.click();
        return new ProjectPage();
    }
}
