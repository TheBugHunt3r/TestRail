package dto;

import com.codeborne.selenide.SelenideElement;

import javax.swing.plaf.PanelUI;

import static com.codeborne.selenide.Selenide.$x;

public class Elements {

    public static SelenideElement ADD_PROJECT_BUTTON = $x("//a[@data-testid='sidebarProjectsAddButton']");
    public static SelenideElement LOGO = $x("//div[@data-testid='testCaseContentHeaderTitle']");
    public static SelenideElement FAB = $x("//img[@class='_pendo-image _pendo-badge-image _pendo-resource-center-badge-image']");
    public static SelenideElement FAB_LOGO = $x("//h2[@class='bb-text _pendo-resource-center-home-title-text']");
    public static SelenideElement DROP_LINK = $x("//a[@id='navigation-user']");
    public static SelenideElement LOGOUT_BUTTON = $x("//a[@tooltip-text='Log Out']");
    public static SelenideElement SEARCH_PROJECT = $x("//input[@data-testid='searchProjectInput']");
    public static SelenideElement TOP_SEARCH = $x("//input[@name='query']");
    public static SelenideElement ADD_PROJECT_TITLE = $x("//div[@data-testid='testCaseContentHeaderTitle']");
    public static SelenideElement SHOW_MORE_BUTTON = $x("//div[@id='filterNewSearchContent']//a[@id='category_show_more']");
    public static SelenideElement SEARCH_RESULT = $x("//div[@id='newSearchResultsContent']//p[1]");
    public static SelenideElement ACTIVE_PROJECTS = $x("//h2[@id='activeHeader']");
    public static SelenideElement CLEAR_BUTTON = $x("//div[@id='filter-category']//span[@class='search-filter-clear-button']" +
            "[normalize-space()='Clear']");
    public static SelenideElement TEST_CHECKBOX =  $x("//div[@id='searchFilterOption_category_4']");
    public static SelenideElement DELETE_FROM_FAVORITE = $x("//a[@id='project-starred-3']");
    public static SelenideElement ADD_TO_FAVORITES = $x("//a[@tooltip-text='Mark as project favorite.']");
    public static SelenideElement PAGE_TITLE = $x("//div[@class='content-header-title page_title']");
    public static SelenideElement CREATE_BUTTON = $x("//button[@data-testid='addEditProjectAddButton']");
    public static SelenideElement COMPLETE_LOGO = $x("//div[@class='message message-success']");
    public static SelenideElement DELETE_PROJECT_BUTTON = $x("//span[@class='dialog-confirm']/*");
    public static SelenideElement CONFIRM_DELETE_BUTTON = $x("//a[@data-testid='caseFieldsTabDeleteDialogButtonOk']");
    public static SelenideElement DELETE_LOGO = $x("//div[@data-testid='messageSuccessDivBox']");
    public static SelenideElement TO_DO_TITLE = $x("//div[@data-testid='testCaseContentHeaderTitle']");
    public static SelenideElement TEST_RUN = $x("//a[@id='run-link-id-13']");
    public static SelenideElement TESTS_RESULTS = $x("//a[@data-testid='navigateToRunStatusButton']");
    public static SelenideElement TEST_CASES_TAB = $x("//a[@id='navigation-todos-overview-cases']");
    public static SelenideElement TEST_CASE_ID = $x("//tr[@id='case-1']");
    public static SelenideElement TEST_RUN_ID = $x("//tr[@class='odd run ']");
    public static SelenideElement NEXT_BUTTON =  $x("//div[@class='icon-direction-next']");
    public static SelenideElement REMOVE_GROUP_BUTTON = $x("//div[@class='icon-orderreset']");
    public static SelenideElement TEST_RUN_LOGO = $x("//div[@class='content-header-id']");
    public static SelenideElement FILTER_INPUT = $x("//div[@id='milestoneSelection_chosen']//input[@type='text']");
    public static SelenideElement FILTER_BUTTON = $x("//span[@id='filterByEmpty']");
    public static SelenideElement APPLY_FILTER_BUTTON = $x("//a[@class='button button-left" +
            " button-positive button-dark button-ok']");

}
