package actions;

import components.Game;
import io.cucumber.datatable.DataTable;
import pages.BolProductsPage;
import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertTrue;

import java.util.List;

public class UIBolActions implements BolActions{

    private BolProductsPage bolProductsPage;

    public UIBolActions(BolProductsPage bolProductsPage) {
        this.bolProductsPage = bolProductsPage;
    }

    @Override
    public void addGames(DataTable gamesTable) {
        List<List<String>> rows = gamesTable.asLists(String.class);
        for (List<String> columns : rows) {
            bolProductsPage.addGameToList(new Game(columns.get(0), columns.get(1)));
        }
    }

    @Override
    public void acceptCookies() {
        bolProductsPage.acceptCookies();
    }

    @Override
    public void filterGames() {
        bolProductsPage.filterProducts();
    }

    @Override
    public void validateFilteredgames(int amount) {
        assertEquals("Amount of games is not correct", bolProductsPage.filterByStudio("Nintendo").size(), bolProductsPage.getVisibleGames().size(), amount );
    }

    @Override
    public void validateDisplayedGame(Game game) {
        assertTrue("Game is not displayed", bolProductsPage.getVisibleGames().contains(game.getTitle()));
    }
}
