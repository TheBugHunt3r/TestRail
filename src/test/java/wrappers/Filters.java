package wrappers;

import com.codeborne.selenide.SelenideElement;
import dto.NavigationData;
import org.testng.annotations.DataProvider;

import static com.codeborne.selenide.Selenide.$x;

public class Filters {

    private final String label;

    public Filters(String label) {
        this.label = label;
    }

    public static void select() {
        $x("//span[@id='groupByEmpty']").click();
    }

    public static void setOption(String option) {
         $x("//a[@class='dropdown-menu-link'][contains(text(), '" + option + "')]").click();
    }
}


