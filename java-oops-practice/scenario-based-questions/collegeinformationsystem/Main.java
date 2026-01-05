

import java.util.*;
public class Main {
	

	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        System.out.println("Enter Faculty Details");
	        System.out.print("Faculty ID: ");
	        int fid = sc.nextInt();
	        sc.nextLine();

	        System.out.print("Faculty Name: ");
	        String fname = sc.nextLine();

	        System.out.print("Faculty Email: ");
	        String femail = sc.nextLine();

	        System.out.print("Faculty Department: ");
	        String dept = sc.nextLine();

	        Faculty faculty = new Faculty(fid, fname, femail, dept);

	        System.out.println("\nEnter Student Details");
	        System.out.print("Student ID: ");
	        int sid = sc.nextInt();
	        sc.nextLine();

	        System.out.print("Student Name: ");
	        String sname = sc.nextLine();

	        System.out.print("Student Email: ");
	        String semail = sc.nextLine();

	        System.out.print("Enter number of subjects: ");
	        int n = sc.nextInt();

	        int[] grades = new int[n];
	        System.out.println("Enter grades:");
	        for (int i = 0; i < n; i++) {
	            grades[i] = sc.nextInt();
	        }

	        Student student = new Student(sid, sname, semail, grades);

	        sc.nextLine();
	        System.out.print("\nEnter Course Name: ");
	        String courseName = sc.nextLine();

	        Course course = new Course(courseName, faculty);

	        student.enrollCourse(courseName);
	        course.addStudent(student);

	        System.out.println("\n--- Student Details ---");
	        student.printDetails();

	        System.out.println("\n--- Faculty Details ---");
	        faculty.printDetails();

	        System.out.println("\n--- Course Details ---");
	        course.showCourseDetails();

	        sc.close();
	    }
	

}
