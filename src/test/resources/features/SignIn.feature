Feature: SignIn feature

  Background: 
    Given User is on retail website
   When User click on Sign in option
    
@SignIn
  Scenario: Verify user can sign in into Retail Application
    And User enter email 'smaisamh@gmail.com' and password 'Adamsho1@'
    And User click on login button
    Then User should be logged in into Account

 Scenario Outline: Verify user can sign in into Retail Application
   And User enter email '<email>' and password '<password>'
   And User click on login button
  Then User should be logged in into Account

 # Examples: 
  # | email                     | password  |
   # | transformers@tekschool.us | Tek@12345 |
   #  | phantom.test@gmail.com    | Tek@12345 |

  @SignUp
  Scenario: Verify user can create an account into Retail Website
    And User click on Create New Account button
    And User fill the signUp information with below data
      | name     | email | password | confirmPassword |
      | fullName | email | password | password        |
    And User click on SignUp button
    Then User should be logged into account page
