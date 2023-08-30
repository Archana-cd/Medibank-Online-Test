#@Orange HRM
Feature: Test login functionality for Orange HRM website

  @OrangeHRM
  Scenario: Login functionality for Orange HRM website
    Given The user has opened Chrome browser
    When user enters url
    And User login to application using valid credentials
    Then User validate the home page