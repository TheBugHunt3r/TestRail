package pages;

import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.open;

public class OverviewPage {

    public void openPage() {
        open("https://saucedemo111234555.testrail.io/index.php?/milestones/view/5");
    }

    public void clickActivity() {
        $x("//a[@data-testid='navigateToMilestoneActivityButton']").click();
    }
}