package vehiclerentalsystem;
class Car extends Vehicle {

    public Car(String vehicleNumber) {
        super(vehicleNumber, 800);
    }

    @Override
    public double calculateRent(int days) {
        double insurance = 200;
        return (baseRate * days) + insurance;
    }
}
