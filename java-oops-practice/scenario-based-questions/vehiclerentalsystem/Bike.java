package vehiclerentalsystem;
class Bike extends Vehicle {

    public Bike(String vehicleNumber) {
        super(vehicleNumber, 300); // Base rate per day
    }

    // Polymorphism
    @Override
    public double calculateRent(int days) {
        return baseRate * days; // Simple rent
    }
}
