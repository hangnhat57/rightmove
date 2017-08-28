$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("SeachForAPropertyToBuy.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "# Created by NhatDell at 06-Jul-17"
    }
  ],
  "line": 2,
  "name": "Search for a property",
  "description": "This feature is used for testing \"Search for a propertyyyy\"",
  "id": "search-for-a-property",
  "keyword": "Feature"
});
formatter.before({
  "duration": 3277971985,
  "status": "passed"
});
formatter.scenario({
  "line": 22,
  "name": "Check expand search",
  "description": "",
  "id": "search-for-a-property;check-expand-search",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 21,
      "name": "@inter"
    }
  ]
});
formatter.step({
  "line": 23,
  "name": "I navigate to home page",
  "keyword": "Given "
});
formatter.step({
  "line": 24,
  "name": "I enter ol as location to search",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "I should see the expand search suggestion",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "The second line should be Olney, Buckinghamshire",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "The highlight should be Ol",
  "keyword": "And "
});
formatter.match({
  "location": "MyStepdefs.iNavigateToHomePage()"
});
formatter.result({
  "duration": 23863162855,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "ol",
      "offset": 8
    }
  ],
  "location": "MyStepdefs.iEnterMiltonKeynesAsLocationToSearch(String)"
});
formatter.result({
  "duration": 1012180688,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iShouldSeeTheExpandSearchSuggestion()"
});
formatter.result({
  "duration": 61795449,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Olney, Buckinghamshire",
      "offset": 26
    }
  ],
  "location": "MyStepdefs.theSecondLineShouldBe(String)"
});
formatter.result({
  "duration": 59050840,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Ol",
      "offset": 24
    }
  ],
  "location": "MyStepdefs.theHighlightShouldBe(String)"
});
formatter.result({
  "duration": 58437817,
  "status": "passed"
});
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "duration": 1687241978,
  "status": "passed"
});
});