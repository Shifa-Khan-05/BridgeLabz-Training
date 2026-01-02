class Postgraduate extends Student {

    public Postgraduate(int id, String name, String elective) {
        super(id, name, elective);
    }

    @Override
    public void displayInfo() {
        System.out.println("Postgraduate Student");
        System.out.println("ID: " + id + ", Name: " + name);
        System.out.println("GPA: " + getGPA());
    }
}
