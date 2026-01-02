// Inheritance
class InPatient extends Patient {

    private int daysAdmitted;

    public InPatient(String name, int age, String history, int daysAdmitted) {
        super(name, age, history);
        this.daysAdmitted = daysAdmitted;
    }

    // Polymorphism
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Days Admitted: " + daysAdmitted);
    }
}
