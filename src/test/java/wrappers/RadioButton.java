package wrappers;

import com.codeborne.selenide.SelenideElement;

import static elements.WrapperElements.getRadioButton;

public class RadioButton {
    private final SelenideElement wrapper;

    public RadioButton(SelenideElement wrapper) {
        this.wrapper = wrapper;
    }

    public static void select(String label) {
        getRadioButton(label).click();
        getRadioButton(label).isSelected();

    }
}
