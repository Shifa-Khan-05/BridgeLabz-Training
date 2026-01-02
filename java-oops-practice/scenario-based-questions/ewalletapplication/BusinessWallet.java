class BusinessWallet extends Wallet {

    public BusinessWallet(double referralBonus) {
        super(referralBonus);
    }

    @Override
    public void transferTo(User receiver, double amount) {

        double tax = amount * 0.05; // 5% tax
        double serviceCharge = 50;
        double total = amount + tax + serviceCharge;

        if (deductBalance(total)) {
            receiver.getWallet().addBalance(amount);
            history.add(new Transaction("Business Transfer", amount));
            System.out.println("Business Wallet Transfer Successful");
        } else {
            System.out.println("Insufficient Balance");
        }
    }
}
