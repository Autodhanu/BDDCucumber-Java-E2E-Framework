Feature: Login Functionality for SpiceJet E-commerce Website

  As a user of the SpiceJet website
  I want to be able to log in with my account
  So that I can access my account-related features and manage my orders

  Background:
    Given I am on the SpiceJet login page


  Scenario Outline: successful login with valid credentials
    Given I click on Login Button
    And   I have entered valid "<username>" and "<password>"
    When  I click on the login button

  Examples:
      | username           | password  |
      | 8861236564         | Dhanu@18  |
      | dhanu.jnv@gmail.com| Dhanu@18  |
      | valid@email.com    | abccc     |
      