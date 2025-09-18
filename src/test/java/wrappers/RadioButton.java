package wrappers;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class RadioButton {
    private final SelenideElement wrapper;

    public RadioButton(SelenideElement wrapper) {
        this.wrapper = wrapper;
    }

    public static void select(String label) {
        $x("//strong[text()='"+ label+"']").click();
        $x("//strong[text()='"+ label+"']").isSelected();

    }
}
