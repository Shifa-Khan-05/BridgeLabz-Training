
public class Main {

    public static void main(String[] args) {

        Vehicle vehicle = new Sedan("MP04AB1234");
        Driver driver = new Driver("Rohit", "DL12345", 4.8);

        RideService ride = new RideService(vehicle);

        vehicle.showVehicleDetails();
        driver.showDriverDetails();

        ride.bookRide(10);   // distance in km
        ride.endRide();
    }
}
