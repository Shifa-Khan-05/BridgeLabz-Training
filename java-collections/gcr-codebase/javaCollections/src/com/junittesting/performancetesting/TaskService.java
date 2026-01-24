package com.junittesting.performancetesting;

public class TaskService {

    public void longRunningTask() throws InterruptedException {
        Thread.sleep(3000);
    }
}
