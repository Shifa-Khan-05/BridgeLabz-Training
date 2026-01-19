import java.util.ArrayList;
import java.util.List;

class Bag {

    private String id;
    private String color;
    private int capacity;

    private List<Ball> balls;

    public Bag(String id, String color, int capacity) {
        this.id = id;
        this.color = color;
        this.capacity = capacity;
        this.balls = new ArrayList<>();
    }

    // Add Ball
    public void addBall(Ball ball) {
        if (balls.size() >= capacity) {
            System.out.println("Bag is FULL. Cannot add ball.");
        } else {
            balls.add(ball);
            System.out.println("Ball added successfully.");
        }
    }

    // Remove Ball by ID
    public void removeBall(String ballId) {
        for (Ball ball : balls) {
            if (ball.getId().equals(ballId)) {
                balls.remove(ball);
                System.out.println("Ball removed successfully.");
                return;
            }
        }
        System.out.println("Ball not found.");
    }

    // Display all balls in bag
    public void displayBalls() {
        if (balls.isEmpty()) {
            System.out.println("Bag is empty.");
            return;
        }

        for (Ball ball : balls) {
            System.out.println(ball);
        }
    }

    // Display bag summary
    public void displayBagInfo() {
        System.out.println(
            "Bag ID: " + id +
            ", Color: " + color +
            ", Balls: " + balls.size() + "/" + capacity
        );
    }
}
