// StandardRoom is a type of Room
class StandardRoom extends Room {

    // Constructor sets fixed price for standard room
    public StandardRoom(int roomNumber) {
        super(roomNumber, 2000); // calling parent constructor
    }

    // Overriding abstract method
    @Override
    double calculatePrice(int days) {

        // Base calculation
        double total = pricePerNight * days;

        // Discount for long stay
        if (days > 5) {
            total -= total * 0.10; // 10% discount
        }

        return total;
    }
}
