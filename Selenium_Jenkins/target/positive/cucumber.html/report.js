$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/Login.feature");
formatter.feature({
  "name": "Successfully login",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Login"
    }
  ]
});
formatter.scenario({
  "name": "Login to application",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Login"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I am on the home page of \"https://www.carsguide.com.au/\" of Cars guide site",
  "keyword": "Given "
});
formatter.match({
  "location": "SearchCarsSteps.i_am_on_the_home_page_of_of_Cars_guide_site(String)"
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
formatter.after({
  "status": "passed"
});
});