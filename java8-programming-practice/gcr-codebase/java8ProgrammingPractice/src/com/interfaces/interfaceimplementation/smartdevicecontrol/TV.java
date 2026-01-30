package com.functionalinterface.interfaceimplementation.smartdevicecontrol;

public class TV implements DeviceFunctioning {
	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("TV is On");
	}
	
	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("TV is Off");
	}
}
