
public class Sedan extends Vehicle {

    public Sedan(String vehicleNumber) {
        super(vehicleNumber, 4, "Sedan");
    }

    @Override
    public double calculateFare(double distance) {
        return 70 + distance * 15;
    }
}
