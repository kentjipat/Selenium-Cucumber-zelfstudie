package glue.hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.TodosPage;

public class Hooks {

    @Before
    public void setup(){
        System.out.println("Starting test");
    }

    @After
    public void tearDown(){
        System.out.println("Finishing test");
    }

}
