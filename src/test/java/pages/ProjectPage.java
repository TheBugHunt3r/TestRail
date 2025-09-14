package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$x;

public class ProjectPage extends BasePage{

    protected SelenideElement LOGO = $x("//div[@data-testid='testCaseContentHeaderTitle']");

    public ProjectPage isPageOpened() {
        LOGO.shouldBe(visible).shouldHave(
                text("Add Project")
        );
        return this;
    }
}
