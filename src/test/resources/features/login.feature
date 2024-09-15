Feature: Valid Login

  Scenario: User logs in with valid credentials
    Given the user is on the login page
    When the user enters the username  and the password
    And clicks on the login button
    Then a welcome message should be displayed
