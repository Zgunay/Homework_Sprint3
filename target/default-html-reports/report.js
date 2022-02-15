$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/Login.feature");
formatter.feature({
  "name": "HR user should be able to login  page",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Login as HR User",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user is on the login page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.sprint3.step_definitions.LoginStep.the_user_is_on_the_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify the user",
  "keyword": "Then "
});
formatter.match({
  "location": "com.sprint3.step_definitions.LoginStep.verify_the_user()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});