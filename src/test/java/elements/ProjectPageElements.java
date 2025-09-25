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

}
