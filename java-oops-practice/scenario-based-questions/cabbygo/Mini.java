
public class Mini extends Vehicle {

    public Mini(String vehicleNumber) {
        super(vehicleNumber, 4, "Mini");
    }

    @Override
    public double calculateFare(double distance) {
        return 50 + distance * 10; // baseFare + distance * rate
    }
}
