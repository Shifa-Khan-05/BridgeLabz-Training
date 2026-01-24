package com.reflection.basiclevel.dynamicallycreateobjects;

public class DynamicObjectCreation {
	  public static void main(String[] args) throws Exception {

	        // Load class dynamically
	        Class<?> cls = Class.forName("Student");

	        // Create object
	        Object obj = cls.getDeclaredConstructor().newInstance();

	        System.out.println("Object Type: " + obj.getClass().getName());
	    }
}
