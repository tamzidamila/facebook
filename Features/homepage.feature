@Chrome
  Feature: Homepage of Facebook
    Scenario Outline: As an user I want to go to login page so that I can access the application.
      Given I am in homepage "https://www.facebook.com"
      When I enter "<username>" and "<password>"
      And click on login button
      Then I am in Incorrect Message Page, the "<message>" will be exist

      Examples:
      | username | password | message|
      | user1 | password1 | The password you’ve entered is incorrect. Forgot Password? |
