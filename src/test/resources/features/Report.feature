Feature: Report navigation

  Scenario: Switch to the report page
    Given I am on the Project page
    When I click on the Reports tab
    Then I should be navigated to Reports tab
    Then I should see notification