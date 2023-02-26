
Feature: Retail Application Account Feature

  Background: 
    Given User is on retail website
    When User click on Sign in option
    And User enter email 'smaisamh@gmail.com' and password 'Adamsho1@'
    And User click on login button
    And User should be logged in into Account
	
	
  Scenario: Verify User can update Profile Information
    When User click on Account option
    And User update Name 'transformers' and Phone '1012028855'
    And User click on Update button
    Then User profile information should be updated
    
  @AddAddressTest
    Scenario: Verify User can add an address
    When User click on Account option
    And User click on Add address option
    And User fill new address form with below information
    |country|fullName|phoneNumber|StreetAddress|apt|city|state|zipcode|
    And User click Add address button
    Then a message should be displayed "Address Added Successfully"