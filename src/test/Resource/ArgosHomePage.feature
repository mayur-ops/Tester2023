Feature: Argos homepage functionality


  Background:
    Given user is on argos home page

  @ShopButton @Reg
  Scenario: Argos home page functions
    When user hover over the Shop button
    And user can see another window open and hover over the Techanology
    And user able to click on the televisions
    Then user should able to see all television related products


  @Clearance @Reg
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

  @SignIn @Reg
  Scenario Outline: Argos Account Login
    Given user click on the Account Button
    When user is on sign in page
    And user provide the email "<Username>"
    And user provide the password "<Password>"
    Then user able to sing in successfully

    Examples:
      | Username          |  | Password  |
      | mkp802002@aol.com |  | tester123 |

  @Technology @Reg
  Scenario: Argos Technology button
    Given User click on the technology button
    When User click on the Printers
    And User able to see all Printer items
    And User select the HP checkbox to see HP products
    And User select HP product



