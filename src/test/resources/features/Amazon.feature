Feature: Amazon Shopping

Scenario: Add iPhone to cart
When User searches for "iPhone"
And Selects the product
And Adds product to cart
Then Verify price is displayed


Scenario: Add Galaxy device to cart
When User searches for "Samsung Galaxy"
And Selects the product
And Adds product to cart
Then Verify price is displayed