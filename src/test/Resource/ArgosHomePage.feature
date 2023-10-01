Feature: Argos homepage functionality


  Background:
    Given user is on argos home page

  @ShopButton
  Scenario: Argos home page functions
    When user hover over the Shop button
    And user can see another window open and hover over the Techanology
    And user able to click on the televisions
    Then user should able to see all television related products


  @Clearance
  Scenario: Argos clearance items
    And user able to click argos icon
    And user able to click on the clearance button
    When user click on the clothing button
    And user should able to see all clothing related products
    And user click on the men's sale button
    And user is on men's sale clothing items
    And user click £10-£15 check box
    And user should able to see all between £10-£15 range products
    Then user able to click on gray denim shoes
    And use select the size of the product
    And user add to trolley

