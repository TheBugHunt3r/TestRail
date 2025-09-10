package wrappers;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class Input {

    private final String label;

    public Input(String label) {
        this.label = label;
    }

    public void write(String text) {
        getInputElement().setValue(text);
    }

    private SelenideElement getInputElement() {
        return $x(String.format("//label[contains(text(),'%s')]", label));
    }
}
