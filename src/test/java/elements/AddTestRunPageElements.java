package elements;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class AddTestRunPageElements {

    // ===== Labels =====
    public final static SelenideElement ADD_TEST_RUN_LOGO = $x("//div[@data-testid='testCaseContentHeaderTitle']");
    public final static SelenideElement SUCCESS_ADDING = $x("//div[@class='message message-success']");
}
