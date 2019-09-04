Feature: Guest user actions in Demo WebShop

@Regression
Scenario: Users choice to opt for an account
Given user access the signup page
And gets the credentials

@Sanity
Scenario: User access login page of the Demo Webshop
Given user has valid account creds for DemoWebShop
And provide the valid creds as inputs for the login process
Then verifies the state for the login status