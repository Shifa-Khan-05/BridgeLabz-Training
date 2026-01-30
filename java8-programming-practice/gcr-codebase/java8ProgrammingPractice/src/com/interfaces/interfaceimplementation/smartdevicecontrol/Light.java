package com.functionalinterface.interfaceimplementation.smartdevicecontrol;

public class Light implements DeviceFunctioning {
	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("lights are On");
	}
	
	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("lights are Off");
	}
}
