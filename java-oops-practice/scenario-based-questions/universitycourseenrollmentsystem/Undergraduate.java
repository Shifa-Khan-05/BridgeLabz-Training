class Undergraduate extends Student {

    public Undergraduate(int id, String name) {
        super(id, name);
    }

    @Override
    public void displayInfo() {
        System.out.println("Undergraduate Student");
        System.out.println("ID: " + id + ", Name: " + name);
        System.out.println("GPA: " + getGPA());
    }
}
