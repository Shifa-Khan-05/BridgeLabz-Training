class PersonalWallet extends Wallet {

    public PersonalWallet() {
        super();
    }

    public PersonalWallet(double referralBonus) {
        super(referralBonus);
    }

    // Polymorphic behavior
    @Override
    public void transferTo(User receiver, double amount) {

        double tax = amount * 0.02; // 2% tax
        double total = amount + tax;

        if (deductBalance(total)) {
            receiver.getWallet().addBalance(amount);
            history.add(new Transaction("Transfer Sent", amount));
            System.out.println("Personal Wallet Transfer Successful");
        } else {
            System.out.println("Insufficient Balance");
        }
    }
}
