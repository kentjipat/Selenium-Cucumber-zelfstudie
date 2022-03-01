Feature: Add a todo
  In order to keep a list of todos
  As a user
  I want to create a todo

  Scenario Outline: Todo created
    Given I am on the VanillaJS Todo page
    When I create a new todo <todo>
    Then <todo> is added on the page

    Examples:
    |todo|
    |"new todo 1"|
    |"new todo 2"|

    @localtest
  Scenario Outline: Todo deleted
    Given I am on the VanillaJS Todo page
    When I create a new todo <todo>
    And I delete <todo>
    Then <todo> is no longer visible on the page

    Examples:
      | todo         |
      | "new todo 1" |
