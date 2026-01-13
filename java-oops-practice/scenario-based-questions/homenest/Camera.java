
public class Camera extends Device {

    public Camera(String deviceId) {
        super(deviceId, 1.5);
    }

    public void turnOn() {
        setStatus(true);
        System.out.println("Camera activated");
    }

    public void turnOff() {
        setStatus(false);
        System.out.println("Camera deactivated");
    }

    public void reset() {
        System.out.println("Camera reset: Recording restarted");
    }
}
