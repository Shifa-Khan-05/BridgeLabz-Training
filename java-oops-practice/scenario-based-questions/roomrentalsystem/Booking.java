// Booking class represents a customer's booking
class Booking {

    // Encapsulated customer details
    private String customerName;

    // HAS-A relationship
    private Room room;

    private int days;

    // Constructor to initialize booking
    public Booking(String customerName, Room room, int days) {
        this.customerName = customerName;
        this.room = room;
        this.days = days;
    }

    // Method to display bill details
    public void showBill() {

        System.out.println("Customer Name: " + customerName);

        // Polymorphic call
        room.getDetails();

        System.out.println("Days Stayed: " + days);

        // Runtime polymorphism
        System.out.println("Total Bill: ₹" + room.calculatePrice(days));

        System.out.println("--------------------------------");
    }
}
