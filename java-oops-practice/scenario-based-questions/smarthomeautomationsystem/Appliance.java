// Parent class
abstract class Appliance implements Controllable {

    // Internal state (encapsulated)
    private boolean powerStatus;
    private int powerUsage; // watts

    // Default constructor
    public Appliance() {
        this.powerUsage = 100;
        this.powerStatus = false;
    }

    // User-defined power setting
    public Appliance(int powerUsage) {
        this.powerUsage = powerUsage;
        this.powerStatus = false;
    }

    // Public access (controlled)
    public int getPowerUsage() {
        return powerUsage;
    }

    public boolean isOn() {
        return powerStatus;
    }

    // Protected state change
    protected void setPowerStatus(boolean status) {
        this.powerStatus = status;
    }
}
