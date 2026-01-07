public abstract class LoanApplication implements IApprovable {
    protected int term; // months
    protected double interestRate;
    protected double loanAmount;
    private boolean approved;

    public LoanApplication(int term, double interestRate, double loanAmount) {
        this.term = term;
        this.interestRate = interestRate;
        this.loanAmount = loanAmount;
    }

    protected void setApproved(boolean status) {
        this.approved = status;
    }

    public boolean isApproved() {
        return approved;
    }

    protected double calculateStandardEMI() {
        double R = interestRate / (12 * 100);
        return (loanAmount * R * Math.pow(1 + R, term)) /
               (Math.pow(1 + R, term) - 1);
    }
}
