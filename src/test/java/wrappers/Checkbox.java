package wrappers;

import static com.codeborne.selenide.Selenide.$x;

public class Checkbox {
    String label;

    public Checkbox(String label) {
        this.label = label;
    }
    public static void check(String label) {
        $x("//strong[normalize-space()='"+label+"']").click();
    }
}
