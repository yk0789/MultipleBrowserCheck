#Author: yogesh.kumari0789@gmail.com
Feature: This is the test feature file for multiple browser related check

  @multiBrowser
  Scenario Outline: Search on google
    Given open google search using <browser>
    When search for <keyword>
    Then verify that search results are displayed
    And close browser

    Examples: 
      | browser | keyword            |
      | chrome  | selenium           |
      | firefox | automation testing |
      | safari  | manual testing     |
