public class Main {

    public static void main(String[] args) {

        User u1 = new User("Aman", new PersonalWallet(100));
        User u2 = new User("Riya", new BusinessWallet(500));

        u1.loadMoney(1000);
        u2.loadMoney(2000);

        u1.getWallet().transferTo(u2, 300);
        u2.getWallet().transferTo(u1, 400);

        System.out.println();
        u1.showBalance();
        u2.showBalance();

        System.out.println("\nAman Transaction History:");
        u1.getWallet().showHistory();
    }
}
