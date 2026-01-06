class Quiz {

    private String[] questions;
    private String[] answers;
    private int score;
    String difficulty;

    Quiz(String[] questions, String[] answers, String difficulty) {
        this.questions = questions;
        this.answers = answers;
        this.difficulty = difficulty;
    }

    void evaluate(String[] userAnswers) {
        score = 0;
        for (int i = 0; i < answers.length; i++) {
            if (answers[i].equalsIgnoreCase(userAnswers[i])) {
                score++;
            }
        }
    }

    double getPercentage() {
        return (score * 100.0) / answers.length;
    }

    void showResult() {
        System.out.println("Score: " + score + "/" + answers.length);
        System.out.println("Percentage: " + getPercentage());
    }
}
