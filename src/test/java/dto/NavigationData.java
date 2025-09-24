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

    @DataProvider(name = "groupTestCase")
    public Object[][] filterTestCase() {
        return new Object[][]{
                {"Status", "Status", "Design"},
                {"Day", "Day", "Wednesday, September 10, 2025"},
                {"Month", "Month", "September 2025"}
        };
    }

    @DataProvider(name = "groupTestRuns")
    public Object[][] groupTestRuns() {
        return new Object[][]{
                {"Milestone", "Milestone", "Design"},
//                {"Test Plan", "Test Plan", "Wednesday, September 10, 2025"}, Добавить уникальность
                {"Day", "Day", "September 2025"},
                {"Month", "Month", "September 2025"}
        };
    }

    @DataProvider(name = "sortTestCases")
    public Object[][] sortTestCases() {
        return new Object[][]{
                {"Assigned To", "Assigned To", "Assigned To"},
                {"Automation Type", "Automation Type", "Automation Type"},
                {"Created By", "Created By", "Created By"},
                {"Created On", "Created On", "Created On"},
                {"Deletion Status", "Deletion Status", "Deletion Status"},
                {"Estimate", "Estimate", "Estimate"},
                {"Forecast", "Forecast", "Forecast"},
                {"ID", "ID", "ID"},
                {"Labels", "Labels", "Labels"},
                {"Priority", "Priority", "Priority"},
                {"References", "References", "References"},
                {"Template", "Template", "Template"},
                {"Title", "Title", "Title"},
                {"Type", "Type", "Type"},
                {"Updated By", "Updated By", "Updated By"},
                {"Updated On", "Updated On", "Updated On"}
        };
    }
}