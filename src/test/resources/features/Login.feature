@login @regression
Feature: As a user I should log in the my profile page

  Background:
    Given Navigate to url of webpage
    When The user goes to Signup - Login page

  @smoke
  Scenario Outline: User log in with valid credentials
    When The user enters "<Email>" as email for login
    And The user enters "<Password>" as password
    And The user clicks Login button to login
    Then Verify that 'Logged in as <Username>' is visible on the profile homepage
    And Verify that Logout button is visible und clickable
    Examples:
      | Email               | Password | Username |
      | gulugulu22@klip.com | elma     | Arnold   |
      | balbali22@klip.com  | armut    | Janny    |

  Scenario Outline: User tries to log in with invalid email
    When The user enters "<Email>" as email for login
    And The user enters "<Password>" as password
    And The user clicks Login button to login
    Then Verify error 'Your email or password is incorrect!' is visible
    Examples:
      | Email              | Password |
      | gulugulu2@klip.com | elma     |
      | gulgulu22@klip.com | elma     |
#      | balbali2@klip.com  | armut    |
#      | balbala2@klip.com  | armut    |

  Scenario Outline: User tries to log in with invalid password
    When The user enters "<Email>" as email for login
    And The user enters "<Password>" as password
    And The user clicks Login button to login
    Then Verify error 'Your email or password is incorrect!' is visible
    Examples:
      | Email              | Password |
#      | gulugulu22@klip.com | Elma     |
#      | gulugulu22@klip.com | ela      |
      | balbali22@klip.com | arMut    |
      | balbali22@klip.com | a5mut    |

  Scenario: User tries to log in without any credentials
    When The user clicks Login button to login
    Then Verify to be displayed "Please fill in this field." warning message Email Address input box

  Scenario: User tries to log in only with using email
    When The user enters "gulugulu@klip.com" as email for login
    And The user clicks Login button to login
    Then Verify to be displayed "Please fill in this field." warning message Password input box

  Scenario: User tries to log in only with using password
    When The user enters "elma" as password
    And The user clicks Login button to login
    Then Verify to be displayed "Please fill in this field." warning message Email Address input box