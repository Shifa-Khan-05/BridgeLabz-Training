
public class SUV extends Vehicle {

    public SUV(String vehicleNumber) {
        super(vehicleNumber, 6, "SUV");
    }

    @Override
    public double calculateFare(double distance) {
        return 100 + distance * 20;
    }
}
