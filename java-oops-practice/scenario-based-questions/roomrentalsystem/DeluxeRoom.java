// DeluxeRoom is another type of Room
class DeluxeRoom extends Room {

    // Constructor sets higher price for deluxe room
    public DeluxeRoom(int roomNumber) {
        super(roomNumber, 3500);
    }

    // Deluxe room has higher discount
    @Override
    double calculatePrice(int days) {

        double total = pricePerNight * days;

        if (days > 5) {
            total -= total * 0.15; // 15% discount
        }

        return total;
    }
}
