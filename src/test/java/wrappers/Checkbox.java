package wrappers;

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
