package elements;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class TestRunPageElements {

    // ===== Labels =====
    public final static SelenideElement TEST_RUN_LOGO = $x("//div[@data-testid='testCaseContentHeaderTitle']");

    // ===== Buttons =====
    public final static SelenideElement ADD_TEST_RUN_BUTTON = $x("//a[@data-testid='navigationRunsAdd']");
    public final static SelenideElement ADD_TEST_PLAN_BUTTON = $x("//a[@data-testid='navigationPlansAdd']");
    public final static SelenideElement SELECT_ALL_CHECKBOX = $x("//input[@name='select_all']");
    public final static String SMALL_DELETE = "//a[contains(text(), '%s')]" +
            "/ancestor::div[@class='summary-title text-ppp']/following::div[@class='column summary-column column-delete-run" +
            "-medium-first summary-column-first flex-milestones-3-medium summary-column-last']//a//div[@class='icon-small-delete']";
    public final static SelenideElement DELETE_OK_BUTTON = $x("//a[@data-testid='caseFieldsTabDeleteDialogButtonOk']");

    public final static SelenideElement DELETE_MESSAGE = $x("//div[@data-testid='messageSuccessDivBox']");

    public static SelenideElement deleteSmallButton(String label) {
        String xpath = String.format(SMALL_DELETE, label);
        return $x(xpath);
    }

}
