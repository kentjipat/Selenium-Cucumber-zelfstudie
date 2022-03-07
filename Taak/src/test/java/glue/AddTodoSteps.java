package glue;

import actions.DriverActions;
import actions.TodoActions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class AddTodoSteps {

    DriverActions driverActions;
    TodoActions todoActions;

    public AddTodoSteps(DriverActions driverActions,  TodoActions todoActions) {
        this.driverActions = driverActions;
        this.todoActions = todoActions;
    }

    @Given("I am on the VanillaJS Todo page")
    public void i_am_on_the_vanilla_js_todo_page() {
        driverActions.getVanillaJSTodoPage();
    }
    @When("I create a new todo {string}")
    public void i_create_a_todo(String todo) {
        todoActions.createTodo(todo);
    }
    @Then("{string} is added on the page")
    public void the_todo_is_added_on_the_page(String todo) {
        todoActions.validateTodo(todo);
    }

    @And("I delete {string}")
    public void iDeleteTodo(String todo) {
        todoActions.deleteTodo(todo);
    }

    @Then("{string} is no longer visible on the page")
    public void todoIsNoLongerVisibleOnThePage(String todo) {
        todoActions.validateDeletedTodo(todo);
    }

}
