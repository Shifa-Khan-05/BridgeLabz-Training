class Instructor extends User {

    String specialization;

    Instructor(int id, String name, String email, String specialization) {
        super(id, name, email);
        this.specialization = specialization;
    }

    void printDetails() {
        super.printDetails();
        System.out.println("Specialization: " + specialization);
    }
}
