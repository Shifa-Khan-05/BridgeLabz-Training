package com.lambdaexpression.smarthomelightingautomation;

public class Main {
	public static void main(String[] args) {

		Activity light=new Activity();
		LightAction motiondetect= ()-> System.out.println("bright white light on");
		
		LightAction nighttime= ()-> System.out.println("dim warm light on");

		
		LightAction voiceCommand= ()-> System.out.println("custom lights on");
		
		light.execute(voiceCommand);
		light.execute(nighttime);
		light.execute(motiondetect);

	}
}
