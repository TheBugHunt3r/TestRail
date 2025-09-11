package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class MainPage extends BasePage {

    protected SelenideElement logo = $(".top-section.top-section-info.project-text-wrap-ellipsis.link-tooltip");

    public MainPage isPageOpened() {
        logo.shouldBe(visible).shouldHave(
                text("TestRail QA")
        );
        return this;
    }
}
