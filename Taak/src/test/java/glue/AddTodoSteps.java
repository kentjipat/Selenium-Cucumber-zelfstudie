package glue;

import base.BaseTests;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertEquals;


public class AddTodoSteps extends BaseTests {

    @Before
    public void init(){
        super.setup();
    }

    @After
    public void quit(){
        super.tearDown();
    }

    @Given("I am on the VanillaJS Todo page")
    public void i_am_on_the_vanilla_js_todo_page() {
        driver.get("https://todomvc.com/examples/vanillajs/");
    }
    @When("I create a new todo {string}")
    public void i_create_a_todo(String todo) {
        baseTodo = todo;
        todosPage.createTodo(todo);
    }
    @Then("todo is added on the page")
    public void the_todo_is_added_on_the_page() {
        // Write code here that turns the phrase above into concrete actions
        assertEquals("Todo not found", baseTodo, todosPage.getTodoText());
    }
}
