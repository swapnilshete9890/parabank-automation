@TransferFund
Feature: Transfer Fund functionality

  @NavigateToTransferFund
  Scenario: Verify user should be able to navigate to transfer fund page
    Given user is on login page
    When user enters valid username and password
    And user clicks on login button
    And user clicks on Transfer Funds option
    Then user should see Transfer Funds page
    
    