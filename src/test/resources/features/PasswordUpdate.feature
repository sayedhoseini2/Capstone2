@UpdatePassword @Smoketest
Feature: Updating Password

  # Note for teacher: I created separate password feature because everytime password changed and I was
  #trying to chnage password to previous password, test failed because password already changed.
  # with having separate feature, i was able to create independent Given line with previous password
  # as Given condition. It will helped with not messing other test cases login
  
  Scenario Outline: Verify User can Update password
    Given User is on retail website
    When User click on Sign in option
    And User enter email 'smaisamh@gmail.com' and password '<previousPassword>'
    And User click on login button
    And User should be logged in into Account
    When User click on Account option
    And User enter below information
      | previousPassword   | newPassword   | confirmPassword   |
      | <previousPassword> | <newPassword> | <confirmPassword> |
    And User click on Change Password button
    Then a message should be displayed2 'Password Updated Successfully'

    Examples: 
      | previousPassword | newPassword | confirmPassword |
      | Adamsho1@        | Aa123456@   | Aa123456@       |
      | Aa123456@        | Adamsho1@   | Adamsho1@       |
