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
  "description": "This feature is used for testing \" Search for a property \"",
  "id": "search-for-a-property",
  "keyword": "Feature"
});
formatter.before({
  "duration": 3075321113,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "Search for a property to buy in Milton Keynes, min 2 bed, max 3 bed, price below £300,000.",
  "description": "",
  "id": "search-for-a-property;search-for-a-property-to-buy-in-milton-keynes,-min-2-bed,-max-3-bed,-price-below-£300,000.",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "I navigate to home page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I enter Milton Keynes as location to search",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I click on For sale button",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I enter Price range from No min to 300,000",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I enter Number of bedrooms from 2 to 3",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I Click FindProperty button",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I should get the results for Properties For Sale in Milton Keynes, Buckinghamshire, up to £300,000, 2 – 3 bed",
  "keyword": "Then "
});
formatter.match({
  "location": "MyStepdefs.iNavigateToHomePage()"
});
formatter.result({
  "duration": 3902222372,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Milton Keynes",
      "offset": 8
    }
  ],
  "location": "MyStepdefs.iEnterMiltonKeynesAsLocationToSearch(String)"
});
formatter.result({
  "duration": 724981292,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iClickOnForSaleButton()"
});
formatter.result({
  "duration": 2713737873,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "No min",
      "offset": 25
    },
    {
      "val": "300,000",
      "offset": 35
    }
  ],
  "location": "MyStepdefs.iEnterPriceRangeFromTo(String,String)"
});
formatter.result({
  "duration": 617898217,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2",
      "offset": 32
    },
    {
      "val": "3",
      "offset": 37
    }
  ],
  "location": "MyStepdefs.iEnterNoOfBedroomsFromTo(String,String)"
});
formatter.result({
  "duration": 328270995,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iClickFindPropertyButton()"
});
formatter.result({
  "duration": 4669693525,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Properties For Sale in Milton Keynes, Buckinghamshire, up to £300,000, 2 – 3 bed",
      "offset": 29
    }
  ],
  "location": "MyStepdefs.iShouldGetTheResultsForPropertiesForSaleInMiltonKeynesBuckinghamshireUpToÂ£Bed(String)"
});
formatter.result({
  "duration": 137128197,
  "status": "passed"
});
formatter.after({
  "duration": 1251226979,
  "status": "passed"
});
});