Feature: As a User I should send to message to support team of the website

  Background:
    Given Navigate to url of webpage

  Scenario Outline: User sends a message with Contact Us module without logging in
    When Click on Contact Us button
    Then Verify 'GET IN TOUCH' is visible
    When Enter '<Name>', '<Email>', '<Subject>' and '<Message>'
    And Upload file
    And Click Submit button
    And Click OK button
    Then Verify success message 'Success! Your details have been submitted successfully.' is visible
    And Click Home button and verify that landed to home page successfully

    Examples:
      | Name   | Email               | Subject       | Message                                                                                                                                                                                                                                                                         |
      | Arnold | gulugulu22@klip.com | Wrong Product | Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nullam auctor, nunc eget ultricies tincidunt, velit velit bibendum velit, vel bibendum sapien nunc vel lectus. Fusce euismod, nunc sit amet aliquam lacinia,                                                           |
#      | Janny  | balbali22@klip.com  | Refund        | Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nullam auctor, nunc eget ultricies tincidunt, velit velit bibendum velit, vel bibendum sapien nunc vel lectus. Fusce euismod, nunc sit amet aliquam lacinia, nisi enim lobortis enim, vel lacinia nunc enim eget nunc. |