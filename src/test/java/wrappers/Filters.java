package wrappers;

import static elements.WrapperElements.FILTER;
import static elements.WrapperElements.getFilter;

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


