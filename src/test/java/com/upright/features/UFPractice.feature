Feature: checking the practice page

  Background: Practice page is open
    Given the forum practice page is open

#    @Functional_Test
    Scenario: TC-105 Verify that dropdown functionality is working fine
      Given the page is available
      When user click on the down arrow sign
      Then he can select any option available

#      @SmokeTest
      Scenario: TC-106 Verify that HoverOver is working
        Given the page is available
        When user hover over on the element
        Then user can select Option2
        Then user can make a right click
        Then user can double click

#       @Functional_Test
        Scenario: TC-107 Verify that user can hand multiple windows
        Given the page is available
          When the user click on Open Window button
          Then validate that user can switch to the second window
          Then validate that use can return to the first window


        Scenario: TC-108 Verify that waits functionality working as expected
          Given the page is available
          When user click on clickhere button
          Then api testing text should appear


          Scenario: TC-109 Scroll up and Down functionality is working good
            Given the page is available
            Given user switch to uprightAutomation page
            When  user scroll down
            Then  user can find the element
