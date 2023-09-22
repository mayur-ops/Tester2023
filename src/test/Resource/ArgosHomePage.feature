Feature: Argos homepage functionality

  @ShopButton
  Scenario: Argos home page functions

    Given user is on argos home page
    When user hover over the Shop button
    And user can see another window open and hover over the Techanology
    And user able to click on the televisions
    Then user should able to see all television related products

