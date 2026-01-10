import java.util.Scanner;

public class SkillForgeApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // -------- Instructor Details --------
        System.out.print("Enter Instructor Name: ");
        String instructorName = sc.nextLine();

        System.out.print("Enter Instructor Email: ");
        String instructorEmail = sc.nextLine();

        Instructor instructor = new Instructor(instructorName, instructorEmail);

        // -------- Course Details --------
        System.out.print("Enter Course Title: ");
        String courseTitle = sc.nextLine();

        Course course = new Course(courseTitle, instructor);

        // -------- Student Details --------
        System.out.print("Enter Student Name: ");
        String studentName = sc.nextLine();

        System.out.print("Enter Student Email: ");
        String studentEmail = sc.nextLine();

        Student student = new Student(studentName, studentEmail);

        // -------- Progress Tracking --------
        System.out.print("Enter completed modules: ");
        int completedModules = sc.nextInt();

        student.updateProgress(completedModules, course.getTotalModules());

        // -------- Grading --------
        System.out.print("Enter marks obtained: ");
        int marksObtained = sc.nextInt();

        System.out.print("Enter total marks: ");
        int totalMarks = sc.nextInt();

        student.calculateScore(marksObtained, totalMarks);

        // -------- Certification --------
        student.generateCertificate();

        // -------- Read-only Course Reviews --------
        System.out.println("Course Reviews: " + course.getReviewCount());

        sc.close();
    }
}
