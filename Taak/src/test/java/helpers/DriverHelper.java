package helpers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ThreadGuard;

public class DriverHelper {

    private WebDriver driver;

    public DriverHelper() {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        this.driver = new ChromeDriver(options);
    }

    public WebDriver getDriver() {
        return driver;
    }

    public void quit(){
        if(driver != null){
            driver.quit();
        }
    }
}
