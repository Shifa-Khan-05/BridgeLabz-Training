import java.util.Scanner;

public class PetPal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Pet Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Pet Age: ");
        int age = sc.nextInt();
        sc.nextLine();

        System.out.println("Select Pet Type:");
        System.out.println("1. Dog");
        System.out.println("2. Cat");
        System.out.println("3. Bird");
        System.out.print("Choice: ");
        int choice = sc.nextInt();

        Pet pet;

        if (choice == 1) {
            pet = new Dog(name, age);
        } else if (choice == 2) {
            pet = new Cat(name, age);
        } else {
            pet = new Bird(name, age);
        }

        pet.makeSound();

        System.out.println("\nChoose Action:");
        System.out.println("1. Feed");
        System.out.println("2. Play");
        System.out.println("3. Sleep");
        System.out.print("Action: ");
        int action = sc.nextInt();

        if (action == 1) {
            pet.feed();
        } else if (action == 2) {
            pet.play();
        } else if (action == 3) {
            pet.sleep();
        }

        System.out.println("\nPet Status:");
        pet.showStatus();

        sc.close();
    }
}
