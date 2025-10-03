package wrappers;

import elements.WrapperElements;

import static com.codeborne.selenide.Selenide.$x;
import static elements.WrapperElements.*;

public class Filters {

    private final String label;

    public Filters(String label) {
        this.label = label;
    }

    public static void select() {
        FILTER.click();
    }

    public static void setOption(String option) {
        getFilter(option).click();
    }
}


