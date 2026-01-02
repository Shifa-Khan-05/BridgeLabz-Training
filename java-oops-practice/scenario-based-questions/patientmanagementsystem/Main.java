
import java.util.*;
class Main{
    
	public static void main(String[] args) {

        Patient p1 = new InPatient("Rahul", 35, "Diabetes", 5);
        Patient p2 = new OutPatient("Anita", 28);

        Doctor d1 = new Doctor("Dr. Sharma", "Cardiologist");

        Bill bill = new Bill(10000);

        // Polymorphism
        p1.displayInfo();
        System.out.println();

        p2.displayInfo();
        System.out.println();

        d1.displayInfo();
        System.out.println();

        System.out.println("Total Bill Amount: " + bill.calculatePayment());
    }

}