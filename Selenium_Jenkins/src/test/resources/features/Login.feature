@Login 
Feature: Successfully login 

Scenario: Login to application 
	Given I am on the home page of Cars guide site 
	When I move to the menu 
		| Menu       |
		| buy + sell |
		| reviews    |
	And click on "Search Cars" link 
   