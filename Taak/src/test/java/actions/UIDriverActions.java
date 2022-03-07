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
        driver.get("https://www.bol.com/be/nl/l/nieuwe-games-voor-de-nintendo-switch/38906/7289/?rating=all");
    }
}
