Feature: After loging in the user try free shipping
         and reading the information about free shipping
         
         
Scenario: User is reading informtion about free shipping
Given I am landing on nike homepage
When I click on login link
And I need to provide the user details to login
And I click on free shipping see details link
And I click on standard shipping link and I search for shipping in get help search bar
Then I should display the search results
