
@tag
Feature: Purchase the order from Ecommerce Website
  I want to use this template for my feature file

 @Regression
  Scenario Outline: Positive Test of Submitting the order
    Given I Landed on Ecommerce Page
    When wait for 5 seconds
    Then Logged in with username <name> and password <password>

    Examples: 
      | name    | password |
      |  pavanol| test@123 |
    
