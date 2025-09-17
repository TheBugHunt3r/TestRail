package wrappers;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class Input {

    private final SelenideElement wrapper;

    public Input(SelenideElement wrapper) {
        this.wrapper = wrapper;
    }

    public static void setNormalText(String label, String text) {
        $x("//label[contains(text(), '"+label+"')]/following-sibling::input[@class='form-control ']").shouldBe(visible);
        $x("//label[contains(text(), '"+label+"')]/following-sibling::input[@class='form-control ']").setValue(text);
    }
    public static void setBugText(String label, String text) {
        $x("//label[contains(text(), '"+label+"')]/following-sibling::input[@class='form-control']").shouldBe(visible);
        $x("//label[contains(text(), '"+label+"')]/following-sibling::input[@class='form-control']").setValue(text);
    }

}
