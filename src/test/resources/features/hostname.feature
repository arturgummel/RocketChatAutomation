Feature: Hostname

  @android
  Scenario: User enters invalid hostname on android
    Given user opens ANDROID application
    Then hostname view should be visible
    When user enters "https://open.rocket.chat" into hostname
    And user clicks on select button
    Then login view should be visible

    Scenario: User opens register form
      Given user opens ANDROID application
      When user enters "https://open.rocket.chat" into hostname
      And user clicks on select button
      And login view should be visible
      And user clicks on register button
      Then register view should be visible

    Scenario: In Android user types wrong username and password and clicks on login button
      Given user opens ANDROID application
      When user enters "https://open.rocket.chat" into hostname
      And user clicks on select button
      And login view should be visible
      And user types "testtest" username
      And user types "qwerty12345" password
      And user clicks on login button
      Then toast message error should be visible

  @iOS
  Scenario: User enters valid hostname on iOS
    Given user opens IOS application
    Then hostname view should be visible
    When user enters "https://open.rocket.chat" into hostname
    And user clicks on select button
    Then login view should be visible

    @browser
    Scenario: User opens valid host name on browser
      Given user opens BROWSER application
      When user opens "https://open.rocket.chat" url
      Then login view should be visible

      Scenario: User clicks on login button
        Given user opens BROWSER application
        When user opens "https://open.rocket.chat" url
        And login view should be visible
        And user clicks on login button
        Then username error message should be visible
        Then password error message should be visible

        Scenario: User types username and clicks on login button
          Given user opens BROWSER application
          When user opens "https://open.rocket.chat" url
          And login view should be visible
          And user types "test" username
          And user clicks on login button
          Then password error message should be visible

          Scenario: User types password and clicks on login button
            Given user opens BROWSER application
            When user opens "https://open.rocket.chat" url
            And login view should be visible
            And user types "qwerty123" password
            And user clicks on login button
            Then username error message should be visible

            Scenario: User types wrong username and password and clicks on login button
              Given user opens BROWSER application
              When user opens "https://open.rocket.chat" url
              And login view should be visible
              And user types "test" username
              And user types "qwerty123" password
              And user clicks on login button
              Then toast message error should be visible



