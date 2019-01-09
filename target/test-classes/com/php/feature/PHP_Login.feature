@LoginPageValidation
Feature: This feature file has validations related to login page like
checking user ID, password field and other validations.

@TC1
Scenario: User checks if he is able to launch the login page
Given URL is launched in the browser
When User clicks on Login from the menu options
Then user checks if the page login page is launched properly

@TC2
Scenario: User checks if he is able to provide email id to login
When Login page URL is launched in the browser
And User enters invalid email ID in the Email address field
And User enters password in the Password field
And User clicks Login button on the Login page
Then user checks if the system throws error

@TC3
Scenario: User checks if he is able to provide email id to login
#Given User chooses to launch chrome browser
When Login page URL is launched in the browser
And User enters the email ID in the Email address field
And User enters invalid password in the Password field
And User clicks Login button on the Login page
Then user checks if the system throws error

@TC4
Scenario: User checks if he is able to enter user ID and password
#Given User chooses to launch chrome browser
When Login page URL is launched in the browser
And User enters the email ID in the Email address field
And User enters password in the Password field
And User clicks Login button on the Login page
Then user checks if he is successfully logged into the PHP travels website
And User logs off from PHP Travels website

@TC5
Scenario: User checks if he has access to Hotel search page 
#Given User chooses to launch chrome browser
When Login page URL is launched in the browser
And User enters the email ID in the Email address field
And User enters password in the Password field
And User clicks Login button on the Login page
And User clicks on Hotels option from the menu
And User checks if he has landed on the hotels search page
And User navigates back to home page of the user
And User logs off from PHP Travels website

@TC6
Scenario: User checks if he has access to Flight search page 
#Given User chooses to launch chrome browser
When Login page URL is launched in the browser
And User enters the email ID in the Email address field
And User enters password in the Password field
And User clicks Login button on the Login page
And User clicks on Flights option from the menu
And User checks if he has landed on the flights search page
And User navigates back to home page of the user
And User logs off from PHP Travels website

@TC7
Scenario: User checks if he has access to Tours search page 
#Given User chooses to launch chrome browser
When Login page URL is launched in the browser
And User enters the email ID in the Email address field
And User enters password in the Password field
And User clicks Login button on the Login page
And User clicks on Tours option from the menu
And User checks if he has landed on the tours search page
And User navigates back to home page of the user
And User logs off from PHP Travels website

@TC8
Scenario: User checks if he has access to Cars search page 
#Given User chooses to launch chrome browser
When Login page URL is launched in the browser
And User enters the email ID in the Email address field
And User enters password in the Password field
And User clicks Login button on the Login page
And User clicks on Cars option from the menu
And User checks if he has landed on the cars search page
And User navigates back to home page of the user
And User logs off from PHP Travels website

@TC9
Scenario: User checks if he has access to Visa search page 
#Given User chooses to launch chrome browser
When Login page URL is launched in the browser
And User enters the email ID in the Email address field
And User enters password in the Password field
And User clicks Login button on the Login page
And User clicks on Visa option from the menu
And User checks if he has landed on the visa search page
And User navigates back to home page of the user
And User logs off from PHP Travels website

@TC10
Scenario: User checks if he has access to Blog page 
#Given User chooses to launch chrome browser
When Login page URL is launched in the browser
And User enters the email ID in the Email address field
And User enters password in the Password field
And User clicks Login button on the Login page
And User clicks on Blog option from the menu
And User checks if he has landed on the blogs page
And User navigates back to home page of the user
And User logs off from PHP Travels website

@TC11
Scenario: User checks if he has access to Offers page 
#Given User chooses to launch chrome browser
When Login page URL is launched in the browser
And User enters the email ID in the Email address field
And User enters password in the Password field
And User clicks Login button on the Login page
And User clicks on Offers option from the menu
And User checks if he has landed on the offers page
And User navigates back to home page of the user
And User logs off from PHP Travels website