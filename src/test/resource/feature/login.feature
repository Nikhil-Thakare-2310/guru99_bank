@Login-feature
Feature: Login Feature

Scenario Outline: User login successfully
	Given User has access to the website
	When User enters userId <UserId> and password <Password>
	And Clicks on Login button
	Then User login successfully
		
	Examples: 
	|	UserId		|	Password	|
	|	mngr510982	|	ErAdanY		|
		
		 
		
