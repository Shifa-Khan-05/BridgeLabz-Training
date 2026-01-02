class Fan extends Appliance {

    public Fan(int powerUsage) {
        super(powerUsage);
    }

    @Override
    public void turnOn() {
        setPowerStatus(true);
        System.out.println("Fan turned ON (Medium speed)");
    }

    @Override
    public void turnOff() {
        setPowerStatus(false);
        System.out.println("Fan turned OFF");
    }
}
