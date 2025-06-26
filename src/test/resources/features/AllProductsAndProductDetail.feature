Feature: As a User should see the all products and detail of each product.

  Background:
    Given Navigate to url of webpage

  @wip
  Scenario: User sees a product detail with Products module without logging in
    When Click on Products button
    Then Verify user is navigated to 'ALL PRODUCTS' page succesfully
    And Verify products list is visible
    When Click on 'View Product' of first product
    Then Verify user is landed to product detail page
    And  Verify that detail is visible: 'product name', 'category', 'price', 'availability', 'condition' and 'brand'

