// Abstract class representing a generic Room
abstract class Room {

    // Encapsulated data: room number is private
    private int roomNumber;

    // Protected so subclasses can access it
    protected double pricePerNight;

    // Constructor to initialize common room details
    public Room(int roomNumber, double pricePerNight) {
        this.roomNumber = roomNumber;
        this.pricePerNight = pricePerNight;
    }

    // Abstract method
    // Each room type will calculate price differently
    abstract double calculatePrice(int days);

    // Concrete method shared by all room types
    public void getDetails() {
        System.out.println("Room Number: " + roomNumber);
        System.out.println("Price per Night: ₹" + pricePerNight);
    }
}
