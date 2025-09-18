package dto;

import org.testng.annotations.DataProvider;

public class NavigationData {

    @DataProvider(name = "navigationData")
    public Object[][] navigationData() {
        return new Object[][]{
                {"Projects", "Projects", "https://saucedemo111234555.testrail.io/index.php?/new_search/results&category[]=1"},
                {"Test Cases", "Test Cases", "https://saucedemo111234555.testrail.io/index.php?/new_search/results&category[]=2"},
                {"Test Runs", "Test Runs", "https://saucedemo111234555.testrail.io/index.php?/new_search/results&category[]=3"},
                {"Milestones", "Milestones", "https://saucedemo111234555.testrail.io/index.php?/new_search/results&category[]=4"},
                {"Test Suites", "Test Suites", "https://saucedemo111234555.testrail.io/index.php?/new_search/results&category[]=5"},
                {"Reports", "Reports", "https://saucedemo111234555.testrail.io/index.php?/new_search/results&category[]=6"},
                {"Cross-Project Reports", "Cross-Project Reports", "https://saucedemo111234555.testrail.io/index.php?/new_search/results&category[]=8"}
        };
    }

    @DataProvider(name = "navigationProjectPage")
    public Object[][] navigationProjectPage() {
        return new Object[][]{
                {"PROJECT", "PROJECT", "//a[@id='projects-tabs-project']"},
                {"ACCESS", "ACCESS", "//a[@id='projects-tabs-access']"},
                {"DEFECTS", "DEFECTS", "//a[@id='projects-tabs-defects']"},
                {"REFERENCES", "REFERENCES", "//a[@id='projects-tabs-references']"},
                {"USER VARIABLES", "USER VARIABLES", "//a[@id='users-fields-fields']"},
        };
    }
}