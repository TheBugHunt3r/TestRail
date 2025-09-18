package wrappers;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class IntegrationField {

    private final SelenideElement wrapper;

    public IntegrationField(SelenideElement wrapper) {
        this.wrapper = wrapper;
    }

    public static void setOption(String label, String text) {
        $x("//label[contains(., '" + label + "')]/following-sibling::div[contains(@class, 'searchable')]//select").selectOption(text);
    }
}
