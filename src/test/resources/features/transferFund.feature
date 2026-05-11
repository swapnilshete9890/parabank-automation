@TransferFund
Feature: Transfer Fund functionality

  @NavigateToTransferFund
  Scenario: Verify user should be able to navigate to transfer fund page
    Given user is on login page
    When user enters valid username and password
    And user clicks on login button
    And user clicks on Transfer Funds link
    Then user should see Transfer Funds page

  @UIValidationOfTransferFunds
  Scenario: Verify UI elements of Transfer Funds Page
    Given user is on login page
    When user enters valid username and password
    And user clicks on login button
    And user clicks on Transfer Funds link
    Then user should see amount field, from account dropdown, to account dropdown and transfer button

  @TransferFundSuccessfully
  Scenario: Verify user able to transfer amount from one account to another account successfully
    Given user is on login page
    When user enters valid username and password
    And user clicks on login button
    And user clicks on Transfer Funds link
    And user enters amount
    And user selects account number from from account and to account dropdown
    And user clicks on Transfer button
    Then user should see successful transfer message
