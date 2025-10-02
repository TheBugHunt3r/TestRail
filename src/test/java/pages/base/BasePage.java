package pages.base;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.LoginPage;

public class BasePage {

    public static final Logger logger = LoggerFactory.getLogger(BasePage.class);

    public final String BASE_URL = "https://saucedemo111234555.testrail.io/index.php?/auth/login/LWZhMDA0NWExYzgyM2Uy" +
            "NWUzMDVjMjE3ZmRjNzU1ZWEzMjJkOTZmNWY1MWEwODk0MDNjZDJhN2E1NTQ2YTEzM2Y:";
    public final String TO_DO_URL = "https://saucedemo111234555.testrail.io/index.php?/todos/overview/3";
    public final String TEST_CASES_URL =  "https://saucedemo111234555.testrail.io/index.php?/suites/view/3" +
            "&group_by=cases:section_id&group_order=asc&display=tree&display_deleted_cases=0";
    public final String PROJECT_URL = "https://saucedemo111234555.testrail.io/index.php?/admin/projects/add/1";

}
