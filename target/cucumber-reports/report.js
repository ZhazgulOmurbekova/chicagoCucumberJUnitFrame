$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/wikipedia_features/wikiSearch.feature");
formatter.feature({
  "name": "Wikipedia search functionality verifications",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@wiki"
    }
  ]
});
formatter.scenario({
  "name": "Wikipedia Search Functionality Title Verification",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@wiki"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on Wikipedia home page",
  "keyword": "When "
});
formatter.match({
  "location": "WikiSearch_StepDefs.user_is_on_Wikipedia_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User types \"Steve Jobs\" in the wiki search box",
  "keyword": "And "
});
formatter.match({
  "location": "WikiSearch_StepDefs.user_types_in_the_wiki_search_box(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks wiki search button",
  "keyword": "And "
});
formatter.match({
  "location": "WikiSearch_StepDefs.user_clicks_wiki_search_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User sees \"Steve Jobs\" is in the wiki title",
  "keyword": "Then "
});
formatter.match({
  "location": "WikiSearch_StepDefs.user_sees_is_in_the_wiki_title(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Wikipedia Search Functionality Header Verification",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@wiki"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on Wikipedia home page",
  "keyword": "When "
});
formatter.match({
  "location": "WikiSearch_StepDefs.user_is_on_Wikipedia_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User types \"Steve Jobs\" in the wiki search box",
  "keyword": "And "
});
formatter.match({
  "location": "WikiSearch_StepDefs.user_types_in_the_wiki_search_box(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks wiki search button",
  "keyword": "And "
});
formatter.match({
  "location": "WikiSearch_StepDefs.user_clicks_wiki_search_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User sees \"Steve Jobs\" in the main header",
  "keyword": "Then "
});
formatter.match({
  "location": "WikiSearch_StepDefs.user_sees_in_the_main_header(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Wikipedia Search Functionality ImageHeader Verification",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@wiki"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on Wikipedia home page",
  "keyword": "When "
});
formatter.match({
  "location": "WikiSearch_StepDefs.user_is_on_Wikipedia_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User types \"Steve Jobs\" in the wiki search box",
  "keyword": "And "
});
formatter.match({
  "location": "WikiSearch_StepDefs.user_types_in_the_wiki_search_box(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks wiki search button",
  "keyword": "And "
});
formatter.match({
  "location": "WikiSearch_StepDefs.user_clicks_wiki_search_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User sees \"Steve Jobs\" in the image header",
  "keyword": "Then "
});
formatter.match({
  "location": "WikiSearch_StepDefs.user_sees_in_the_image_header(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "Wikipedia Search Functionality ImageHeader Verification",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@scenarioOutline"
    }
  ]
});
formatter.step({
  "name": "User is on Wikipedia home page",
  "keyword": "When "
});
formatter.step({
  "name": "User types \"\u003csearchValue\u003e\" in the wiki search box",
  "keyword": "And "
});
formatter.step({
  "name": "User clicks wiki search button",
  "keyword": "And "
});
formatter.step({
  "name": "User sees \"\u003cexpectedValue\u003e\" in the image header",
  "keyword": "Then "
});
formatter.examples({
  "name": "Test data for image header verification",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "searchValue",
        "expectedValue"
      ]
    },
    {
      "cells": [
        "Steve Jobs",
        "Steve Jobs"
      ]
    },
    {
      "cells": [
        "Bill Gates",
        "Bill Gates"
      ]
    },
    {
      "cells": [
        "Donald Trump",
        "Donald Trump"
      ]
    },
    {
      "cells": [
        "Ricky Martin",
        "Ricky Martin"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Wikipedia Search Functionality ImageHeader Verification",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@wiki"
    },
    {
      "name": "@scenarioOutline"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on Wikipedia home page",
  "keyword": "When "
});
formatter.match({
  "location": "WikiSearch_StepDefs.user_is_on_Wikipedia_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User types \"Steve Jobs\" in the wiki search box",
  "keyword": "And "
});
formatter.match({
  "location": "WikiSearch_StepDefs.user_types_in_the_wiki_search_box(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks wiki search button",
  "keyword": "And "
});
formatter.match({
  "location": "WikiSearch_StepDefs.user_clicks_wiki_search_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User sees \"Steve Jobs\" in the image header",
  "keyword": "Then "
});
formatter.match({
  "location": "WikiSearch_StepDefs.user_sees_in_the_image_header(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Wikipedia Search Functionality ImageHeader Verification",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@wiki"
    },
    {
      "name": "@scenarioOutline"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on Wikipedia home page",
  "keyword": "When "
});
formatter.match({
  "location": "WikiSearch_StepDefs.user_is_on_Wikipedia_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User types \"Bill Gates\" in the wiki search box",
  "keyword": "And "
});
formatter.match({
  "location": "WikiSearch_StepDefs.user_types_in_the_wiki_search_box(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks wiki search button",
  "keyword": "And "
});
formatter.match({
  "location": "WikiSearch_StepDefs.user_clicks_wiki_search_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User sees \"Bill Gates\" in the image header",
  "keyword": "Then "
});
formatter.match({
  "location": "WikiSearch_StepDefs.user_sees_in_the_image_header(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Wikipedia Search Functionality ImageHeader Verification",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@wiki"
    },
    {
      "name": "@scenarioOutline"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on Wikipedia home page",
  "keyword": "When "
});
formatter.match({
  "location": "WikiSearch_StepDefs.user_is_on_Wikipedia_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User types \"Donald Trump\" in the wiki search box",
  "keyword": "And "
});
formatter.match({
  "location": "WikiSearch_StepDefs.user_types_in_the_wiki_search_box(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks wiki search button",
  "keyword": "And "
});
formatter.match({
  "location": "WikiSearch_StepDefs.user_clicks_wiki_search_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User sees \"Donald Trump\" in the image header",
  "keyword": "Then "
});
formatter.match({
  "location": "WikiSearch_StepDefs.user_sees_in_the_image_header(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Wikipedia Search Functionality ImageHeader Verification",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@wiki"
    },
    {
      "name": "@scenarioOutline"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on Wikipedia home page",
  "keyword": "When "
});
formatter.match({
  "location": "WikiSearch_StepDefs.user_is_on_Wikipedia_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User types \"Ricky Martin\" in the wiki search box",
  "keyword": "And "
});
formatter.match({
  "location": "WikiSearch_StepDefs.user_types_in_the_wiki_search_box(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks wiki search button",
  "keyword": "And "
});
formatter.match({
  "location": "WikiSearch_StepDefs.user_clicks_wiki_search_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User sees \"Ricky Martin\" in the image header",
  "keyword": "Then "
});
formatter.match({
  "location": "WikiSearch_StepDefs.user_sees_in_the_image_header(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});