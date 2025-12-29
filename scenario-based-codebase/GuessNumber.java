
//Number guessing game
import java.util.*;

class GuessNumber {
    public static void main(String[] args) {

       //creating scanner object  
        Scanner scanner = new Scanner(System.in);
       //to generate a random number  
        int number = (int) (Math.random() * 100) + 1;
		
		//number of chances
        int chance = 5;

         //using do-while loop for iteration    
        do {
            System.out.println("Enter a number between 1 - 100");
            System.out.println("Chances left: " + chance);

           //taking user input
            int user = scanner.nextInt();

           //check the number  
            if (user > number) {
                System.out.println("Too high!");
            } 
            else if (user < number) {
                System.out.println("Too low!");
            } 
            else {
                System.out.println(" You got it! Correct number ");
                break;
            }

            chance--;

        } while (chance > 0);

        if (chance == 0) {
            System.out.println(" Game Over! The correct number was: " + number);
        }

        scanner.close();
    }
}
