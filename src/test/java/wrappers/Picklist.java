package wrappers;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;
import static elements.WrapperElements.getPickList;

public class Picklist {

    private final String label;

    public Picklist(String label) {
        this.label = label;
    }

    public static void selectOption(String label, String option) {
        getPicklistElement(label).selectOption(option);
    }

    private static SelenideElement getPicklistElement(String label) {
        return getPickList(label);
    }
}
