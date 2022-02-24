package glue;

import helpers.DriverHelper;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.TodosPage;

import static org.testng.AssertJUnit.assertEquals;


public class AddTodoSteps {

    DriverHelper driverHelper;
    TodosPage todosPage;

    public AddTodoSteps(DriverHelper driverHelper, TodosPage todosPage) {
        super();
        this.driverHelper = driverHelper;
        this.todosPage = todosPage;
    }

    @Given("I am on the VanillaJS Todo page")
    public void i_am_on_the_vanilla_js_todo_page() {

    }
    @When("I create a new todo {string}")
    public void i_create_a_todo(String todo) {
        todosPage.createTodo(todo);
    }
    @Then("{string} is added on the page")
    public void the_todo_is_added_on_the_page(String todo) {
        // Write code here that turns the phrase above into concrete actions
        assertEquals("Todo not found", todo, todosPage.getTodoText());
    }
}
