package wrappers;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class Input {

    private final SelenideElement wrapper;

    public Input(SelenideElement wrapper) {
        this.wrapper = wrapper;
    }

    public static void setText(String label, String text) {
        $x("//label[contains(text(), '"+label+"')]/following-sibling::input[@class='form-control ']").setValue(text);
    }

}
