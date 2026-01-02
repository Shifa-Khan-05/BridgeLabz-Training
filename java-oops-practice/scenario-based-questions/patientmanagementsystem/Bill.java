// Implements abstraction
class Bill implements Payable {

    private double amount;
    private double tax;
    private double discount;

    // Constructor
    public Bill(double amount) {
        this.amount = amount;
        this.tax = amount * 0.18;      // 18% tax
        this.discount = amount * 0.30; // 30% discount
    }

    // Operator usage: + - *
    @Override
    public double calculatePayment() {
        return amount + tax - discount;
    }
}
