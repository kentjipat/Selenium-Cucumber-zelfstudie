package actions;

import helpers.DriverHelper;
import org.openqa.selenium.WebDriver;

public class UIDriverActions implements DriverActions {

    private DriverHelper driverHelper;
    private WebDriver driver;

    public UIDriverActions(DriverHelper driverHelper) {
        this.driverHelper = driverHelper;
        this.driver = driverHelper.getDriver();
    }

    @Override
    public void getVanillaJSTodoPage() {
        driver.get("https://todomvc.com/examples/vanillajs/");
    }

    @Override
    public void getBolPage() {
        driver.get("https://bol.com/");
    }
}
