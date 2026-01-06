import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Learner Details");
        System.out.print("User ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Name: ");
        String name = sc.nextLine();

        System.out.print("Email: ");
        String email = sc.nextLine();

        System.out.print("Course Type (short/full): ");
        String courseType = sc.nextLine();

        Learner learner = new Learner(id, name, email, courseType);

        System.out.print("\nEnter number of quiz questions: ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] questions = new String[n];
        String[] answers = new String[n];
        String[] userAnswers = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Question " + (i + 1) + ": ");
            questions[i] = sc.nextLine();

            System.out.print("Correct Answer: ");
            answers[i] = sc.nextLine();
        }

        System.out.print("\nQuiz Difficulty: ");
        String difficulty = sc.nextLine();

        Quiz quiz = new Quiz(questions, answers, difficulty);

        System.out.println("\nEnter Learner Answers:");
        for (int i = 0; i < n; i++) {
            System.out.print("Answer for Question " + (i + 1) + ": ");
            userAnswers[i] = sc.nextLine();
        }

        quiz.evaluate(userAnswers);

        System.out.println("\n--- Learner Details ---");
        learner.printDetails();

        System.out.println("\n--- Quiz Result ---");
        quiz.showResult();

        System.out.println("\n--- Certificate ---");
        learner.generateCertificate();

        sc.close();
    }
}
