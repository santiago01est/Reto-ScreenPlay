Feature: Add product to cart

  Scenario: Add product to cart success
    Given that user open page Falabela and search any product
    When user click  on  a product
    And user selects quantity, adds and goes to cart
    Then user can read the product name and quantity chosen