@logout @regression
Feature: As a user I should log out my profile

@wip
  Scenario Outline: User tries to log aut the own profile
    Given Navigate to url of webpage
    When The user goes to Signup - Login page
    And The user enters "<Email>" as email for login
    And The user enters "<Password>" as password
    And The user clicks Login button to login
    And The users clicks Logout button
    Then Verify that user is navigated to login page

    Examples:
      | Email             | Password |
      | gulugulu@klip.com | elma     |
      | balbali@klip.com  | armut    |