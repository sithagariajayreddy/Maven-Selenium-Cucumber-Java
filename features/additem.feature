Feature: User needs to login 
         In order to checkout the item
         
Scenario: Check out the item
Given I am landing on nike homepage
When I click on login link
And I need to provide the user details to login
And I click on mens shoes
And I add the item to cart 
And I select the size of the item and then I checkout the item
Then I need to see the current page url
