Feature: User login functionality

  Background: 
    Given the user is on the login page

  Scenario: Valid user login
    When the user enters a valid username and password
    Then the user is redirected to the dashboard
    And the user sees a welcome message

  Scenario: Invalid user login
    When the user enters an invalid username or password
    Then an error message is displayed
    But the user should not be redirected to the dashboard
