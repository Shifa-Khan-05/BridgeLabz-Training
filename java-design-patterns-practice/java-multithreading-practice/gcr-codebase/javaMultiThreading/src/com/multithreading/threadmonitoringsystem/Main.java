package com.multithreading.threadmonitoringsystem;

public class Main {

	public static void main(String[] args) {

		TaskRunner task = new TaskRunner();

		Thread task1 = new Thread(task, "Task-1");
		Thread task2 = new Thread(task, "Task-2");

		StateMonitor monitor = new StateMonitor(new Thread[] { task1, task2 });

		Thread monitorThread = new Thread(monitor, "State-Monitor");

		monitorThread.start();

		task1.start();
		task2.start();
	}
}
