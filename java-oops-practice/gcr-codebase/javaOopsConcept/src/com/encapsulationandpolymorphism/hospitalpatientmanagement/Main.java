package com.encapsulationandpolymorphism.hospitalpatientmanagement;
import java.util.*;

public class Main {
	public static void main(String[] args) {

        List<Patient> patients = new ArrayList<>();

        Patient p1 = new InPatient(101, "Amit", 45, 5, 3000);
        Patient p2 = new OutPatient(102, "Riya", 28, 800);

        p1.addRecord("Surgery completed");
        p2.addRecord("General consultation");

        patients.add(p1);
        patients.add(p2);

        for (Patient p : patients) {
            p.getPatientDetails();
            p.viewRecords();
            System.out.println("------------------------");
        }
    }
}
