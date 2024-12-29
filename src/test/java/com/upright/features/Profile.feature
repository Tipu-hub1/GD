Feature: Verifying the Profile web application
 #Feature, Background, given (precondition), when (Action), then(Validation/test)
  Background: The Profile link is visible
    Given The profile link is loaded in the browser

  Scenario: TC103 Inserting all the Tool names
    When user get the input box
    Then the user user should be able to type the tool name
    When user get the documentation label
    Then the user user should be able to type the documentation tool name




