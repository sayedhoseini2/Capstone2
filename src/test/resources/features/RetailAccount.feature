Feature: Retail Application Account Feature

  Background: 
    Given User is on retail website
    When User click on Sign in option
    And User enter email 'smaisamh@gmail.com' and password 'Adamsho1@'
    And User click on login button
    And User should be logged in into Account

  @UpdateProfileInformation
  Scenario: Verify User can update Profile Information
    When User click on Account option
    And User update Name 'SayedHoseini' and Phone '4080000000'
    And User click on Update button
    Then User profile information should be updated

  @UpdatePassword
  Scenario: Verify User can Update password
    When User click on Account option
    And User enter below information
      | previousPassword | newPassword | confirmPassword |
      | previousPassword | newPassword | newPassword     |
    And User click on Change Password button
    Then a message should be displayed2 'Password Updated Successfully'

  @AddAddressTest
  Scenario: Verify User can add an address
    When User click on Account option
    And User click on Add address option
    And User fill new address form with below information
      | country | fullName | phoneNumber | StreetAddress | apt | city | state | zipcode |
    And User click Add address button
    Then a message should be displayed 'Address Added Successfully'

  @AddPayementMethod
  Scenario: Verify User can add a payment method
    When User click on Account option
    And User click on Add a payment method link
    And User fill Debit or credit card information
      | cardNumber | nameOnCard | expirationMonth | expirationYear | securityCode |
      | cardNumber | nameOnCard | expirationMonth | expirationYear | securityCode |
    And User click on Add your card button
    Then a message should be seen 'Payment Method added successfully'

  @EditPaymentMethod
  Scenario: Verify User can edit Debit or Credit card
    When User click on Account option
    And User click on Edit option of card section
    And user edit information with below data
      | cardNumber | nameOnCard | expirationMonth | expirationYear | securityCode |
      | cardNumber | nameOnCard | expirationMonth | expirationYear | securityCode |
    And user click on Update Your Card button
    Then a message should be displayed ‘Payment Method updated Successfully’

  @RemovePayment
  Scenario: Verify User can remove Debit or Credit card
    When User click on Account option
    And User click on remove option of card section
    Then payment details should be removed
