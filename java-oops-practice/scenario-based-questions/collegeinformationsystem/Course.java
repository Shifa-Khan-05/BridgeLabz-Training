
import java.util.ArrayList;

class Course {

    String courseName;
    Faculty faculty;
    ArrayList<Student> students = new ArrayList<>();

    Course(String courseName, Faculty faculty) {
        this.courseName = courseName;
        this.faculty = faculty;
    }

    void addStudent(Student s) {
        students.add(s);
    }

    void showCourseDetails() {
        System.out.println("Course: " + courseName);
        System.out.println("Faculty: " + faculty.name);
        System.out.println("Enrolled Students:");
        for (Student s : students)
            System.out.println("- " + s.name);
    }
}
