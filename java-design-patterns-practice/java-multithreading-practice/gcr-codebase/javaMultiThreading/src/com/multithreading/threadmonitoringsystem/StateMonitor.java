package com.multithreading.threadmonitoringsystem;

import java.time.LocalTime;
import java.util.HashMap;
import java.util.Map;

class StateMonitor implements Runnable {

	private final Thread[] threads;
	private final Map<String, Integer> stateCount = new HashMap<>();

	public StateMonitor(Thread threads[]) {
		this.threads = threads;
	}

	@Override
	public void run() {
		Map<Thread, Thread.State> lastState = new HashMap<>();

		boolean allTerminated;

		do {
			allTerminated = true;

			for (Thread t : threads) {
				Thread.State currentState = t.getState();
				Thread.State previousState = lastState.get(t);

				if (previousState != currentState) {
					System.out.println(
							"[Monitor] " + t.getName() + " is in " + currentState + " state at " + LocalTime.now());

					lastState.put(t, currentState);
					stateCount.put(t.getName(), stateCount.getOrDefault(t.getName(), 0) + 1);
				}

				if (currentState != Thread.State.TERMINATED) {
					allTerminated = false;
				}
			}

			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				System.out.println("Monitor interrupted.");
			}

		} while (!allTerminated);

		// Summary
		System.out.println("\n===== SUMMARY =====");
		stateCount.forEach((name, count) -> System.out.println(name + " went through " + count + " states"));
	}
}
