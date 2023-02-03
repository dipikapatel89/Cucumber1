@LoginFromDbFeature @Regression

Feature: techfios billing login functionality validation with driving data from MySql DB


@Scenario1
Scenario: User should be login with valid credentials from DB
Given User is on techfios login page
When User enters "username" from techfios database
When User enters "password" from techfios database
And User clicks on signin button
Then User should land on dashboard page 

