package com.multithreading.threadmonitoringsystem;

class TaskRunner implements Runnable {

    @Override
    public void run() {
        try {
            // Simulate computation (RUNNABLE)
            for (int i = 0; i < 1_000_000; i++) {
                Math.sqrt(i);
            }

            // Sleep for 2 seconds (TIMED_WAITING)
            Thread.sleep(2000);

            // More computation
            for (int i = 0; i < 1_000_000; i++) {
                Math.pow(i, 2);
            }

        } catch (InterruptedException e) {
            System.out.println(Thread.currentThread().getName() + " was interrupted.");
        }
    }
}
