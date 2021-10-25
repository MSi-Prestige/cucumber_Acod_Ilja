Feature: Choose items
  We choose some items from shop

  Scenario: Choose items
    Given click on purchase
    Then clock Add to cart
    Then click shop basket
    Then click coupon code field
    Then add coupon "code" discount
    And click Apply coupon
    Then get subtotal and compare with Total
    And click proceed to checkout
    And click place order


    #10% discount  compare from if. acodemy10off
    # get Subtotal 55.00  - 10%  and compare with Total  49.50