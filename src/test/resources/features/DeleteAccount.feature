@accountDelete @regression
Feature: As a user I should delete the my account

  Background:
    Given Navigate to url of webpage
    When The user goes to Signup - Login page

  Scenario Outline:
    When The user enters "<Email>" as email for login
    And The user enters "<Password>" as password
    And The user clicks Login button to login
    And The user clicks Delete Account button to delete the account
    Then Verify that 'ACCOUNT DELETED!' is visible and click Continue button
    Examples:
      | Email             | Password |
      | gulugulu@klip.com | elma     |
      | balbali@klip.com  | armut    |