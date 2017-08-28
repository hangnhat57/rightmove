# Created by NhatDell at 06-Jul-17
Feature: Search for a property
This feature is used for testing "Search for a propertyyyy"

  @regression
  Scenario: Search for a property to buy in Milton Keynes, min 2 bed, max 3 bed, price below £300,000.
    Given I navigate to home page
    And I enter Milton Keynes as location to search
    And I click on For sale button
    And I enter Price range from No min to 300,000
    And I enter Number of bedrooms from 2 to 3
    And I Click FindProperty button
    Then I should get the results for Properties For Sale in Milton Keynes, Buckinghamshire, up to £300,000, 2 – 3 bed
  @facebook
  Scenario: Go to facebook
    Given I navigate to facebook
    And I enter username
    And I enter password
    And I click login button
    Then I should at checkpoint page

Feature: Go to covesta page
  @facebook
  Scenario: Go to Covesta page
    Given  I navigate to covesta page
    And I should see the homepage