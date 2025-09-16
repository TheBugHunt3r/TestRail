package wrappers;

import static com.codeborne.selenide.Selenide.$x;

public class Checkbox {
    String label;

    public Checkbox(String label) {
        this.label = label;
    }
    public void select() {
        $x("//label[normalize-space()='"+label+"']").click();
    }

}
