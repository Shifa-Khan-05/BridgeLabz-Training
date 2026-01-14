import java.time.LocalDate;

public class ElectricityBill extends Bill {

    public ElectricityBill(double amount, LocalDate dueDate) {
        super("Electricity", amount, dueDate);
    }

    public void pay() {
        markAsPaid();
        System.out.println("Electricity bill paid successfully.");
    }

    // Polymorphic reminder
    public void sendReminder() {
        System.out.println("Reminder: Electricity bill due soon. Avoid power disconnection!");
    }
}
