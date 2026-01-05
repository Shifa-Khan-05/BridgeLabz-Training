
class Person {
    protected int id;
    protected String name;
    protected String email;

    Person(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    void printDetails() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
    }
}
