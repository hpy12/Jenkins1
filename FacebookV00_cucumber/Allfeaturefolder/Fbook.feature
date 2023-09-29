Scenario: Test the Login functionality
    Given user open a login page url in "edge" browser
    When user enter valid "problem_user" and valid "secret_sauce" and click on login button
    Then user is on home page