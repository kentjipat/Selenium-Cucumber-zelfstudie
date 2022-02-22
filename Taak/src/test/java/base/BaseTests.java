package base;


import pages.TodosPage;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTests {

    protected ChromeDriver driver;
    protected TodosPage todosPage;
    protected String baseTodo;

    public void setup(){
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver =  new ChromeDriver();
        todosPage = new TodosPage(driver);
    }

    public void tearDown(){
        driver.quit();
    }

}
