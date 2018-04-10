#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template

Feature: Login into LinkedIn
Keywords Summary : This test is to veify the LinkedIn Loin

  
  Scenario:  Login with valid credentails
    Given user navigate to LinkedIn.com
  
    When user enter username as "keerthyandy@gmail.com" and password "keerthi23"
    And user click on login button
    Then login should be successful
   
   Scenario: Login with Invalid data 
    Given user navigate to LinkedIn.com
  
    When user enter username as "keerthiandy@gmail.com" and password "keerthi23"
    And user click on login button
    Then login should not be successful

