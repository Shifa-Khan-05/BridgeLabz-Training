class Light extends Appliance {

    public Light() {
        super(60);
    }

    @Override
    public void turnOn() {
        setPowerStatus(true);
        System.out.println("Light turned ON (Soft lighting)");
    }

    @Override
    public void turnOff() {
        setPowerStatus(false);
        System.out.println("Light turned OFF");
    }
}
