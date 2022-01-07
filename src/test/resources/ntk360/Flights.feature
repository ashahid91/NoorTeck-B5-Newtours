Feature: Flight Search Feature

Scenario: Searching for flight
	Given User is on flight page
	When User click on one-way radio button
	And User choose passanger  "3"
	And User User choose departing from  "New York"
	And User choose from month  "1"
	And User choose from date  "5"
	And User choose arriving distantion  "London"
	And User choose returning date "31"
	And User click on first class radio
	And User click on continue button
	Then User verify  "After flight finder – No Seats Available"
	
	