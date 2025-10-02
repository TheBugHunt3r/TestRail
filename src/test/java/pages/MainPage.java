package pages;

import com.codeborne.selenide.SelenideElement;
import elements.MainPageElements;
import io.qameta.allure.Step;
import pages.base.BasePage;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverConditions.urlContaining;

import static elements.MainPageElements.*;

public class MainPage extends BasePage {

    @Step("Проверка открытия главной страницы")
    public MainPage isPageOpened() {
        LOGO.shouldBe(visible).shouldHave(
                text("Dashboard")
        );
        return this;
    }

    @Step("Проверка открытия FAB")
    public MainPage isFabOpened() {
        FAB.shouldBe(visible)
                .click();
        FAB_LOGO.shouldBe(visible).shouldHave(
                text("Guides & Help")
        );
        return this;
    }

    @Step("Выход из аккаунта")
    public LoginPage logOut() {
        DROP_LINK.shouldBe(visible)
                .click();
        LOGOUT_BUTTON.shouldBe(visible)
                .click();
        return new LoginPage();
    }

    @Step("Поиск проекта по названию '{projectName}'")
    public MainPage searchProject(String projectName) {
        SEARCH_PROJECT.shouldBe(visible);
        SEARCH_PROJECT.setValue(projectName);
        chooseButton(projectName).click();
        return this;
    }

    @Step("Поиск проекта '{projectName}' с помощью главной поисковой строки")
    public MainPage useTopSearch(String projectName) {
        TOP_SEARCH.shouldBe(visible)
                .click();
        TOP_SEARCH.clear();
        TOP_SEARCH.setValue(projectName);
        SEARCH_RESULT.click();
        PAGE_TITLE.shouldBe(visible);
        return this;
    }

    @Step("Переключение на страницу проекта")
    public ProjectPage switchToProjectPage() {
        ADD_PROJECT_BUTTON.shouldBe(visible)
                .click();
        ADD_PROJECT_TITLE.shouldBe(visible);
        return new ProjectPage();
    }

    @Step("Проверка видимости проекта '{projectName}'")
    public MainPage isProjectVisible(String projectName) {
        project(projectName).shouldBe(visible);
        return this;
    }

    @Step("Проверка отображения проекта '{projectName}' в избранном")
    public MainPage isProjectInFavorites(String projectName) {
        favoriteStar(projectName).shouldBe(visible);
        favoriteStar(projectName).click();
        ACTIVE_PROJECTS.shouldBe(visible);
        return this;
    }

    @Step("Проверка удаления проекта '{projectName}' из избранного")
    public MainPage isProjectDeletedFromFavorites(String projectName) {
        removeFavoriteStar(projectName).shouldBe(visible);
        removeFavoriteStar(projectName).click();
        ACTIVE_PROJECTS.shouldNotBe(visible);
        return this;
    }

    @Step("Проверка выбора чекбокса '{label}'")
    public MainPage isCheckBoxesClickable(String label) {
        TOP_SEARCH.shouldBe(visible)
                .click();
        checkBox(label).click();
        checkBox(label).isSelected();
        return this;
    }

    @Step("Проверка удаления чекбокса '{label}'")
    public MainPage checkRemoveOfCheckBoxes(String label) {
        TOP_SEARCH.shouldBe(visible)
                .click();
        checkBox(label).click();
        checkBox(label).shouldNotBe(selected);
        return this;
    }

    @Step("Нажатие кнопки очищения")
    public MainPage useClearButton(String label) {
        TOP_SEARCH.shouldBe(visible)
                .click();
        checkBox(label).click();
        checkBox(label).isSelected();
        CLEAR_BUTTON.click();
        checkBox(label).shouldNotBe(selected);
        return this;
    }

    @Step("Проверка навигации по страницам '{menuName}'")
    public MainPage checkOfNavigation(String menuName, String expectedTitle, String expectedUrl) {
        TOP_SEARCH.shouldBe(visible)
                .click();
        navigation(menuName).click();
        webdriver().shouldHave(urlContaining(expectedUrl));
        return this;
    }

    @Step("Нажатие кнопки 'Show More'")
    public MainPage useShowMoreButton() {
        TOP_SEARCH.shouldBe(visible)
                .click();
        SHOW_MORE_BUTTON.click();
       TEST_CHECKBOX.shouldBe(visible);
        return this;
    }

    @Step("Переход на страницу проекта")
    public ProjectPage moveToProjectPage() {
        ADD_PROJECT_BUTTON.click();
        return new ProjectPage();
    }
}
