Feature:Sample iOS Native App Test

  @something
  Scenario: Do something in integration app
    Given I am on integration app
    When I click Attributes
    Then I clear and enter Value as 'Yosuva'
    And I clear and enter Value1 as 'Arulanthu'
    And I Click Second toggle button