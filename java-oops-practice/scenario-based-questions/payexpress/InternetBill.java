import java.time.LocalDate;

public class InternetBill extends Bill {

    public InternetBill(double amount, LocalDate dueDate) {
        super("Internet", amount, dueDate);
    }

    public void pay() {
        markAsPaid();
        System.out.println("Internet bill paid successfully.");
    }

    public void sendReminder() {
        System.out.println("Reminder: Internet bill pending. Service may be interrupted.");
    }
}
