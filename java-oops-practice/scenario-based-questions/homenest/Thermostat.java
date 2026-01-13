public class Thermostat extends Device {

    public Thermostat(String deviceId) {
        super(deviceId, 2.0);
    }

    public void turnOn() {
        setStatus(true);
        System.out.println("Thermostat ON");
    }

    public void turnOff() {
        setStatus(false);
        System.out.println("Thermostat OFF");
    }

    public void reset() {
        System.out.println("Thermostat reset: Temperature set to 24°C");
    }
}
