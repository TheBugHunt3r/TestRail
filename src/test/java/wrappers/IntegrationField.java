package wrappers;

import com.codeborne.selenide.SelenideElement;
import elements.WrapperElements;

import static com.codeborne.selenide.Selenide.$x;
import static elements.WrapperElements.getIntegrationField;

public class IntegrationField {

    private final SelenideElement wrapper;

    public IntegrationField(SelenideElement wrapper) {
        this.wrapper = wrapper;
    }

    public static void setOption(String label, String text) {
        getIntegrationField(label).selectOption(text);
    }
}
