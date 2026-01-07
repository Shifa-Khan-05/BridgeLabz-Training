import java.util.ArrayList;
import java.util.List;

public class ParkingManager {

    private List<String> bookingLogs = new ArrayList<>();

    public boolean parkVehicle(ParkingSlot slot, Vehicle vehicle) {

        if (!slot.isAvailable()) {
            System.out.println("Slot already occupied.");
            return false;
        }

        if (!slot.getVehicleTypeAllowed()
                .equalsIgnoreCase(vehicle.getClass().getSimpleName())) {
            System.out.println("Vehicle type not allowed in this slot.");
            return false;
        }

        slot.occupySlot();
        bookingLogs.add("Vehicle " + vehicle.getVehicleNumber()
                + " parked at Slot " + slot.getSlotId());
        return true;
    }

    public void unparkVehicle(ParkingSlot slot, Vehicle vehicle, int hours) {

        slot.freeSlot();
        double charges = vehicle.calculateCharges(hours);

        bookingLogs.add("Vehicle " + vehicle.getVehicleNumber()
                + " left Slot " + slot.getSlotId()
                + " | Charges: ₹" + charges);

        System.out.println("Parking Charges: ₹" + charges);
    }

    // Logs exposed safely
    public void showLogs() {
        System.out.println("\n📄 Parking Logs:");
        for (String log : bookingLogs) {
            System.out.println(log);
        }
    }
}
