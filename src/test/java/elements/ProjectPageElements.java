package elements;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class ProjectPageElements {

    // ===== Labels =====
    public static SelenideElement COMPLETE_LOGO = $x("//div[@class='message message-success']");
    public static SelenideElement DELETE_LOGO = $x("//div[@data-testid='messageSuccessDivBox']");

    // ===== Buttons =====
    public static SelenideElement CREATE_BUTTON = $x("//button[@data-testid='addEditProjectAddButton']");
    public static SelenideElement DELETE_PROJECT_BUTTON = $x("//span[@class='dialog-confirm']/*");
    public static SelenideElement CONFIRM_DELETE_BUTTON = $x("//a[@data-testid='caseFieldsTabDeleteDialogButtonOk']");

    // ===== Active Locators =====
    public static SelenideElement switchPageButton(String label) {
        String xpath = String.format("//div[@class='tab-header']//a[contains(text(), '%s')]", label);
        return $x(xpath);
    }

    public static SelenideElement deleteSmallButton(String label) {
        String xpath = String.format("//tr[@class='header']/following-sibling::" +
                "tr[@class='odd hoverSensitive']//td/child::a[contains(text(), '%s')]" +
                "//ancestor::tr//a//div[@class='icon-small-delete']", label);
        return $x(xpath);
    }

}
