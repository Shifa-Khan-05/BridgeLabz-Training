class OutPatient extends Patient {

    public OutPatient(String name, int age) {
        super(name, age);
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Type: Out Patient");
    }
}
