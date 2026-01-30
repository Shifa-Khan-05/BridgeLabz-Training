package com.functionalinterface.interfaceimplementation.smartdevicecontrol;

public class Main {

    public static void main(String[] args) {

        DeviceFunctioning light=new Light() ;
        DeviceFunctioning ac=new Ac();
        DeviceFunctioning tv=new TV();
        light.turnOn();
        light.turnOff();

        ac.turnOn();
        ac.turnOff();

        tv.turnOn();
        tv.turnOff();
    }
}
