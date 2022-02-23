Feature: Add a todo
  In order to keep a list of todos
  As a user
  I want to create a todo

  @localtest
  Scenario Outline: Todo created
    Given I am on the VanillaJS Todo page
    When I create a new todo <todo>
    Then <todo> is added on the page

    Examples:
    |todo|
    |"new todo 1"|
    |"new todo 2"|
