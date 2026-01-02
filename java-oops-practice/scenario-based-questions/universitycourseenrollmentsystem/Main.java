public class Main {

    public static void main(String[] args) {

        Student s1 = new Undergraduate(101, "Aman");
        Student s2 = new Postgraduate(201, "Neha", "AI");

        Course c1 = new Course("CS101", "Data Structures");
        Course c2 = new Course("CS202", "Machine Learning");

        Faculty f1 = new Faculty("Dr. Rao");

        new Enrollment(s1, c1);
        new Enrollment(s2, c2);

        f1.assignGrade(s1, c1, 80);
        f1.assignGrade(s2, c2, 90);

        System.out.println();
        s1.displayInfo();
        System.out.println();
        s2.displayInfo();
    }
}
