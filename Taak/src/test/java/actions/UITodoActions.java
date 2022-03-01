package actions;

import pages.TodosPage;

import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertNull;


public class UITodoActions implements TodoActions {

    private TodosPage todospage;

    public UITodoActions(TodosPage todospage) {
        this.todospage = todospage;
    }

    @Override
    public void createTodo(String todo) {
        todospage.createTodo(todo);
    }

    @Override
    public String getTodoText() {
        return todospage.getTodoText();
    }

    @Override
    public void validateTodo(String todo) {
        assertEquals("Todo not found", todo, todospage.getTodoText());
    }

    @Override
    public void deleteTodo(String todo) {
        todospage.deleteTodo(todo);
    }

    @Override
    public void validateDeletedTodo(String todo) {
        assertNull("Todo not deleted", todospage.findTodo(todo));
    }
}
