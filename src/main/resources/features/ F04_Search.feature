@smoke
  Feature: search products
    Scenario Outline: user could search using product name
      Given user clicks on search bar
      When user enter productname as "<productname>"
      Then user succseefuly gets the products "<productname>"
      Examples:
        | productname |
        | book |
        | laptop |
        |  nike |
    Scenario Outline: User could search with product sku
      Given user clicks on search bar
      When user enter sku "<sku>" and click enter
      And user click on product from search result
      Then used "<sku>" shown in the product page
      Examples:
        | sku |
        | SCI_FAITH |
        | APPLE_CAM |
        | SF_PRO_11 |