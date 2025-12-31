/*

17. Online Quiz Application 🧠
Ask 5 questions (MCQs) from a user.
● Use arrays and for-loop.
● Record score.
● Switch for answer checking. Apply clear indentation and structured layout.

*/


public class OnlineQuizApplication{ 
public static void quizQuestion() {

        Scanner scanner = new Scanner(System.in);
        int score = 0;

        String[] questions = {
                "Who discovered Java?",
                "Java is a ______ language.",
                "Which keyword is used to create an object in Java?",
                "Which method is the entry point of a Java program?",
                "Which symbol is used to end a statement in Java?"
        };

        String[][] options = {
                {"a) Dennis Ritchie", "b) James Gosling", "c) Bjarne Stroustrup", "d) Guido van Rossum"},
                {"a) Low-level", "b) Assembly", "c) High-level", "d) Machine-level"},
                {"a) class", "b) object", "c) new", "d) create"},
                {"a) start()", "b) run()", "c) main()", "d) init()"},
                {"a) .", "b) ,", "c) :", "d) ;"}
        };

        char[] answers = {'b', 'c', 'c', 'c', 'd'};

        System.out.println("=======================================");
        System.out.println("           Online Quiz Game            ");
        System.out.println("=======================================");

        for (int i = 0; i < questions.length; i++) {

            System.out.println("\nQuestion-" + (i + 1) + ": " + questions[i]);
            System.out.println("Options are -");

            for (int j = 0; j < options[i].length; j++) {
                System.out.println(options[i][j]);
            }

            System.out.print("Enter your choice: ");
            char choice = scanner.next().charAt(0);

            switch (choice) {
                case 'a':
                case 'b':
                case 'c':
                case 'd':
                    if (choice == answers[i]) {
                        score++;
                    }
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        }

        System.out.println("\n=======================================");
        System.out.println("Quiz Completed!");
        System.out.println("Your Score: " + score + " / " + questions.length);
        System.out.println("=======================================");
    }

    public static void main(String[] args) {
        quizQuestion();
    }
}
