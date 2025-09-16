package wrappers;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class TextArea {
    private final SelenideElement wrapper;

    public TextArea(SelenideElement wrapper) {
        this.wrapper = wrapper;
    }

    public static void setText(String label, String text) {
        $x("//label[normalize-space()='"+label+"']/following-sibling::div[@class='textarea-resizable']" +
                "/child::textarea[@class='form-control form-control-full processed textarea-with-grippie']").setValue(text);
    }

}
