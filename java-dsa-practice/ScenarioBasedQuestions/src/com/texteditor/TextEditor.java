package com.texteditor;

import java.util.Scanner;
import java.util.Stack;

public class TextEditor {

    // Insert operation
    public static void insert(Stack<String> undoStack, Stack<String> redoStack, String action) {
        undoStack.push(action);
        redoStack.clear(); // clear redo stack after new action
        System.out.println("Inserted: " + action);
    }

    // Delete (Undo) operation
    public static void undo(Stack<String> undoStack, Stack<String> redoStack) {
        if (!undoStack.isEmpty()) {
            String action = undoStack.pop();
            redoStack.push(action);
            System.out.println("Undo action: " + action);
        } else {
            System.out.println("Nothing to undo");
        }
    }

    // Redo operation
    public static void redo(Stack<String> undoStack, Stack<String> redoStack) {
        if (!redoStack.isEmpty()) {
            String action = redoStack.pop();
            undoStack.push(action);
            System.out.println("Redo action: " + action);
        } else {
            System.out.println("Nothing to redo");
        }
    }

    // Display current editor state
    public static void display(Stack<String> undoStack) {
        System.out.println("Current Editor Actions: " + undoStack);
    }

    public static void main(String[] args) {

        Stack<String> undoStack = new Stack<>();
        Stack<String> redoStack = new Stack<>();
        Scanner sc = new Scanner(System.in);

        int choice;

        do {
            System.out.println("\n--- Text Editor Menu ---");
            System.out.println("1. Insert Action");
            System.out.println("2. Undo");
            System.out.println("3. Redo");
            System.out.println("4. Display Editor State");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter action (insert/delete/format): ");
                    String action = sc.nextLine();
                    insert(undoStack, redoStack, action);
                    break;

                case 2:
                    undo(undoStack, redoStack);
                    break;

                case 3:
                    redo(undoStack, redoStack);
                    break;

                case 4:
                    display(undoStack);
                    break;

                case 5:
                    System.out.println("Exiting Text Editor...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 5);

        sc.close();
    }
}
