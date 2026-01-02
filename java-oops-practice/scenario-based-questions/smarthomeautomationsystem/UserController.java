class UserController {

    public void operateDevice(Appliance device) {
        device.turnOn();
    }

    // Energy comparison using operators
    public void compareEnergy(Appliance a1, Appliance a2) {

        if (a1.getPowerUsage() > a2.getPowerUsage()) {
            System.out.println("First device consumes more energy");
        } else if (a1.getPowerUsage() < a2.getPowerUsage()) {
            System.out.println("Second device consumes more energy");
        } else {
            System.out.println("Both devices consume equal energy");
        }
    }
}
