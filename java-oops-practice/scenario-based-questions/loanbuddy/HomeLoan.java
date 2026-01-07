public class HomeLoan extends LoanApplication {

    public HomeLoan(int term, double interestRate, double loanAmount) {
        super(term, interestRate, loanAmount);
    }

    @Override
    public boolean approveLoan(Applicant applicant) {
        boolean eligible =
                applicant.getCreditScore() >= 700 &&
                applicant.getIncome() >= loanAmount / 10;

        setApproved(eligible);
        return eligible;
    }

    @Override
    public double calculateEMI() {
        return calculateStandardEMI();
    }
}
