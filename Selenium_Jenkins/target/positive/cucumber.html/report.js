$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/SearchCars.feature");
formatter.feature({
  "name": "Acceptance testing to validate search cars page is working fine.",
  "description": "  In order to validate that\n  the search cars page is working fine\n  we will do the acceptance testing",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Search-Cars"
    }
  ]
});
formatter.scenario({
  "name": "Validate search cars page",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Search-Cars"
    },
    {
      "name": "@Search-Cars-Positive"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I am on the home page of Cars guide site",
  "keyword": "Given "
});
formatter.match({
  "location": "SearchCarsSteps.i_am_on_the_home_page_of_of_Cars_guide_site()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I move to the menu",
  "rows": [
    {
      "cells": [
        "Menu"
      ]
    },
    {
      "cells": [
        "buy + sell"
      ]
    },
    {
      "cells": [
        "reviews"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "SearchCarsSteps.i_move_to_the_menu(String\u003e)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on \"Search Cars\" link",
  "keyword": "And "
});
formatter.match({
  "location": "SearchCarsSteps.click_on_link(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "select carbrand as \"BMW\" from AnyMake dropdown",
  "keyword": "And "
});
formatter.match({
  "location": "SearchCarsSteps.select_carbrand_as_from_AnyMake_dropdown(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "select carmodel as \"1 Series\" from SelectModel dropdown",
  "keyword": "And "
});
formatter.match({
  "location": "SearchCarsSteps.select_carmodel_as_from_SelectModel_dropdown(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "select location as \"QLD - All\" from SelectLocation dropdown",
  "keyword": "And "
});
formatter.match({
  "location": "SearchCarsSteps.select_location_as_from_SelectLocation_dropdown(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "select price as \"$1,000\" from price dropdown",
  "keyword": "And "
});
formatter.match({
  "location": "SearchCarsSteps.select_price_as_from_price_dropdown(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on Find_My_Next_Car button",
  "keyword": "And "
});
formatter.match({
  "location": "SearchCarsSteps.click_on_Find_My_Next_Car_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should see list of searched cars",
  "keyword": "Then "
});
formatter.match({
  "location": "SearchCarsSteps.i_should_see_list_of_searched_cars()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the page title should be \"Bmw 1 Series Under 1000 for Sale QLD | carsguide\"",
  "keyword": "And "
});
formatter.match({
  "location": "SearchCarsSteps.the_page_title_should_be(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});