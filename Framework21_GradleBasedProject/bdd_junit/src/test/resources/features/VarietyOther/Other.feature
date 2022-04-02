Feature: Demo of Custom Page Object and Other Utilities

  @custom_page_object_forget_pwd @other
  Scenario: Custom page object - forget password
    When Navigate to forget password section
    Then Forget password activity should be successful

  @custom_page_pop_up @other
  Scenario: Custom page object - pop up
    When Navigate to pop up section
    Then Pop up activity should be successful

  @custom_page_multi_window @other
  Scenario: Custom page object - window handling
    When Navigate to window handling section
    Then Window handling activity should be successful

  @custom_page_iframe @other
  Scenario: Custom page object - iframe handling
    When Navigate to iframe handling section
    Then Iframe handling activity should be successful

  @robot_popup_close @other
  Scenario: Robot class - Javascript pop up handling
    When Navigate to javascript pop up handling section
    Then Javascript pop up handling activity should be successful

  @robot_google_ads_close @other
  Scenario: Robot class - Google ads close
    When Navigate to google ads handling section
    Then Googls ads handling activity should be successful

  @selenium_utility @other
  Scenario: Selenium utilities
    Then Perform scrolling
    Then Perform click using Javascript
