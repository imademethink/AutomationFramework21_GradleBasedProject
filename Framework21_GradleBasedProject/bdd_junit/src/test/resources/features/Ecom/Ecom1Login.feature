Feature: Demo of Page Object Model

  @ecom_login_valid @ecom_login
  Scenario: Login happy path case
    When Ecom user login with Username "creativity2020@mailinator.com" and Password "creativity2020@@"
    Then Ecom user login should be successful

  @ecom_login_invalid @ecom_login
  Scenario: Login un-happy path case
    When Ecom user login with Username "creativity2098@mailinator.com" and Password "creativity2098@@"
    Then Ecom user login should NOT be successful

  @dummy @ecom_login
  Scenario: dummy test2
    When dummy step2