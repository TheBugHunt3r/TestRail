package elements;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class ToDoPageElements {

    // ===== Labels =====
    public final static SelenideElement TO_DO_TITLE = $x("//div[@data-testid='testCaseContentHeaderTitle']");
    public final static SelenideElement TEST_CASES_TITLE = $x("//div[@data-testid='testCaseContentHeaderTitle']");
    public final static SelenideElement TEST_RUN_LOGO = $x("//div[@class='content-header-id']");
    public final static SelenideElement TEST_CASE_ID = $x("//tr[@id='case-1']");
    public final static SelenideElement TEST_RUN_ID = $x("//tr[@class='odd run ']");

    // ===== Buttons =====
    public final static SelenideElement APPLY_FILTER_BUTTON = $x("//a[@class='button button-left" +
            " button-positive button-dark button-ok']");
    public final static SelenideElement FILTER_BUTTON = $x("//span[@id='filterByEmpty']");
    public final static SelenideElement REMOVE_GROUP_BUTTON = $x("//span[@id='groupByReset']//div[@class='icon-orderreset']");
    public final static SelenideElement REMOVE_GROUP_RUN = $x("//span[@id='filterReset']//div[@class='icon-orderreset']");
    public final static SelenideElement NEXT_BUTTON = $x("//div[@class='icon-direction-next']");
    public final static SelenideElement TEST_CASES_TAB = $x("//a[@id='navigation-todos-overview-cases']");

    // ===== Active Elements =====
    public final static SelenideElement TEST_RUN = $x("//a[@id='run-link-id-18']");
    public final static SelenideElement TESTS_RESULTS = $x("//a[@data-testid='navigateToRunStatusButton']");
    public final static SelenideElement FILTER_INPUT = $x("//div[@id='milestoneSelection_chosen']//input[@type='text']");
    public final static SelenideElement SORT_TEST_CASES = $x("//span[@id='orderByEmpty']");

    // ===== String format locators =====
    public final static String TEST_CASE = "//tr[@class='odd case ']//following-sibling::td//a[@id='case-link-id-%s']";
    public final static String CHOOSE_TEST_RUN = "//a[@id='run-link-id-%s']";
    public final static String GROUP_TEST_CASE = "//span[contains(text(), '%s')]";
    public final static String GROUP_TEST_RUN = "//span[contains(text(), '%s')]";
    public final static String FILTER_TEST_CASE = "//span[normalize-space()='%s']";
    public final static String FILTER_TEST_RUN = "//span[@class='checkbox-name text-ppp'][contains(text(), '%s')]";
    public final static String FILTER_TEST_CASE_TITLE = "//span[@id='filterByName'][contains(text(), '%s')]";
    public final static String FILTER_TEST_RUN_TITLE = "//span[@id='filterByName'][contains(text(), '%s')]";

    // ===== Active Locators =====
    public static SelenideElement chooseTC(String numTestCase) {
        String xpath = String.format(TEST_CASE, numTestCase);
        return $x(xpath);
    }

    public static SelenideElement chooseTR(String testRunID) {
        String xpath = String.format(CHOOSE_TEST_RUN, testRunID);
        return $x(xpath);
    }

    public static SelenideElement groupTC(String menuName) {
        String xpath = String.format(GROUP_TEST_CASE, menuName);
        return $x(xpath);
    }

    public static SelenideElement groupTR(String menuName) {
        String xpath = String.format(GROUP_TEST_RUN, menuName);
        return $x(xpath);
    }

    public static SelenideElement filterTR(String filterName) {
        String xpath = String.format(FILTER_TEST_RUN, filterName);
        return $x(xpath);
    }

    public static SelenideElement filterTRTitle(String filterName) {
        String xpath = String.format(FILTER_TEST_RUN_TITLE, filterName);
        return $x(xpath);
    }

    public static SelenideElement filterTC(String filterName) {
        String xpath = String.format(FILTER_TEST_CASE, filterName);
        return $x(xpath);
    }

    public static SelenideElement filterTCTitle(String filterName) {
        String xpath = String.format(FILTER_TEST_CASE_TITLE, filterName);
        return $x(xpath);
    }
}
