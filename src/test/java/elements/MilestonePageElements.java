package elements;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class MilestonePageElements {

    public final static SelenideElement ADD_MILESTONE = $x("//a[@id='navigation-milestones-add']");
    public final static SelenideElement ADD_MILESTONE_TITTLE = $x("//div[@class='content-header-title page_title']");
    public final static String DELETE_MILESTONE = "//a[contains(text(), '%s')]" +
            "/ancestor::div[@class='column summary-column flex-milestones-2 summary-column-first ']/following::div[@class='icon-small-delete ']";

    public static SelenideElement deleteMilestone(String label) {
        String xpath = String.format(DELETE_MILESTONE, label);
        return $x(xpath);
    }
}
