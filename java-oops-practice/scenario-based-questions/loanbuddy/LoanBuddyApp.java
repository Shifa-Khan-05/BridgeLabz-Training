import java.util.Scanner;

public class LoanBuddyApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // -------- Applicant Details --------
        System.out.print("Enter Applicant Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Credit Score: ");
        int creditScore = sc.nextInt();

        System.out.print("Enter Monthly Income: ");
        double income = sc.nextDouble();

        System.out.print("Enter Loan Amount: ");
        double loanAmount = sc.nextDouble();

        Applicant applicant =
                new Applicant(name, creditScore, income, loanAmount);

        // -------- Loan Details --------
        System.out.print("Enter Loan Type (1-Home, 2-Auto): ");
        int loanChoice = sc.nextInt();

        System.out.print("Enter Loan Term (in months): ");
        int term = sc.nextInt();

        System.out.print("Enter Interest Rate (%): ");
        double interestRate = sc.nextDouble();

        LoanApplication loan;

        // -------- Polymorphic Object Creation --------
        if (loanChoice == 1) {
            loan = new HomeLoan(term, interestRate, loanAmount);
        } else {
            loan = new AutoLoan(term, interestRate, loanAmount);
        }

        // -------- Loan Processing --------
        if (loan.approveLoan(applicant)) {
            System.out.println("\n Loan Approved!");
            System.out.printf(" Monthly EMI: %.2f%n", loan.calculateEMI());
        } else {
            System.out.println("\n Loan Rejected.");
        }

        sc.close();
    }
}
