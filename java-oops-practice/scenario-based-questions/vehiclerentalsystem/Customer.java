package vehiclerentalsystem;
class Customer {

    private String name;

    // Encapsulation
    public Customer(String name) {
        this.name = name;
    }

    public void rentVehicle(Vehicle vehicle, int days) {
        System.out.println("Customer: " + name);
        System.out.println("Vehicle No: " + vehicle.getVehicleNumber());
        System.out.println("Days: " + days);
        System.out.println("Total Rent: Rs" + vehicle.calculateRent(days));
        System.out.println("--------------------------------");
    }
}
