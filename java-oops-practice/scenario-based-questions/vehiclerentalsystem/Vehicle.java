package vehiclerentalsystem;
// Parent class
abstract class Vehicle implements Rentable {

    // Protected: accessible to subclasses
    protected String vehicleNumber;
    protected double baseRate;

    // Constructor
    public Vehicle(String vehicleNumber, double baseRate) {
        this.vehicleNumber = vehicleNumber;
        this.baseRate = baseRate;
    }

    // Encapsulation via getters
    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public double getBaseRate() {
        return baseRate;
    }
}
