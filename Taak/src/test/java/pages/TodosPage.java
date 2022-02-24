package pages;

import helpers.DriverHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TodosPage {

    DriverHelper driverHelper;

    @FindBy(css=".new-todo")
    private WebElement createInput;

    public TodosPage(DriverHelper driverHelper){
        super();
        this.driverHelper = driverHelper;
        PageFactory.initElements(driverHelper.getDriver(), this);
    }

    public void createTodo(String todo){
        createInput.sendKeys(todo + Keys.ENTER);
    }

    public String getTodoText(){
        return driverHelper.getDriver().findElement (By.cssSelector(".todo-list li .toggle + label")).getText();
    }

}
