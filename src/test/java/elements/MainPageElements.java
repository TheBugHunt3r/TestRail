package elements;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class MainPageElements {

    // ===== Buttons =====
    public final static SelenideElement ADD_PROJECT_BUTTON = $x("//a[@data-testid='sidebarProjectsAddButton']");
    public final static SelenideElement LOGOUT_BUTTON = $x("//a[@tooltip-text='Log Out']");
    public final static SelenideElement SHOW_MORE_BUTTON = $x("//div[@id='filterNewSearchContent']//a[@id='category_show_more']");
    public final static SelenideElement CLEAR_BUTTON = $x("//div[@id='filter-category']//span[@class='search-filter-clear-button']" +
            "[normalize-space()='Clear']");
    public final static SelenideElement TEST_CHECKBOX = $x("//div[@id='searchFilterOption_category_4']");
    public final static SelenideElement ADD_TO_FAVORITES = $x("//a[@tooltip-text='Mark as project favorite.']");
    public final static SelenideElement DELETE_FROM_FAVORITE = $x("//a[@tooltip-text='Remove from project favorites.'][1]");
    public final static String CHECKBOX = "//label[normalize-space()='%s']";

    // ===== Inputs =====
    public final static SelenideElement SEARCH_PROJECT = $x("//input[@data-testid='searchProjectInput']");
    public final static SelenideElement TOP_SEARCH = $x("//input[@id='search_query']");
    public final static SelenideElement DROP_LINK = $x("//a[@id='navigation-user']");

    // ===== Labels =====
    public final static SelenideElement LOGO = $x("//div[@data-testid='testCaseContentHeaderTitle']");
    public final static SelenideElement FAB = $x("//img[@class='_pendo-image _pendo-badge-image _pendo-resource-center-badge-image']");
    public final static SelenideElement FAB_LOGO = $x("//h2[@class='bb-text _pendo-resource-center-home-title-text']");
    public final static SelenideElement ADD_PROJECT_TITLE = $x("//div[@data-testid='testCaseContentHeaderTitle']");
    public final static SelenideElement SEARCH_RESULT = $x("//div[@id='newSearchResultsContent']//p[1]");
    public final static SelenideElement ACTIVE_PROJECTS = $x("//h2[@id='activeHeader']");
    public final static SelenideElement PAGE_TITLE = $x("//div[@class='content-header-title page_title']");
    public final static String CHECK_BOX = "//label[normalize-space()='%s']";
    public final static String NAVIGATION = "//a[normalize-space()='%s']";
    // ===== String format locators =====
    private final static String DROPDOWN_MENU = "//a[contains(@class, 'dropdown-menu-link ') and contains(text(), '%s')]";
    private final static String PROJECT = "//div[@class='summary-title text-ppp']//a[contains(text(),'%s')]";
    private final static String ADD_STAR = "//a[@id='project-star-3' and following::a[contains(text(),'%s')]]";
    private final static String REMOVE_STAR = "//a[@id='project-starred-3' and following::a[contains(text(),'%s')]]";

    // ===== Active Locators =====
    public static SelenideElement chooseButton(String projectName) {
        String choose = String.format(DROPDOWN_MENU, projectName);
        return $x(choose);
    }

    public static SelenideElement project(String projectName) {
        String xpath = String.format(PROJECT, projectName);
        return $x(xpath);
    }

    public static SelenideElement favoriteStar(String projectName) {
        String xpath = String.format(ADD_STAR, projectName);
        return $x(xpath);
    }

    public static SelenideElement removeFavoriteStar(String projectName) {
        String xpath = String.format(REMOVE_STAR, projectName);
        return $x(xpath);
    }

    public static SelenideElement checkBox(String label) {
        String xpath = String.format(CHECK_BOX, label);
        return $x(xpath);
    }

    public static SelenideElement navigation(String menuName) {
        String xpath = String.format(NAVIGATION, menuName);
        return $x(xpath);
    }

}