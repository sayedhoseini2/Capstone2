Feature: This feature is use for testing UI of Retail page

  @searchProduct
  Scenario: Verify user can search a product
    Given User is on retail website
    When User search for "pokemon" product
    Then The product should be displayed

  @DeptSidebar
  Scenario: Verify Shop by Department sidebar
    Given User is on retail website
    When User click on All section
    Then below options are present in shop by department sidebar
      | Electronics | Computers | Smart Home | Sports | Automative |

  @DeptSidebarOption
  Scenario Outline: Verify Department sidebar options
    Given User is on retail website
    When User click on All section
    And User on '<department>'
    Then below options are present in department
      | <optionOne> | <optionTwo> |

    Examples: 
      | department  | optionOne                      | optionTwo                |
      | Electronics | TV & Video                     | Video Games              |
      | Computers   | Accessories                    | Networking               |
      | Smart Home  | Smart Home Lightning           | Plugs and Outlets        |
      | Sports      | Athletic Clothing              | Exercise & Fitness       |
      | Automative  | Automative Parts & Accessories | MotorCycle & Powersports |

  @AddItemOnCard
  Scenario: Verify User can add an item to cart
    Given User is on retail website
    When User click on Sign in option
    And User enter email 'smaisamh@gmail.com' and password 'Adamsho1@'
    And User click on login button
    And User should be logged in into Account
    And User change the category to 'Smart Home'
    And User search for an item 'mini smart plug'
    And User click on Search icon
    And User click on item
    And User select quantity ‘2’
    And User click add to Cart button
    Then the cart icon quantity should change to ‘2’

  @AddOrderWithoutAddress
  Scenario: Verify User can place an order without Shipping address and payment Method on file
    Given User is on retail website
    When User click on Sign in option
    And User enter email 'smaisamh@gmail.com' and password 'Adamsho1@'
    And User click on login button
    And User should be logged in into Account
    And User change the category to 'Smart Home'
    And User search for an item 'mini smart plug'
    And User click on Search icon
    And User click on item
    And User select quantity ‘2’
    And User click add to Cart button
    Then the cart icon quantity should change to ‘2’
    And User click on Cart option
    And User click on Proceed to Checkout button
    And User click Add a new address link for shipping address
    And User fill new address form with below information
      | country | fullName | phoneNumber | StreetAddress | apt | city | state | zipcode |
    And User click Add Your Address button
    And User click Add a credit card or Debit Card for Payment method
    And User fill Debit or credit card information
      | cardNumber | nameOnCard | expirationMonth | expirationYear | securityCode |
      | cardNumber | nameOnCard | expirationMonth | expirationYear | securityCode |
    And User click on Add your card button
    And User click on Place Your Order
    Then a message should be displayed ‘Order Placed, Thanks’

  @AddOrderWithAddress
  Scenario: Verify User can place an order with Shipping address and payment Method on file
    Given User is on retail website
    When User click on Sign in option
    And User enter email 'smaisamh@gmail.com' and password 'Adamsho1@'
    And User click on login button
    And User should be logged in into Account
    And User change the category to 'Smart Home'
    And User search for an item ' mini smart plug '
    And User click on Search icon
    And User click on item
    And User select quantity ‘2’
    And User click add to Cart button
    Then the cart icon quantity should change to ‘2’
    And User click on Cart option
    And User click on Proceed to Checkout button
    And User click on Place Your Order
    Then a message should be displayed ‘Order Placed, Thanks’
