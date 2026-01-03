
public class RideService implements IRideService {

    private Vehicle vehicle;

    public RideService(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    @Override
    public void bookRide(double distance) {
        double fare = vehicle.calculateFare(distance);
        vehicle.setFare(fare);
        System.out.println("Ride booked successfully.");
        System.out.println("Estimated Fare: " + fare);
    }

    @Override
    public void endRide() {
        System.out.println("Ride ended.");
        System.out.println("Total Fare: " + vehicle.getFare());
    }
}
