import java.time.LocalDate;

public class WaterBill extends Bill {

    public WaterBill(double amount, LocalDate dueDate) {
        super("Water", amount, dueDate);
    }

    public void pay() {
        markAsPaid();
        System.out.println("Water bill paid successfully.");
    }

    public void sendReminder() {
        System.out.println("Reminder: Water bill due. Ensure uninterrupted supply.");
    }
}
