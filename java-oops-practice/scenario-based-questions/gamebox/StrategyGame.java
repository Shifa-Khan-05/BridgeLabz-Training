// Strategy game implementation
public class StrategyGame extends Game {

    public StrategyGame(String title, double price, double rating) {
        super(title, "Strategy", price, rating);
    }

    public void download() {
        System.out.println(title + " (Strategy) downloaded successfully!");
    }

    // Polymorphism
    public void playDemo() {
        System.out.println("Playing thoughtful strategy demo of " + title);
    }
}
