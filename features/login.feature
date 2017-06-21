@featurelogin
Feature: I order to login 
         User needs to provide user information
 
 @scenariologin        
Scenario: User logining
 Given I am landing on nike homepage
 When I click on login link
 And I need to provide the user details to login
 Then I need to see the current page url