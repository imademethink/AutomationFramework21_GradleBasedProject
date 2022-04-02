Feature: Demo of Page Object Model

  @ecom_checkout
  Scenario: User journey upto checkout stage
    When Ecom user login with Username "creativity2020@mailinator.com" and Password "creativity2020@@"
    And  Ecom user attempts to search for "valid" item
    And  Ecom user adds item to cart and proceeds to checkout
    Then Selected items should be available in basket
