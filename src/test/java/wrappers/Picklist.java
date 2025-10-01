package wrappers;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class Picklist {

    private final String label;

    public Picklist(String label) {
        this.label = label;
    }

    public static void selectOption(String label, String option) {
        getPicklistElement(label).selectOption(option);
    }

    private static SelenideElement getPicklistElement(String label) {
        return $x("//div[@class='form-group']//label[contains(text(),'" + label + "')]/following-sibling::*[1]");
    }
}
