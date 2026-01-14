// Interface for bill payment operations
public interface IPayable {
    void pay();
    void sendReminder(); // Polymorphic behavior
}
