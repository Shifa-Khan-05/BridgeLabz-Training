
//School Bus Attendance System 🚍
//Track 10 students' presence.
//● Use for-each loop on names.
//● Ask "Present or Absent?"
//● Print total present and absent counts.
// Attendance System 
import java.util.*;

class AttendanceSystem {

    public static void attendancesystem() {

        Scanner scanner = new Scanner(System.in);

        int students = 10;
        String s[] = new String[10];
        int ind = 0;

        System.out.println("====================================");
        System.out.println(" STUDENT ATTENDANCE SYSTEM");
        System.out.println("====================================\n");

        // Taking student names
        while (students > 0) {
            System.out.print("Enter name of student " + (ind + 1) + ": ");
            String name = scanner.next();
            s[ind] = name;
            students--;
            ind++;
        }

        int count = 0;

        System.out.println("\n Time for Attendance (yes / no)");
        System.out.println("--------------------------------");

        // Attendance check
        for (int i = 0; i < s.length; i++) {
            System.out.print(s[i] + " present? : ");
            String present = scanner.next();

            if (present.equalsIgnoreCase("yes")) {
                count++;
            }
        }

        System.out.println("\n====================================");
        System.out.println(" ATTENDANCE SUMMARY");
        System.out.println("====================================");
        System.out.println("Total Number of Students : 10");
        System.out.println("Students Present         : " + count);
        System.out.println("Students Absent          : " + (10 - count));
        System.out.println("====================================");

        scanner.close();
    }

    public static void main(String[] args) {
        attendancesystem();
    }
}
