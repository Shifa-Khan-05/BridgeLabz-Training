// Polymorphism: different certificate format
public class AdvancedCourse extends Course {

    public AdvancedCourse(String title, Instructor instructor, String[] modules) {
        super(title, instructor, modules);
    }

    public void generateAdvancedCertificate(Student student) {
        System.out.println("Advanced Certificate awarded to " + student.name);
    }
}
