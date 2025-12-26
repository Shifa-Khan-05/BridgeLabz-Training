import java.util.Scanner;

/*
 * Raj's Result Generator
 * This program helps a coaching center generate student results.
 * - Takes marks of 5 subjects
 * - Calculates average marks
 * - Assigns grade using switch statement
 * - Uses for-loop to iterate through subjects
 */

public class RajResultGenerator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int totalMarks = 0;
        int numberOfSubjects = 5;

        System.out.println(" Raj's Coaching Center - Result Generator ");

        // Taking input for 5 subjects using for-loop
        for (int i = 1; i <= numberOfSubjects; i++) {
            System.out.print("Enter marks for Subject " + i + ": ");
            int marks = sc.nextInt();
            totalMarks += marks;
        }

        // Calculate average marks
        double average = totalMarks / (double) numberOfSubjects;

        /*
         * Grade assignment using switch
         * Grade Rules:
         * 90 - 100 : A
         * 75 - 89  : B
         * 60 - 74  : C
         * 40 - 59  : D
         * Below 40 : F
         */

        char grade;

        switch ((int) average / 10) {
            case 10:
            case 9:
                grade = 'A';
                break;
            case 8:
            case 7:
                grade = 'B';
                break;
            case 6:
                grade = 'C';
                break;
            case 5:
            case 4:
                grade = 'D';
                break;
            default:
                grade = 'F';
        }

        // Display result
        System.out.println("\n Result Summary ");
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Marks: " + average);
        System.out.println("Grade: " + grade);

        sc.close();
    }
}
