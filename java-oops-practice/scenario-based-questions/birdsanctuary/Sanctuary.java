import java.util.ArrayList;
import java.util.Iterator;

public class Sanctuary {

    private ArrayList<Bird> birds = new ArrayList<>();

    // Add bird
    public void addBird(Bird bird) {
        birds.add(bird);
        System.out.println("Bird added successfully.");
    }

    // Display all birds
    public void displayAllBirds() {
        if (birds.isEmpty()) {
            System.out.println("No birds in the sanctuary.");
            return;
        }

        for (Bird b : birds) {
            b.displayInfo();
            b.eat();

            // Polymorphism via instanceof
            if (b instanceof Flyable) {
                ((Flyable) b).fly();
            }
            if (b instanceof Swimmable) {
                ((Swimmable) b).swim();
            }
            System.out.println("-----------------------");
        }
    }

    // Display flying birds
    public void displayFlyingBirds() {
        for (Bird b : birds) {
            if (b instanceof Flyable) {
                b.displayInfo();
                ((Flyable) b).fly();
            }
        }
    }

    // Display swimming birds
    public void displaySwimmingBirds() {
        for (Bird b : birds) {
            if (b instanceof Swimmable) {
                b.displayInfo();
                ((Swimmable) b).swim();
            }
        }
    }

    // Display birds that can both fly and swim
    public void displayBoth() {
        for (Bird b : birds) {
            if (b instanceof Flyable && b instanceof Swimmable) {
                b.displayInfo();
            }
        }
    }

    // Remove bird by ID
    public void removeBird(String id) {
        Iterator<Bird> iterator = birds.iterator();
        while (iterator.hasNext()) {
            Bird b = iterator.next();
            if (b.getId().equals(id)) {
                iterator.remove();
                System.out.println("Bird removed successfully.");
                return;
            }
        }
        System.out.println("Bird with ID not found.");
    }

    // Sanctuary report
    public void sanctuaryReport() {
        int fly = 0, swim = 0, both = 0, neither = 0;

        for (Bird b : birds) {
            boolean canFly = b instanceof Flyable;
            boolean canSwim = b instanceof Swimmable;

            if (canFly && canSwim) both++;
            else if (canFly) fly++;
            else if (canSwim) swim++;
            else neither++;
        }

        System.out.println("\n--- Sanctuary Report ---");
        System.out.println("Flyable only: " + fly);
        System.out.println("Swimmable only: " + swim);
        System.out.println("Both Fly & Swim: " + both);
        System.out.println("Neither: " + neither);
    }
}
