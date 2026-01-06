class Learner extends User implements ICertifiable {

    String courseType;

    Learner(int id, String name, String email, String courseType) {
        super(id, name, email);
        this.courseType = courseType;
    }

    public void generateCertificate() {
        if (courseType.equalsIgnoreCase("short")) {
            System.out.println("Short Course Completion Certificate Issued");
        } else {
            System.out.println("Full-Time Course Completion Certificate Issued");
        }
    }
}
