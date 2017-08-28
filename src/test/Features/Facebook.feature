# Created by NhatDell at 28-Aug-17
Feature: Facebook login feature

  @Facebook
  Scenario: Go to facebook
    Given I navigate to facebook
    And I enter username
    And I enter password
    And I click login button
    Then I should at checkpoint page