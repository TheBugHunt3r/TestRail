package wrappers;

import elements.WrapperElements;

import static com.codeborne.selenide.Selenide.$x;
import static elements.WrapperElements.FILTER;
import static elements.WrapperElements.getFILTER;

public class Filters {

    private final String label;

    public Filters(String label) {
        this.label = label;
    }

    public static void select() {
        FILTER.click();
    }

    public static void setOption(String option) {
        getFILTER(option).click();
    }
}


