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
        logger.info("Проверка открытия главной страницы");
        LOGO.shouldBe(visible).shouldHave(
                text("Dashboard")
        );
        return this;
    }

    @Step("Проверка открытия FAB")
    public MainPage isFabOpened() {
        logger.info("Проверка открытия FAB");
        FAB.shouldBe(visible)
                .click();
        FAB_LOGO.shouldBe(visible).shouldHave(
                text("Guides & Help")
        );
        return this;
    }

    @Step("Выход из аккаунта")
    public LoginPage logOut() {
        logger.info("Выход из аккаунта");
        DROP_LINK.shouldBe(visible)
                .click();
        LOGOUT_BUTTON.shouldBe(visible)
                .click();
        return new LoginPage();
    }

    @Step("Поиск проекта по названию '{projectName}'")
    public MainPage searchProject(String projectName) {
        logger.info("Поиск проекта по названию");
        SEARCH_PROJECT.shouldBe(visible);
        SEARCH_PROJECT.setValue(projectName);
        chooseButton(projectName).click();
        return this;
    }

    @Step("Поиск проекта '{projectName}' с помощью главной поисковой строки")
    public MainPage useTopSearch(String projectName) {
        logger.info("Поиск проекта с помощью главной поисковой строки");
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
        logger.info("Переключение на страницу проекта");
        ADD_PROJECT_BUTTON.shouldBe(visible)
                .click();
        ADD_PROJECT_TITLE.shouldBe(visible);
        return new ProjectPage();
    }

    @Step("Проверка видимости проекта '{projectName}'")
    public MainPage isProjectVisible(String projectName) {
        logger.info("Проверка видимости проекта");
        project(projectName).shouldBe(visible);
        return this;
    }

    @Step("Проверка отображения проекта '{projectName}' в избранном")
    public MainPage isProjectInFavorites(String projectName) {
        logger.info("Проверка отображения проекта в избранном");
        favoriteStar(projectName).shouldBe(visible);
        favoriteStar(projectName).click();
        ACTIVE_PROJECTS.shouldBe(visible);
        return this;
    }

    @Step("Проверка удаления проекта '{projectName}' из избранного")
    public MainPage isProjectDeletedFromFavorites(String projectName) {
        logger.info("Проверка удаления проекта из избранного");
        removeFavoriteStar(projectName).shouldBe(visible);
        removeFavoriteStar(projectName).click();
        ACTIVE_PROJECTS.shouldNotBe(visible);
        return this;
    }

    @Step("Проверка выбора чекбокса '{label}'")
    public MainPage isCheckBoxesClickable(String label) {
        logger.info("Проверка выбора чекбокса");
        TOP_SEARCH.shouldBe(visible)
                .click();
        checkBox(label).click();
        checkBox(label).isSelected();
        return this;
    }

    @Step("Проверка удаления чекбокса '{label}'")
    public MainPage checkRemoveOfCheckBoxes(String label) {
        logger.info("Проверка удаления чекбокса");
        TOP_SEARCH.shouldBe(visible)
                .click();
        checkBox(label).click();
        checkBox(label).shouldNotBe(selected);
        return this;
    }

    @Step("Нажатие кнопки очищения")
    public MainPage useClearButton(String label) {
        logger.info("Нажатие кнопки очищения");
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
        logger.info("Проверка навигации по страницам");
        TOP_SEARCH.shouldBe(visible)
                .click();
        navigation(menuName).click();
        webdriver().shouldHave(urlContaining(expectedUrl));
        return this;
    }

    @Step("Нажатие кнопки 'Show More'")
    public MainPage useShowMoreButton() {
        logger.info("Нажатие кнопки 'Show More'");
        TOP_SEARCH.shouldBe(visible)
                .click();
        SHOW_MORE_BUTTON.click();
       TEST_CHECKBOX.shouldBe(visible);
        return this;
    }

    @Step("Переход на страницу проекта")
    public ProjectPage moveToProjectPage() {
        logger.info("Переход на страницу проекта");
        ADD_PROJECT_BUTTON.click();
        return new ProjectPage();
    }
}
