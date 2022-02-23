package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TodosPage {

    private WebDriver driver;
    private By createInput = By.className("new-todo");

    public TodosPage(WebDriver driver){
        this.driver = driver;
    }

    public void createTodo(String todo){
        driver.findElement(createInput).sendKeys(todo + Keys.ENTER);
    }

    public String getTodoText(){
        return driver.findElement (By.cssSelector(".todo-list li .toggle + label")).getText();
    }

}
