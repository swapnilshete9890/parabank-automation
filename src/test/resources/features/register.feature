Feature: Register functionality

@ValidRegistration
  Scenario: User registers with valid details
    Given user is on login page
    When user clicks on register link
    And user enters registration details
      | firstName       | Ethan        |
      | lastName        | Hunt         |
      | address         | Baker Street |
      | city            | Los Angeles  |
      | state           | California   |
      | zipCode         |        12345 |
      | phone           |   1234567890 |
      | ssn             |        12345 |
      | username        | ethan123     |
      | password        | demo123      |
      | confirmPassword | demo123      |
    And user clicks on register button
    Then user should see successful registration message


@InvalidRegistration
  Scenario: User registers with invalid details
    Given user is on login page
    When user clicks on register link
    And user enters registration details
      | firstName       | Ethan        |
      | lastName        | Hunt         |
      | address         | Baker Street |
      | city            | Los Angeles  |
      | state           | California   |
      | zipCode         |       123456 |
      | phone           |   1234567890 |
      | ssn             |        12345 |
      | username        | ethan12399   |
      | password        | demo123      |
      | confirmPassword | wrong123     |
    And user clicks on register button
    Then user should see error message
