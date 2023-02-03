$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("feature/TechFiosLoginFromDB.feature");
formatter.feature({
  "line": 3,
  "name": "techfios billing login functionality validation with driving data from MySql DB",
  "description": "",
  "id": "techfios-billing-login-functionality-validation-with-driving-data-from-mysql-db",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@LoginFromDbFeature"
    },
    {
      "line": 1,
      "name": "@Regression"
    }
  ]
});
formatter.before({
  "duration": 2585809800,
  "status": "passed"
});
formatter.scenario({
  "line": 7,
  "name": "User should be login with valid credentials from DB",
  "description": "",
  "id": "techfios-billing-login-functionality-validation-with-driving-data-from-mysql-db;user-should-be-login-with-valid-credentials-from-db",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 6,
      "name": "@Scenario1"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "User is on techfios login page",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "User enters \"username\" from techfios database",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "User enters \"password\" from techfios database",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "User clicks on signin button",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "User should land on dashboard page",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepsdefinations.user_is_on_techfios_login_page()"
});
formatter.result({
  "duration": 1433287500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "username",
      "offset": 13
    }
  ],
  "location": "LoginStepsdefinations.user_enters_from_techfios_database(String)"
});
formatter.result({
  "duration": 3591449300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "password",
      "offset": 13
    }
  ],
  "location": "LoginStepsdefinations.user_enters_from_techfios_database(String)"
});
formatter.result({
  "duration": 3119482400,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepsdefinations.user_clicks_on_signin_button()"
});
formatter.result({
  "duration": 4225191100,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepsdefinations.user_should_land_on_dashboard_page()"
});
formatter.result({
  "duration": 346593800,
  "status": "passed"
});
formatter.after({
  "duration": 965191300,
  "status": "passed"
});
});