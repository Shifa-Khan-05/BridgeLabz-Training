package com.interfaces.functionalinterface;

public class BackgroundJobExecution {

	    public static void main(String[] args) {

	        // Runnable task using lambda
	        Runnable job = () -> {
	            System.out.println("Background job started...");
	            try {
	                Thread.sleep(2000);
	            } catch (InterruptedException e) {
	                e.printStackTrace();
	            }
	            System.out.println("Background job completed");
	        };

	        Thread thread = new Thread(job);
	        thread.start();

	        System.out.println("Main thread continues...");
	    }
	}
