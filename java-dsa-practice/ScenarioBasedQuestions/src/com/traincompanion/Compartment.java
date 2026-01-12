package com.traincompanion;

public class Compartment 
{
	String compartmentName;
	 boolean wifi;
	 boolean pantry;
	 Compartment next;
	 Compartment prev;
      
	 public Compartment(String compartmentName,boolean wifi,boolean pantry) {
		this.compartmentName=compartmentName;
		 this.wifi=wifi;
		this.pantry=pantry;
		this.next=null;
		this.prev=null;
	}

}
