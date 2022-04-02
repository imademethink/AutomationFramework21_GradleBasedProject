Feature: Demo of Page Object Model

  @ecom_register
  Scenario: User registration with provided data
    When Ecom user registration with following data
    Then Ecom user registration should be successful
