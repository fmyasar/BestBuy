@bestbuy
Feature: BestBuy Basic Tasks

  Background:
    Given user navigate to "https://www.bestbuy.com"

  @task1
  Scenario: Task-1 Page Title and Search Functionality
    Then user should see page title "Best Buy | Official Online Store | Shop Now & Save"
    When user search for "Drone"
    Then user should see results for "Drone"

  @task2
  Scenario: Task-2 Login Functionality
    When user navigate to sign in page
    And user enter valid credentials "fmyasar20@gmail.com" "Yezb2138." and push Enter
    Then user should be successfully login

  @task3
  Scenario: Task-3 Google Sign In and New Tab Functionality
    When user navigate to sign in page
    And user select sign in with google option
    Then user should be successfully login
    And user open new tab
    And user navigates to "page"
    Then user should be successfully login on the newly opened tab

  @task4
  Scenario: Task-4 Product Selection and Saved Item List Functionality
    When user select "Wireless Headphones" at Menu "Audio" "Headphones"
    And user filter brands by "Philips" and select from filtered results
    And user select "2" nd product on the search result page
    And user click save button on the product detail page
    And user opened Saved Items list
    Then user should see the title of saved item on the list