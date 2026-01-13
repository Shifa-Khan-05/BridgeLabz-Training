public class Lock extends Device {

    public Lock(String deviceId) {
        super(deviceId, 0.2);
    }

    public void turnOn() {
        setStatus(true);
        System.out.println("Lock engaged");
    }

    public void turnOff() {
        setStatus(false);
        System.out.println("Lock disengaged");
    }

    public void reset() {
        System.out.println("Lock reset: Security protocols refreshed");
    }
}
