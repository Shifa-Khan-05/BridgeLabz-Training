package com.examproctor;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

public class Exam {

    // Correct answers
    private Map<Integer, Character> correctAnswers = new HashMap<>();

    // Student answers
    private Map<Integer, Character> studentAnswers = new HashMap<>();

    // Stack to track question navigation
    private Stack<Integer> navigationStack = new Stack<>();

    private final int TOTAL_QUESTIONS = 10;

    // Load correct answers
    public void loadCorrectAnswers() {
        correctAnswers.put(1, 'a');
        correctAnswers.put(2, 'd');
        correctAnswers.put(3, 'b');
        correctAnswers.put(4, 'c');
        correctAnswers.put(5, 'd');
        correctAnswers.put(6, 'b');
        correctAnswers.put(7, 'a');
        correctAnswers.put(8, 'c');
        correctAnswers.put(9, 'a');
        correctAnswers.put(10, 'c');
    }

    // Visit question and submit answer
    public void visitQuestion(int questionId, char answer) {

        if (navigationStack.size() >= TOTAL_QUESTIONS) {
            System.out.println("Navigation Stack Overflow!");
            return;
        }

        navigationStack.push(questionId);
        studentAnswers.put(questionId, answer);

        System.out.println("Visited Question " + questionId + " | Answer saved: " + answer);
    }

    // Auto-evaluate score
    public void evaluateScore() {

        int score = 0;

        for (int qid : correctAnswers.keySet()) {
            if (studentAnswers.containsKey(qid) &&
                studentAnswers.get(qid).equals(correctAnswers.get(qid))) {
                score++;
            }
        }

        System.out.println(" Exam Submitted Successfully!");
        System.out.println("Final Score: " + score + "/" + TOTAL_QUESTIONS);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Exam exam = new Exam();
        exam.loadCorrectAnswers();

        int choice;

        do {
            System.out.println("\n=== ONLINE EXAM MENU ===");
            System.out.println("1. Visit Question");
            System.out.println("2. Submit Exam");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter Question ID (1–10): ");
                    int qid = sc.nextInt();

                    System.out.print("Enter Answer (a/b/c/d): ");
                    char ans = sc.next().charAt(0);

                    exam.visitQuestion(qid, ans);
                    break;

                case 2:
                    exam.evaluateScore();
                    choice = 0;
                    break;

                case 0:
                    System.out.println("Exiting Exam System...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 0);

        sc.close();
    }
}
