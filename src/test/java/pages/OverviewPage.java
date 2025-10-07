package pages;

import com.codeborne.selenide.SelenideElement;
import pages.base.BasePage;

import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.open;

public class OverviewPage extends BasePage {

    protected final static SelenideElement OVERVIEW_ACTIVE = $x("//a[@data-testid='navigateToMilestoneActivityButton']");

    public void openPage() {
        open(OVERVIEW_URL);
    }

    public void clickActivity() {
        OVERVIEW_ACTIVE.click();
    }
}