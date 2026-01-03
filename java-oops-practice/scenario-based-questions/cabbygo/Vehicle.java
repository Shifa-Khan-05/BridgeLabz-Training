
public abstract class Vehicle {

    protected String vehicleNumber;
    protected int capacity;
    protected String type;

   
    private double fare;

    public Vehicle(String vehicleNumber, int capacity, String type) {
        this.vehicleNumber = vehicleNumber;
        this.capacity = capacity;
        this.type = type;
    }

    // Abstract method for polymorphism
    public abstract double calculateFare(double distance);

    protected void setFare(double fare) {
        this.fare = fare;
    }

    public double getFare() {
        return fare;
    }

    public void showVehicleDetails() {
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Type: " + type);
        System.out.println("Capacity: " + capacity);
    }
}
