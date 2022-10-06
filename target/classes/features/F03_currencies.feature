@smoke
Feature: Change Currency
  Scenario: user change currency
    Given user select currency
    Then The price of items is with euro
