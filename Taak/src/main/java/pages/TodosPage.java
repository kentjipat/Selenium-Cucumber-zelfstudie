package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class TodosPage {

    private WebDriver driver;
    private By createInput = By.className("new-todo");

    public TodosPage(WebDriver driver){
        this.driver = driver;
    }

    public void createTodo(String string){
        driver.findElement(createInput).sendKeys(string + Keys.ENTER);
    }

    public String getTodoText(){
        return driver.findElement (By.cssSelector(".todo-list li .toggle + label")).getText();
    }

}
