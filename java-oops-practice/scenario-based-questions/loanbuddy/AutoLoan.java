public class AutoLoan extends LoanApplication {

    public AutoLoan(int term, double interestRate, double loanAmount) {
        super(term, interestRate, loanAmount);
    }

    @Override
    public boolean approveLoan(Applicant applicant) {
        boolean eligible =
                applicant.getCreditScore() >= 650 &&
                applicant.getIncome() >= loanAmount / 5;

        setApproved(eligible);
        return eligible;
    }

    @Override
    public double calculateEMI() {
        return calculateStandardEMI() * 1.02; // processing fee impact
    }
}
