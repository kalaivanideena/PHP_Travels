$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("PHP_Login.feature");
formatter.feature({
  "line": 2,
  "name": "This feature file has validations related to login page like",
  "description": "checking user ID, password field and other validations.",
  "id": "this-feature-file-has-validations-related-to-login-page-like",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@LoginPageValidation"
    }
  ]
});
formatter.scenario({
  "line": 12,
  "name": "User checks if he is able to provide email id to login",
  "description": "",
  "id": "this-feature-file-has-validations-related-to-login-page-like;user-checks-if-he-is-able-to-provide-email-id-to-login",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 11,
      "name": "@TC2"
    }
  ]
});
formatter.step({
  "line": 13,
  "name": "Login page URL is launched in the browser",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "User enters invalid email ID in the Email address field",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "User enters password in the Password field",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "User clicks Login button on the Login page",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "user checks if the system throws error",
  "keyword": "Then "
});
formatter.match({
  "location": "PHP_LoginValidations_PageNavigations.login_page_URL_is_launched_in_the_browser()"
});
formatter.result({
  "duration": 17155546997,
  "status": "passed"
});
formatter.match({
  "location": "PHP_LoginValidations_PageNavigations.user_enters_invalid_email_ID_in_the_Email_address_field()"
});
formatter.result({
  "duration": 5724800150,
  "status": "passed"
});
formatter.match({
  "location": "PHP_LoginValidations_PageNavigations.user_enters_password_in_the_Password_field()"
});
formatter.result({
  "duration": 3684752625,
  "status": "passed"
});
formatter.match({
  "location": "PHP_LoginValidations_PageNavigations.user_clicks_Login_button_on_the_Login_page()"
});
formatter.result({
  "duration": 585609108,
  "status": "passed"
});
formatter.match({
  "location": "PHP_LoginValidations_PageNavigations.user_checks_if_the_system_throws_error()"
});
formatter.result({
  "duration": 2064708775,
  "status": "passed"
});
});