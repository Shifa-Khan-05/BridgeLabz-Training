// Abstract base class for all smart devices
public abstract class Device implements IControllable {

  protected String deviceId;
    private boolean status;               // Encapsulated (cannot be modified directly)
    protected double energyUsage;
 
    public Device(String deviceId, double energyUsage) {
        this.deviceId = deviceId;
        this.energyUsage = energyUsage;
        this.status = false;
    }
     // Encapsulated getter
    public boolean isOn() {
        return status;
    }

    // Controlled access to status
    protected void setStatus(boolean status) {
        this.status = status;
    }

    // Energy usage calculation using operators
    public double calculateEnergy(double hours) {
        return energyUsage * hours;   // Operator usage
    }

    // Display device details
    public void showDetails() {
        System.out.println("Device ID: " + deviceId);
        System.out.println("Status: " + (status ? "ON" : "OFF"));
        System.out.println("Energy Usage per hour: " + energyUsage);
    }
}