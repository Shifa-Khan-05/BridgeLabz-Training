package com.functionalinterface;

public class RunnableFI {

    public static void main(String[] args) {

        // 1. Run a background task using Runnable
        Runnable backgroundTask =
                () -> System.out.println("Background task is running");

        new Thread(backgroundTask).start();

        System.out.println("==============================================");

        // 2. Execute a file cleanup task using Runnable
        Runnable fileCleanupTask =
                () -> System.out.println("File cleanup task executed");

        new Thread(fileCleanupTask).start();

        System.out.println("==============================================");

        // 3. Print a message in a separate thread using Runnable
        Runnable messageTask =
                () -> System.out.println("Message printed from another thread");

        new Thread(messageTask).start();
    }
}
