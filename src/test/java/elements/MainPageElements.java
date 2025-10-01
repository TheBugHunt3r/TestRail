package elements;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$x;

public class MainPageElements {

    // ===== Buttons =====
    public static SelenideElement ADD_PROJECT_BUTTON = $x("//a[@data-testid='sidebarProjectsAddButton']");
    public static SelenideElement LOGOUT_BUTTON = $x("//a[@tooltip-text='Log Out']");
    public static SelenideElement SHOW_MORE_BUTTON = $x("//div[@id='filterNewSearchContent']//a[@id='category_show_more']");
    public static SelenideElement CLEAR_BUTTON = $x("//div[@id='filter-category']//span[@class='search-filter-clear-button']" +
            "[normalize-space()='Clear']");
    public static SelenideElement TEST_CHECKBOX =  $x("//div[@id='searchFilterOption_category_4']");
    public static SelenideElement ADD_TO_FAVORITES = $x("//a[@tooltip-text='Mark as project favorite.']");
    public static SelenideElement DELETE_FROM_FAVORITE = $x("//a[@tooltip-text='Remove from project favorites.'][1]");
    public static String CHECKBOX = "//label[normalize-space()='%s']";

    // ===== Inputs =====
    public static SelenideElement SEARCH_PROJECT = $x("//input[@data-testid='searchProjectInput']");
    public static SelenideElement TOP_SEARCH = $x("//input[@name='query']");
    public static SelenideElement DROP_LINK = $x("//a[@id='navigation-user']");

    // ===== Labels =====
    public static SelenideElement LOGO = $x("//div[@data-testid='testCaseContentHeaderTitle']");
    public static SelenideElement FAB = $x("//img[@class='_pendo-image _pendo-badge-image _pendo-resource-center-badge-image']");
    public static SelenideElement FAB_LOGO = $x("//h2[@class='bb-text _pendo-resource-center-home-title-text']");
    public static SelenideElement ADD_PROJECT_TITLE = $x("//div[@data-testid='testCaseContentHeaderTitle']");
    public static SelenideElement SEARCH_RESULT = $x("//div[@id='newSearchResultsContent']//p[1]");
    public static SelenideElement ACTIVE_PROJECTS = $x("//h2[@id='activeHeader']");
    public static SelenideElement PAGE_TITLE = $x("//div[@class='content-header-title page_title']");


    // ===== Active Locators =====
    public static SelenideElement chooseButton(String projectName) {
        String choose = String.format("//a[contains(@class, 'dropdown-menu-link ') and contains(text(), '%s')]", projectName);
        return $x(choose);
    }

    public static SelenideElement project(String projectName) {
        String xpath = String.format("//div[@class='summary-title text-ppp']//a[contains(text(),'%s')]", projectName);
        return $x(xpath);
    }

    public static SelenideElement favoriteStar(String projectName) {
        String xpath = String.format("//a[@id='project-star-3' and following::a[contains(text(),'%s')]]", projectName);
        return $x(xpath);
    }

    public static SelenideElement removeFavoriteStar(String projectName) {
        String xpath = String.format("//a[@id='project-starred-3' and following::a[contains(text(),'%s')]]", projectName);
        return $x(xpath);
    }

    public static SelenideElement checkBox(String label) {
        String xpath = String.format("//label[normalize-space()='%s']", label);
        return $x(xpath);
    }

    public static SelenideElement navigation(String menuName) {
        String xpath = String.format("//a[normalize-space()='%s']", menuName);
        return $x(xpath);
    }

}