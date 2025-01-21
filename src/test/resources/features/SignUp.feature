@signup @regression
Feature: As a user I should be able to sing up

  Background:
    Given Navigate to url of webpage
    When The user goes to Signup - Login page

  @signup @smoke
  Scenario Outline: Sign Up as a Tester
    And The user enters "<First Name>" as name
    And The user enters "<Email>" as email for signup
    And The user clicks "Signup" button to signup
    And The user fills details: "<Title>", "<First Name>", "<Email>", "<Password>", "<Date of birth>"
    And The user selects checkbox 'Sign up for our newsletter!'
    And The user selects 'Receive special offers from our partners!'
    And The user fills above details:
      | First Name    | <First Name>    |
      | Last Name     | <Last Name>     |
      | Company       | <Company>       |
      | Address       | <Address>       |
      | Address2      | <Address2>      |
      | Country       | <Country>       |
      | State         | <State>         |
      | City          | <City>          |
      | Zipcode       | <Zipcode>       |
      | Mobile Number | <Mobile Number> |
    And The User clicks Create Account button
    Then Verify that 'ACCOUNT CREATED!' is visible on the new page
    And The user clicks Continue button to go to the profile homepage
    And Verify that 'Logged in as <First Name>' is visible on the profile homepage
    Examples:
      | Title | First Name | Last Name | Email             | Password | Date of birth | Company | Address                | Address2 | Country       | State   | City   | Zipcode | Mobile Number |
      | Mr.   | Arnold     | Gerald    | gulugulu@klip.com | elma     | 1990-12-03    | Cat     | Cat CO. Cargus Street  | No 34    | United States | Alabama | Woka   | 32143   | +123432222    |
      | Mrs.  | Janny      | Bush      | balbali@klip.com  | armut    | 1998-05-10    | Dog     | Dog CO. Frieden Street | No 78    | United States | Texas   | Maicha | 94174   | +176395746    |

Scenario Outline: Register User with existing email
  And The user enters "<First Name>" as name
  And The user enters "<Email>" as email for signup
  And The user clicks "Signup" button to signup
  Then Verify error message 'Email Address already exist!' is visible
  Examples:
    | First Name | Email             |
    | Alex       | gulugulu@klip.com |
#    | Ulla       | balbali@klip.com  |