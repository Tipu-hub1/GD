Feature: Upright Forum Login

  Background: Page Open
    Given the Forum login Page is open


    Scenario: TC-111 valid user should be able to login to the application
      Given Login page is available
      When User enter his username
      When Use enter his password
      When User click on login button
      Then Verify that User should be navigated to the home page

# applying different sets of data on the same feature -- where in Scneario outline and
  # we keep our data under Exmaples
#    TestUser, Test@123
      Scenario Outline:TC-111 invalid user should not be able to login to the application
        Given Login page is available
        When User enter his <username>
        When Use enter his <password>
        When User click on login button
        Then Verify that User should receive an error msg
        Examples:
          |  username   | password |
          | "TestUser"  | "Test@321" |
          | "TestUser1" | "Test@123" |
          | "TestUser3" | "Test@321" |