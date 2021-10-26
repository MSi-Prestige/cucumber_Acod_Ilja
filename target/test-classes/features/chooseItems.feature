Feature: Choose items
  We choose some items from shop

  Scenario: Choose items
    Given click on purchase
    Then click Add to cart
    Then click shop basket
    Then add coupon "acodemy10off" discount
    And click Apply coupon
    Then get subtotal and compare with Total
    Then click proceed to checkout
    And click place order


    #10% discount  compare from if. acodemy10off
    # get Subtotal 55.00  - 10%  and compare with Total  49.50