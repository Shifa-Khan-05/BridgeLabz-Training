import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter User Details");
        System.out.print("Name: ");
        String name = sc.nextLine();

        System.out.print("Age: ");
        int age = sc.nextInt();

        System.out.print("Weight: ");
        double weight = sc.nextDouble();
        sc.nextLine();

        System.out.print("Goal: ");
        String goal = sc.nextLine();

        UserProfile user = new UserProfile(name, age, weight, goal);

        System.out.print("\nEnter Cardio Workout Duration (minutes): ");
        int cardioTime = sc.nextInt();

        System.out.print("Enter Strength Workout Duration (minutes): ");
        int strengthTime = sc.nextInt();

        Workout w1 = new CardioWorkout(cardioTime);
        Workout w2 = new StrengthWorkout(strengthTime);

        w1.startWorkout();
        w1.calculateCalories();
        w1.stopWorkout();

        w2.startWorkout();
        w2.calculateCalories();
        w2.stopWorkout();

        int totalBurned = w1.getCaloriesBurned() + w2.getCaloriesBurned();
        int remaining = user.dailyTarget - totalBurned;

        System.out.println("\n--- User Profile ---");
        user.showProfile();

        System.out.println("\nCalories Burned Today : " + totalBurned);
        System.out.println("Remaining Calories    : " + remaining);

        sc.close();
    }
}
