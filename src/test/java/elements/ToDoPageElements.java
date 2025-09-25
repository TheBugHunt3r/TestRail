package elements;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class ToDoPageElements {


    // ===== Labels =====
    public static SelenideElement TO_DO_TITLE = $x("//div[@data-testid='testCaseContentHeaderTitle']");
    public static SelenideElement TEST_CASES_TITLE = $x("//div[@data-testid='testCaseContentHeaderTitle']");
    public static SelenideElement TEST_RUN_LOGO = $x("//div[@class='content-header-id']");
    public static SelenideElement TEST_CASE_ID = $x("//tr[@id='case-1']");
    public static SelenideElement TEST_RUN_ID = $x("//tr[@class='odd run ']");

    // ===== Buttons =====
    public static SelenideElement APPLY_FILTER_BUTTON = $x("//a[@class='button button-left" +
            " button-positive button-dark button-ok']");
    public static SelenideElement FILTER_BUTTON = $x("//span[@id='filterByEmpty']");
    public static SelenideElement REMOVE_GROUP_BUTTON = $x("//div[@class='icon-orderreset']");
    public static SelenideElement NEXT_BUTTON =  $x("//div[@class='icon-direction-next']");
    public static SelenideElement TEST_CASES_TAB = $x("//a[@id='navigation-todos-overview-cases']");

    // ===== Active Elements =====
    public static SelenideElement TEST_RUN = $x("//a[@id='run-link-id-13']");
    public static SelenideElement TESTS_RESULTS = $x("//a[@data-testid='navigateToRunStatusButton']");
    public static SelenideElement FILTER_INPUT = $x("//div[@id='milestoneSelection_chosen']//input[@type='text']");
    public static SelenideElement SORT_TEST_CASES = $x("//span[@id='orderByEmpty']");
}
