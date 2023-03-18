Feature: This Feature is for testing UI of SignIn Page

  Background: 
    Given User is on retail website
    When User click on Sign in option

  @SignIn @SmokeTest
  Scenario: Verify user can sign in into Retail Application
    And User enter email 'smaisamh@gmail.com' and password 'Adamsho1@'
    And User click on login button
    Then User should be logged in into Account

  @SignUp @Smoketest
  Scenario: Verify user can create an account into Retail Website
    And User click on Create New Account button
    And User fill the signUp information with below data
      | name     | email | password | confirmPassword |
      | fullName | email | password | password        |
    And User click on SignUp button
    Then User should be logged into account page
