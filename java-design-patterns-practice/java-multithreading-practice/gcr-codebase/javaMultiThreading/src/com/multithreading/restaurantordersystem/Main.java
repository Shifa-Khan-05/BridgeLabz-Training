package com.multithreading.restaurantordersystem;

public class Main {
public static void main(String[] args) throws InterruptedException {
	Chef chef=new Chef("pasta");
	Chef chef2=new Chef("Pizza");
	Chef chef3=new Chef("Noodles");
	
	
	chef.start();
	chef2.start();
	chef3.start();
	
	chef.join();
	chef2.join();
	chef3.join();
}
}
