@LoginPage
Feature: Login Functionality

  @LoginWithValidCredentials
  Scenario: User login with valid credentials
    Given user is on login page
    When user enters valid username and password
    And user clicks on login button
    Then user should be redirected to Accounts Overview page

  @LoginWithInvalidCredentials
  Scenario Outline: User login with invalid credentials
    Given user is on login page
    When user enters username "<username>" and password "<password>"
    And user clicks on login button
    Then user should see login error message

    Examples: 
      | username  | password |
      | wronguser | wrong123 |
      | wronguser | demo     |
      | john      | wrong123 |

  @LoginWithBothBlankFields
  Scenario: User login with blank username and password
    Given user is on login page
    When user enters username "" and password ""
    And user clicks on login button
    Then user should see login error message

  @LoginWithBlankUsername
  Scenario: User login with blank username
    Given user is on login page
    When user enters username "" and password "demo"
    And user clicks on login button
    Then user should see login error message

  @LoginWithBlankPassword
  Scenario: User login with blank password
    Given user is on login page
    When user enters username "john" and password ""
    And user clicks on login button
    Then user should see login error message

   