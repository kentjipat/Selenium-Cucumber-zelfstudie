package glue;

import actions.BolActions;
import actions.DriverActions;
import components.Game;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.ParameterType;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

public class BolProductsSteps {

    DriverActions driverActions;
    BolActions bolActions;

    public BolProductsSteps(DriverActions driverActions,  BolActions bolActions) {
        this.driverActions = driverActions;
        this.bolActions = bolActions;
    }

    @Given("I am on the new Nintendo Switch games page")
    public void iAmOnTheNewNintendoSwitchGamesPage() {
        driverActions.getBolPage();
        bolActions.acceptCookies();
    }

    @And("The following games are available")
    public void theFollowingGamesAreAvailable(DataTable gamesTable) {
        bolActions.addGames(gamesTable);
    }

    @When("I filter for games by Nintendo")
    public void iFilterForGamesByNintendo() {
        bolActions.filterGames();
    }

    @Then("I find {int} games")
    public void iFindGames(int amount) {
        bolActions.validateFilteredgames(amount);
    }

    @ParameterType(".*")
    public Game game(String gameMetaDate) {
        String[] split = gameMetaDate.split("by");
        return new Game(split[0].trim(), split[1].trim());
    }

    @And("I find the game {game}")
    public void iFindTheGameTriangleStrategyNintendoSwitchByNintendo(Game game) {
        bolActions.validateDisplayedGame(game);
    }
}
