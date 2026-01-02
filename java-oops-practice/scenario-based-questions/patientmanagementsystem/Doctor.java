class Doctor {

    private String name;
    private String specialization;

    public Doctor(String name, String specialization) {
        this.name = name;
        this.specialization = specialization;
    }

    // Polymorphism
    public void displayInfo() {
        System.out.println("Doctor assigned: " + name);
        System.out.println("Specialization: " + specialization);
    }
}
