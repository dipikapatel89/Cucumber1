@LoginFeature @Regression

Feature: techfios billing login functionality validation


@Scenario1
Scenario: User should be login with invalid credentials
Given User is on techfios login page
When User enters username as "demo@techfios.com"
When User enters password as "abc123"
And User clicks on signin button
Then User should land on dashboard page

@Scenario1 @Smoke
Scenario Outline: User should be login with  valid credentials
Given User is on techfios login page
When User enters username as "<username>"
When User enters password as "<password>"
And User clicks on signin button
Then User should not land on dashboard page

Examples:
|username|password|

|demo2@techfios.com|abc123|
|demo@techfios.com|abc124|
|demo2@techfios.com|abc124|
|||

#@Scenario2
#Scenario: User should be login with invalid credentials
#Given User is on techfios login page
#When User enters username as "demo2@techfios.com"
#When User enters password as "abc123"
#And User clicks on signin button
#Then User should land on dashboard page

#@Scenario3 @Smoke
#Scenario: User should be login with invalid credentials
#Given User is on techfios login page
#When User enters username as "demo@techfios.com"
#When User enters password as "abc124"
#And User clicks on signin button
#Then User should land on dashboard page

#@Scenario4 @Smoke
#Scenario: User should be login with invalid credentials
#Given User is on techfios login page
#When User enters username as "demo2@techfios.com"
#When User enters password as "abc124"
#And User clicks on signin button
#Then User should land on dashboard page

#@Scenario5 @Smoke
#Scenario: User should be login with invalid credentials
#Given User is on techfios login page
#When User enters username as ""
#When User enters password as ""
#And User clicks on signin button
#Then User should land on dashboard page