package com.tree.binarysearchtree.universitydigitalrecordsystem;

public class Main {
	public static void main(String[] args) {

        StudentBst bst = new StudentBst();

        // 🔹 Insertion
        bst.insert(new Student(101, "Ayaan", "CSE"));
        bst.insert(new Student(105, "Meera", "ECE"));
        bst.insert(new Student(103, "Ravi", "ME"));
        bst.insert(new Student(102, "Sara", "IT"));

        // 🔹 Display sorted student list
        System.out.println("Student Records (Sorted by Roll No):");
        bst.displayInOrder();

        // 🔹 Search
        System.out.println("\nSearching Roll No 103:");
        Student s = bst.search(103);
        if (s != null)
            System.out.println("Found: " + s.name + ", " + s.department);
        else
            System.out.println("Student not found");

        // 🔹 Deletion
        System.out.println("\nDeleting Roll No 102");
        bst.delete(102);

        System.out.println("\nUpdated Student Records:");
        bst.displayInOrder();
    }
}
