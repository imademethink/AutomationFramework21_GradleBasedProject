Feature: Demo of Page Object Model

  @ecom_search_valid @ecom_search
  Scenario: User searches for valid E-commerce items
    When Ecom user attempts to search for "valid" item
    Then Successful Ecom search results should be shown

  @ecom_search_invalid @ecom_search
  Scenario: User searches for invalid E-commerce items
    When Ecom user attempts to search for "invalid" item
    Then Successful Ecom search results should NOT be shown
