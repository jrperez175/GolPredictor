#Author: jrperez

Feature: GolPredictor Loguin
  As a Web user 
  I want to use GolPredictor
  To loguin

  @Scenario_OK
  Scenario Outline: Login sucefull
    Given that jhon opens his browser at GolPredictor home page
    When he enter your data <user> <password> 
    Then he would see your bet

    Examples: 
      | user       | password |
      | jrperez175 | lj120501 |
