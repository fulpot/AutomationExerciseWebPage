Feature: As a User I should see examples of Test Cases on Test Case module

  Background:
    Given Navigate to url of webpage

  Scenario: User checks the test cases without logging in
    When Click on Test Cases button
    Then Verify user is navigated to test cases page successfully
    And Verify there is 26 test cases on the page
    And Verify each test case has hyperlink tag with 'href' attribute and value contains with '#collapse'