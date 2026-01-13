public class Light extends Device {

    public Light(String deviceId) {
        super(deviceId, 0.5);
    }

    public void turnOn() {
        setStatus(true);
        System.out.println("Light turned ON");
    }

    public void turnOff() {
        setStatus(false);
        System.out.println("Light turned OFF");
    }

    // Polymorphic reset
    public void reset() {
        System.out.println("Light reset: Brightness set to default");
    }
}
