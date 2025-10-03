package elements;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class ProjectPageElements {

    // ===== Labels =====
    public final static SelenideElement COMPLETE_LOGO = $x("//div[@class='message message-success']");
    public final static SelenideElement DELETE_LOGO = $x("//div[@data-testid='messageSuccessDivBox']");

    // ===== Buttons =====
    public final static SelenideElement CREATE_BUTTON = $x("//button[@data-testid='addEditProjectAddButton']");
    public final static SelenideElement DELETE_PROJECT_BUTTON = $x("//span[@class='dialog-confirm']/*");
    public final static SelenideElement CONFIRM_DELETE_BUTTON = $x("//a[@data-testid='caseFieldsTabDeleteDialogButtonOk']");

    // ===== String format locators =====
    public final static String SWITCH_BUTTON = "//div[@class='tab-header']//a[contains(text(), '%s')]";
    public final static String CROSS_BUTTON = "//tr[@class='header']/following-sibling::" +
            "tr[@class='odd hoverSensitive']//td/child::a[contains(text(), '%s')]" +
            "//ancestor::tr//a//div[@class='icon-small-delete']";

    // ===== Active Locators =====
    public static SelenideElement switchPageButton(String label) {
        String xpath = String.format(SWITCH_BUTTON, label);
        return $x(xpath);
    }

    public static SelenideElement deleteCrossButton(String label) {
        String xpath = String.format(CROSS_BUTTON, label);
        return $x(xpath);
    }
}
