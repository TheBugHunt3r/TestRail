package elements;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class TestCasesPageElements {

    // ===== Buttons =====
    public final static SelenideElement SORT_BUTTON = $x("//span[@id='orderByReset']" +
            "//div[@class='icon-orderreset']");

    // ===== String format locators =====
    public final static String SORT_TITLE = "//span[@id='orderByName'][contains(text(), '%s')]";

    // ===== Active Locators =====
    public static SelenideElement sortTitle(String title) {
        String xpath = String.format(SORT_TITLE, title);
        return $x(xpath);
    }

}
