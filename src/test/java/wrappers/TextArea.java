package wrappers;

import com.codeborne.selenide.SelenideElement;
import elements.WrapperElements;

import static com.codeborne.selenide.Selenide.$x;
import static elements.WrapperElements.getTextArea;

public class TextArea {
    private final SelenideElement wrapper;

    public TextArea(SelenideElement wrapper) {
        this.wrapper = wrapper;
    }

    public static void setText(String label, String text) {
        getTextArea(label).setValue(text);
    }
}
