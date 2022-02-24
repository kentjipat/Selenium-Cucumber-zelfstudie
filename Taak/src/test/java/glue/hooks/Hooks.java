package glue.hooks;

import helpers.DriverHelper;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

    DriverHelper driverHelper;

    public Hooks(DriverHelper driverHelper){
        super();
        this.driverHelper = driverHelper;
    }

    @Before
    public void setup(){
        System.out.println("Starting test");
        driverHelper.getDriver().get("https://todomvc.com/examples/vanillajs/");
    }

    @After
    public void tearDown(){
        System.out.println("Finishing test");
        driverHelper.quit();
    }

}
