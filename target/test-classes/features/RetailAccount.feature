Feature: This Feature is for testing UI feature of Retail Application Account page

  Background: 
    Given User is on retail website
    When User click on Sign in option
    And User enter email 'smaisamh@gmail.com' and password 'Adamsho1@'
    And User click on login button
    And User should be logged in into Account

  @UpdateProfileInformation @Smoketest
  Scenario: Verify User can update Profile Information
    When User click on Account option
    And User update Name 'SayedHoseini' and Phone '4080000000'
    And User click on Update button
    Then User profile information should be updated

  

  @AddAddress @Smoketest
  Scenario: Verify User can add an address
  #Note to Teacher: DataGenrator makes this feature takes 2-3 min. to run.
    When User click on Account option
    And User click on Add address option
    And User fill new address form with below information
      | country | fullName | phoneNumber | StreetAddress | apt | city | state | zipcode |
      | country | fullName | phoneNumber | StreetAddress | apt | city | state | zipcode |
    And User click Add address button
    Then a message should be displayed 'Address Added Successfully'

  @EditAddress @Smoketest
  Scenario: Verify User can edit an Address added on account
  #Note to Teacher: DataGenrator makes this feature takes 2-3 min. to run.
    When User click on Account option
    And User click on edit address option
    And user fill new address form with below information
      | country | fullName | phoneNumber | StreetAddress | apt | city | state | zipcode |
      | country | fullName | phoneNumber | StreetAddress | apt | city | state | zipcode |
    And User click update Your Address button
    Then a message should be displayed ‘Address Updated Successfully’

  @RemoveAddress @Smoketest
  Scenario: Verify User can remove Address from Account
    When User click on Account option
    And User click on remove option of Address section
    Then Address details should be removed

  @AddPayement @Smoketest
  Scenario: Verify User can add a payment method
    When User click on Account option
    And User click on Add a payment method link
    And User fill Debit or credit card information
      | cardNumber | nameOnCard | expirationMonth | expirationYear | securityCode |
      | cardNumber | nameOnCard | expirationMonth | expirationYear | securityCode |
    And User click on Add your card button
    Then a message should be seen 'Payment Method added successfully'

  @EditPaymentMethod @Smoketest
  Scenario: Verify User can edit Debit or Credit card
    When User click on Account option
    And User click on Edit option of card section
    And user edit information with below data
      | cardNumber | nameOnCard | expirationMonth | expirationYear | securityCode |
      | cardNumber | nameOnCard | expirationMonth | expirationYear | securityCode |
    And user click on Update Your Card button
    Then a message should be displayed ‘Payment Method updated Successfully’

  @RemovePayment @Smoketest
  Scenario: Verify User can remove Debit or Credit card
    When User click on Account option
    And User click on remove option of card section
    Then payment details should be removed
