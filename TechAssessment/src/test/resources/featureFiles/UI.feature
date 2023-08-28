Feature: UI Scenarios
  
  Before:
  Given Setup the configuration

  Scenario: should list different request types, end points
    Given I navigate to the "https://reqres.in/"
    When I get the all request types and Endpoints
    Then should display all Endpoints

  Scenario: should display ‘samplerequestandresponse’details afters electing a specific option
    Given I navigate to the "https://reqres.in/"
    When I get the all requestB and responseBody
    Then should display all Request and Response Payloads

  Scenario: Should contain a button to navigate to support page
    Given I navigate to the "https://reqres.in/"
    When Click on support button
    Then navigate to support page

  Scenario: Support page_Should listoptions for one-time & monthly support
    Given I navigate to the "https://reqres.in/"
    When Click on support button
    Then Shouldlistoptionsforone-time&monthlysupport

  Scenario: Should provide Upgrade details
    Given I navigate to the "https://reqres.in/"
    When Click on support button
    And Click on Upgrade button in support page
    Then ShouldprovideUpgradedetails
