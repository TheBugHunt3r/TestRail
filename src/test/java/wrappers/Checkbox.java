package wrappers;

import elements.WrapperElements;

import static com.codeborne.selenide.Selenide.$x;
import static elements.WrapperElements.checkbox;

public class Checkbox {
    String label;

    public Checkbox(String label) {
        this.label = label;
    }

    public static void check(String label) {
        checkbox(label).click();
    }
}
