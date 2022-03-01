package pages;

import helpers.DriverHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TodosPage {

    WebDriver driver;
    Actions actions ;

    @FindBy(css=".new-todo")
    private WebElement createInput;

    @FindBy(css = ".todo-list li .toggle + label")
    private WebElement label;

    @FindBy(css="button.destroy")
    private WebElement deleteBtn;

    public TodosPage(DriverHelper driverHelper){
        super();
        this.driver = driverHelper.getDriver();
        this.actions = new Actions(driver);
        PageFactory.initElements(driverHelper.getDriver(), this);
    }

    public void createTodo(String todo){
        createInput.sendKeys(todo + Keys.ENTER);
    }

    public String getTodoText(){
        return label.getText();
    }

    public void deleteTodo(String todo){
        // momenteel ervan uitgaand dat er maar 1 todo aanwezig is
        actions.moveToElement(label).moveToElement(deleteBtn).click().perform();
    }

    public String findTodo(String todo){
        if (driver.findElements((By.cssSelector(".todo-list li .toggle + label"))).size() != 0) {
            return todo;
        } else {
            return null;
        }
    }

}
