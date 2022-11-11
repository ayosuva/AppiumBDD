Feature:Sample Android Native App Test

  @search
  Scenario: search a car - first time user
    Given I am on Auto Trader App
    When I click Get Started button
    And I Click Accept button
    And I Click Skip button
    And I Click Search button
    Then I enter post code as 'GL11QX'
    And I click switch  Only show new car deals
    Then I Click Search button shown at the bottom
    Then I Validate search result msg
