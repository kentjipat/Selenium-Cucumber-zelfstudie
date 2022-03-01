package actions;

public interface TodoActions {

    void createTodo(String todo);

    String getTodoText();

    void validateTodo(String todo);

    void deleteTodo(String todo);

    void validateDeletedTodo(String todo);
}
