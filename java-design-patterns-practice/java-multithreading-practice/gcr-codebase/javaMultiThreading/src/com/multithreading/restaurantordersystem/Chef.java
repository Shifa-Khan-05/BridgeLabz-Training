package com.multithreading.restaurantordersystem;

import java.util.Random;

public class Chef extends Thread {

	String dish;
	public Chef(String dish) {
		this.dish=dish;
	}
	Random random=new Random();
	
	@Override
	public void run() {
		try {
			for(int i=0;i<=100;i+=25)
			{
				System.out.println(" Chef : "+Thread.currentThread().getName() + " Preparing :"  + dish);
				System.out.println(" Chef : "+Thread.currentThread().getName() + " Preparing :"  + dish + i+ "%  completed");
				
			}
			Thread.sleep(500 +random.nextInt(1000));
		} catch (Exception e) {
		System.out.println("chef was interrupted");
		}
	}
}
