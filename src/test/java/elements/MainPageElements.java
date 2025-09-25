package elements;

import com.codeborne.selenide.SelenideElement;

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
    public static SelenideElement DELETE_FROM_FAVORITE = $x("//a[@id='project-starred-3']");

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
}
