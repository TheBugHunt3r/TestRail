package wrappers;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class Picklist {

    private final String label;

    public Picklist(String label) {
        this.label = label;
    }

    public void select(String option) {
        getPicklistElement().selectOption(option);
    }

    private SelenideElement getPicklistElement() {
        return $x(String.format("//label[contains(text(),'%s')]", label));
    }
}
