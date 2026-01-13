// User class with protected owned games
public class User {

    private String name;
    private Game[] ownedGames = new Game[10];
    private int gameCount = 0;

    public User(String name) {
        this.name = name;
    }

    // Encapsulation: controlled access
    public void addGame(Game game) {
        if (gameCount < ownedGames.length) {
            ownedGames[gameCount++] = game;
            System.out.println(game.title + " added to " + name + "'s library.");
        } else {
            System.out.println("Game library full!");
        }
    }

    public void showOwnedGames() {
        System.out.println("\n" + name + "'s Games:");
        for (int i = 0; i < gameCount; i++) {
            System.out.println("- " + ownedGames[i].title);
        }
    }
}
