package pages;

import components.Game;
import helpers.DriverHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class BolProductsPage {

    WebDriver driver;
    Actions actions ;
    List<Game> gamesList = new ArrayList<>();

    @FindBy(xpath = "//*[@id=\"modalWindow\"]/div[2]/div[2]/wsp-consent-modal/div[2]/button[1]")
    private WebElement cookieBtn;

    @FindBy(css = "div.u-mb button")
    private WebElement languageBtn;

    @FindBy(xpath = "//*[@id=\"js_listpage_objects\"]/div[2]/wsp-filmstrip/div/ol/li[1]/div" )
    private WebElement filterBtn;

    @FindBy(css = ".product-item--row")
    private List<WebElement> visibleGames;

    public BolProductsPage(DriverHelper driverHelper){
        super();
        this.driver = driverHelper.getDriver();
        this.actions = new Actions(driver);
        PageFactory.initElements(driverHelper.getDriver(), this);
    }

    public void acceptCookies(){
        cookieBtn.click();
        actions.moveByOffset(0, 300).click().perform();
    }

    public void addGameToList(Game game){
        gamesList.add(game);
    }

    public void filterProducts(){
        filterBtn.click();
    }

    public List<Game> filterByStudio(String studio){
        return gamesList.stream()
                .filter(game -> Objects.equals(studio, game.getStudio()))
                .collect(Collectors.toList());
    }

    public List<Game> getVisibleGames(){
        List<Game> displayedGames = new ArrayList<>();
        for (WebElement displayedGameElement : visibleGames) {
                String title = displayedGameElement.findElement(By.cssSelector(".product-title")).getText();
                String studio = displayedGameElement.findElement(By.cssSelector(".product-creator li a")).getText();
                displayedGames.add(new Game(title, studio));
        }
        return displayedGames;

    }

}
