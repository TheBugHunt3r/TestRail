package elements;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class TestCasesPageElements {

    // ===== Buttons =====
    public static SelenideElement SORT_BUTTON = $x("//span[@id='orderByReset']" +
            "//div[@class='icon-orderreset']");

    // ===== Active Locators =====
    public static SelenideElement sortTitle(String title) {
        String xpath = String.format("//span[@id='orderByName'][contains(text(), '%s')]", title);
        return $x(xpath);
    }

}
