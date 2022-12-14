Feature: installed and enabled Grammarly Chrome Extension
  user story: As a user, I want to verify Grammarly Extension is installed and enabled

  Scenario: User should see Grammarly extension installed
    Given User is in chrome extension page
    When  User see extension Grammarly on the page
    Then User should see "Grammarly: Grammar Checker and Writing App" as a title in  extension

  Scenario: User should see Grammarly extension enabled
    Given User is in chrome extension page
    When  User see extension Grammarly on the page
    And  User click on "details" button
    Then User should see "on" as status

    Scenario: Grammarly extension is correcting the misspelled words
      Given User opens google docs
      When User write "misslpled word"
      And  User right click on wrong word
      Then user should see another option for replace the word

  Scenario: Grammarly extension is not correcting the misspelled words for another language
    Given Given User opens google docs
    When User write "لثت اشتباه"
    And  User right click on wrong word
    Then user don't see another option for replace the word
