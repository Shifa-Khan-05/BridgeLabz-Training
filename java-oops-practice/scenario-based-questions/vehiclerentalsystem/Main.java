package vehiclerentalsystem;
public class Main {
	
	    public static void main(String[] args) {

	        Customer c1 = new Customer("Amit");

	        Vehicle bike = new Bike("BIKE101");
	        Vehicle car = new Car("CAR202");
	        Vehicle truck = new Truck("TRUCK303");

	        c1.rentVehicle(bike, 3);
	        c1.rentVehicle(car, 2);
	        c1.rentVehicle(truck, 4);
	    }

}
