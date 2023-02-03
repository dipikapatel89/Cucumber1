@OtherLoginFeature @Regression	
Feature: techfios other login functionality validation

@OtherScenario1
Scenario: User should be login with valid credentials(Other)
Given User is on techfios login page
When User enters username as "demo@techfios.com"
When User enters password as "abc123"
And User clicks on signin button
Then User should land on dashboard page

@OtherScenario2
Scenario: User should be login with invalid credentials(Other)
Given User is on techfios login page
When User enters username as "demo2@techfios.com"
When User enters password as "abc123"
And User clicks on signin button
Then User should land on dashboard page

@OtherScenario3 @Smoke
Scenario: User should be login with invalid credentials(Other)
Given User is on techfios login page
When User enters username as "demo@techfios.com"
When User enters password as "abc124"
And User clicks on signin button
Then User should land on dashboard page