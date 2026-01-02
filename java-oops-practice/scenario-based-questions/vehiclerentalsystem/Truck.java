package vehiclerentalsystem;
class Truck extends Vehicle {

    public Truck(String vehicleNumber) {
        super(vehicleNumber, 1500);
    }

    @Override
    public double calculateRent(int days) {
        double loadCharge = 500;
        return (baseRate * days) + loadCharge;
    }
}
