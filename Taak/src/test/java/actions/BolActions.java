package actions;

import components.Game;
import io.cucumber.datatable.DataTable;

public interface BolActions {

    void addGames(DataTable gamesTable);

    void acceptCookies();

    void filterGames();

    void validateFilteredgames(int amount);

    void validateDisplayedGame(Game game);
}
