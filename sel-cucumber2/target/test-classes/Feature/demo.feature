Feature: Testing for different navigations menus
    I want to test different Navigations from Homepage
Background: 
Given Clear all test data before executing any scenario

@smoke 
Scenario: Navigation from Home page to Contact page using arguments
Given User is on WannaFlex Home page
When User clicks on "Contact" nav menu
Then User should go to "Contact" page

@regression
Scenario: Navigation from Home page to Freelance page using arguments
Given User is on WannaFlex Home page
When User clicks on "Freelance" nav menu
Then User should go to "Freelance" page