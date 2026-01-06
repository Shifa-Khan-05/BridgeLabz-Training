class User {
    protected int userId;
    protected String name;
    protected String email;

    User(int userId, String name, String email) {
        this.userId = userId;
        this.name = name;
        this.email = email;
    }

    void printDetails() {
        System.out.println("ID: " + userId);
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
    }
}
