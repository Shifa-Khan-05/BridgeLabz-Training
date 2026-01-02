// Base class
class Patient {

    // Encapsulation: sensitive data kept private
    private String name;
    private int age;
    private String medicalHistory;

    // Normal admission constructor
    public Patient(String name, int age) {
        this.name = name;
        this.age = age;
        this.medicalHistory = "Not Provided";
    }

    // Emergency admission constructor (Overloaded)
    public Patient(String name, int age, String medicalHistory) {
        this.name = name;
        this.age = age;
        this.medicalHistory = medicalHistory;
    }

    // Getter (controlled access)
    public String getMedicalHistory() {
        return medicalHistory;
    }

    // Polymorphic method
    public void displayInfo() {
        System.out.println("Patient Name: " + name);
        System.out.println("Age: " + age);
    }
}
