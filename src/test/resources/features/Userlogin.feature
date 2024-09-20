Feature: Login

  Scenario: Successful Login Functionality
    Given user navigates to the website "url"
    And there user logs in through Login Window by using Username as "student" and Password as "Password123"
    Then login must be successful.

  Scenario: Login Failed with wrong Username Functionality
    Given user navigates to the website "url"
    And there user logs in through Login Window by using Username as "student11" and Password as "Password123"
    Then login must be failed with wrong "username".

  Scenario: Login Failed with wrong Password Functionality
    Given user navigates to the website "url"
    And there user logs in through Login Window by using Username as "student" and Password as "Password456"
    Then login must be failed with wrong "passowrd".