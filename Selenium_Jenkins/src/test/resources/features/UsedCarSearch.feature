@Used-Search-Cars
Feature: Acceptance testing to validate Used Search cars page is working fine.
  In order to validate that
  the search cars page is working fine
  we will do the acceptance testing

  @Used-Search-Cars-Positive
  Scenario: Validate used search cars page
#    Given I am on the home page of "https://www.carsguide.com.au/" of Cars guide site
    When I move to the menu
      | Menu       |
      | buy + sell |
      | reviews    |
    And click on "Used" link on Used Search Car Page
    And select carbrand as "AUDI" from AnyMake dropdown on Used Search Car Page
    And select car model  on Used Search Car Page
      | car model |
      | A4        |
      | A3        |
    And select location as "SA - All" from SelectLocation dropdown on Used Search Car Page
    And select price as "$2,000" from price dropdown on Used Search Car Page
    And click on Find_My_Next_Car button on Used Search Car Page
    Then the page title should be "Used Audi A4 Under 2000 for Sale SA | carsguide"
