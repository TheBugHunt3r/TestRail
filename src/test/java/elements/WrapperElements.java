package elements;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class WrapperElements {

    // ===== Buttons =====
    public final static SelenideElement FILTER = $x("//span[@id='groupByEmpty']");

    // ===== String format locators =====
    public final static String CHECK_BOX = "//strong[normalize-space()='%s']";
    public final static String GET_FILTER = "//a[@class='dropdown-menu-link'][contains(text(), '%s')]";
    public final static String NORMAL_INPUT = "//label[contains(text(), '%s')]/following-sibling::input[@class='form-control ']";
    public final static String BUG_INPUT = "//label[contains(text(), '%s')]/following-sibling::input[@class='form-control']";
    public final static String INTEGRATION_FIELD = "//label[contains(., '%s')]/following-sibling::div[contains(@class, 'searchable')]//select";
    public final static String PICK_LIST = "//div[@class='form-group']//label[contains(text(),'%s')]/following-sibling::*[1]";
    public final static String RADIO_BUTTON = "//strong[text()='%s']";
    public final static String TEXT_AREA = "//label[normalize-space()='%s']/following-sibling::" +
            "div[@class='textarea-resizable']/child::textarea" +
            "[@class='form-control form-control-full processed textarea-with-grippie']";

    // ===== Active Locators =====
    public static SelenideElement checkbox(String label) {
        String check = String.format(CHECK_BOX, label);
        return $x(check);
    }

    public static SelenideElement getFilter(String option) {
        String filter = String.format(GET_FILTER, option);
        return $x(filter);
    }

    public static SelenideElement getNormalInput(String label) {
        String input = String.format(NORMAL_INPUT, label);
        return $x(input);
    }

    public static SelenideElement getBugInput(String label) {
        String input = String.format(BUG_INPUT, label);
        return $x(input);
    }

    public static SelenideElement getIntegrationField(String label) {
        String field = String.format(INTEGRATION_FIELD, label);
        return $x(field);
    }

    public static SelenideElement getPickList(String label) {
        String pick = String.format(PICK_LIST, label);
        return $x(pick);
    }

    public static SelenideElement getRadioButton(String label) {
        String radio = String.format(RADIO_BUTTON, label);
        return $x(radio);
    }

    public static SelenideElement getTextArea(String label) {
        String area = String.format(TEXT_AREA, label);
        return $x(area);
    }
}


