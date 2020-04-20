Feature: search test with github

  Scenario: Login on Github
    Given I open Login page of Github
    When I wait for Login page loaded
    And I sign in with default credentials on Login page of Github
    And I wait for Home page loaded
    Then I check that Home page is opened
    When I search for "thislisn/cucumber-spring"
    And I wait for Search Results page loaded
    Then I check that header name is "1 repository result"