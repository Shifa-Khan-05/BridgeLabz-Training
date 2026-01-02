class User {

    private String name;
    private Wallet wallet;

    public User(String name, Wallet wallet) {
        this.name = name;
        this.wallet = wallet;
    }

    public Wallet getWallet() {
        return wallet;
    }

    public void loadMoney(double amount) {
        wallet.addBalance(amount);
        System.out.println(name + " loaded " + amount);
    }

    public void showBalance() {
        System.out.println(name + " Balance: " + wallet.getBalance());
    }
}
