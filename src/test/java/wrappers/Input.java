package wrappers;

import com.codeborne.selenide.SelenideElement;
import elements.WrapperElements;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;
import static elements.WrapperElements.getBugInput;
import static elements.WrapperElements.getNormalInput;

public class Input {

    private final SelenideElement wrapper;

    public Input(SelenideElement wrapper) {
        this.wrapper = wrapper;
    }

    public static void setNormalText(String label, String text) {
        getNormalInput(label).shouldBe(visible);
        getNormalInput(label).setValue(text);
    }

    public static void setBugText(String label, String text) {
        getBugInput(label).shouldBe(visible);
        getBugInput(label).setValue(text);
    }

}
