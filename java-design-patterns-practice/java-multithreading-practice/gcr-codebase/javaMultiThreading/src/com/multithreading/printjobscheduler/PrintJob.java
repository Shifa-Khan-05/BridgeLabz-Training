package com.multithreading.printjobscheduler;

public class PrintJob implements Runnable {

    private final String jobName;
    private final int pages;
    private final int priority;

    public PrintJob(String jobName, int pages, int priority) {
        this.jobName = jobName;
        this.pages = pages;
        this.priority = priority;
    }

    @Override
    public void run() {
        long startTime = System.currentTimeMillis();

        try {
            for (int i = 1; i <= pages; i++) {
                System.out.println(getPriorityLabel() +
                        " Printing " + jobName +
                        " - Page " + i + " of " + pages);

                // Simulate printing time (100ms per page)
                Thread.sleep(100);
            }
        } catch (InterruptedException e) {
            System.out.println(jobName + " interrupted.");
        }

        long endTime = System.currentTimeMillis();
        System.out.println(jobName + " completed in " + (endTime - startTime) + " ms");
    }

    public int getPriority() {
        return priority;
    }

    private String getPriorityLabel() {
        if (priority >= 7) {
            return "[High Priority]";
        } else if (priority >= 5) {
            return "[Medium Priority]";
        } else {
            return "[Low Priority]";
        }
    }
}
