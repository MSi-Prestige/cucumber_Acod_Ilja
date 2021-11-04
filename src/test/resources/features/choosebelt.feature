Feature: Choose Beanie
  We choose belt from shop

  Scenario: Choose beanie and buy
    Given click on purchase beanie
    Then click Add to cart
    Then click shop basket
    Then add coupon "acodemy10off" discount
    And click Apply coupon
    Then get subtotal and compare with Total
    Then click proceed to checkout
    And click place order