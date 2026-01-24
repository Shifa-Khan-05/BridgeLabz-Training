package com.annotations.customannotation;
public class TaskManager {

    @TaskInfo(priority = "HIGH", assignedTo = "Shifa")
    public void completeTask() {
        System.out.println("Task completed");
    }
}
