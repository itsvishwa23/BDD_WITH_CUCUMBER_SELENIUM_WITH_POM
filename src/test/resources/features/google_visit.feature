Feature: Visit Google.com

  Scenario: Open Google homepage
    Given I open the browser
    When I navigate to google
    Then I should see the Google homepage