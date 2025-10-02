package elements;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class WrapperElements {

    // ===== Buttons =====
    public static SelenideElement FILTER = $x("//span[@id='groupByEmpty']");

    // ===== Active Locators =====
    public static SelenideElement checkbox(String label) {
        String check = String.format("//strong[normalize-space()='%s']", label);
        return $x(check);
    }

    public static SelenideElement getFILTER(String option) {
        String filter = String.format("//a[@class='dropdown-menu-link'][contains(text(), '%s')]", option);
        return $x(filter);
    }

    public static SelenideElement getNormalInput(String label) {
        String input = String.format("//label[contains(text(), '%s')]/following-sibling::input[@class='form-control ']", label);
        return $x(input);
    }

    public static SelenideElement getBugInput(String label) {
        String input = String.format("//label[contains(text(), '%s')]/following-sibling::input[@class='form-control']", label);
        return $x(input);
    }

    public static SelenideElement getIntegrationField(String label) {
        String field = String.format("//label[contains(., '%s')]/following-sibling::div[contains(@class, 'searchable')]//select", label);
        return $x(field);
    }

    public static SelenideElement getPickList(String label) {
        String pick = String.format("//div[@class='form-group']//label[contains(text(),'%s')]/following-sibling::*[1]", label);
        return $x(pick);
    }

    public static SelenideElement getRadioButton(String label) {
        String radio = String.format("//strong[text()='%s']", label);
        return $x(radio);
    }

    public static SelenideElement getTextArea(String label) {
        String area = String.format("//label[normalize-space()='%s']/following-sibling::" +
                "div[@class='textarea-resizable']/child::textarea" +
                "[@class='form-control form-control-full processed textarea-with-grippie']", label);
        return $x(area);
    }
}


