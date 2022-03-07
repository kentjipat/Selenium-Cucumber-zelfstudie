package components;

public class Game {

    private String title;
    private String studio;

    public Game(String title, String studio) {
        this.title = title;
        this.studio = studio;
    }

    public String getStudio() {
        return studio;
    }

    public String getTitle() {
        return title;
    }
}
